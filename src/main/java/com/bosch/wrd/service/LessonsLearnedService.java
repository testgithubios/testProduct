/**
 * 
 */
package com.bosch.wrd.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.wrd.dao.LessonsLearnedRepository;
import com.bosch.wrd.dao.ReleaseRepository;
import com.bosch.wrd.dto.Converter;
import com.bosch.wrd.dto.LessonsLearnedConverter;
import com.bosch.wrd.dto.LessonsLearnedDto;
import com.bosch.wrd.entity.entityImpl.LessonsLearned;
import com.bosch.wrd.entity.entityImpl.Releases;

@RestController
@RequestMapping(value = "/api/lessonsLearned")
@CrossOrigin
public class LessonsLearnedService extends BaseService<LessonsLearned, Long> {
	private static final Logger LOG = Logger.getLogger(LessonsLearnedService.class);

	public LessonsLearnedService(LessonsLearnedRepository dao) {
		super();
		this.dao = dao;
	}
	
	private Converter<LessonsLearnedDto, LessonsLearned> converter = new LessonsLearnedConverter();
	
	@Autowired
	private ReleaseRepository releaseRepository;
	
	@RequestMapping(value = "/findByReleaseNr/{nr}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<List<LessonsLearnedDto>> findByReleaseNr(@PathVariable Long nr) {
		try {
			List<LessonsLearned> lessonsLearneds  = ((LessonsLearnedRepository) dao).findByReleases_Nr(nr);
			List<LessonsLearnedDto> dtos = new ArrayList<LessonsLearnedDto>();
			
			lessonsLearneds.forEach(l -> {
				LessonsLearnedDto dto = converter.convertFromEntity(l);
				dto.setRealeasesId(nr);
				dtos.add(dto);
			});
			return new ResponseEntity<>(dtos, HttpStatus.OK);
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}
		return new ResponseEntity<>(HttpStatus.FORBIDDEN);
	}
	
	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<List<LessonsLearnedDto>> saveOrUpdate(@RequestBody List<LessonsLearnedDto> lessonsLearnedDtos) {
		try {
			List<LessonsLearnedDto> dtos = new ArrayList<>();
			
			lessonsLearnedDtos.forEach(l -> {
				LessonsLearned lessonsLearned = converter.convertFromDto(l);
				Releases releases = releaseRepository.findOne(l.getRealeasesId());
				lessonsLearned.setReleases(releases);
				
				LessonsLearnedDto newDto = converter.convertFromEntity(this.dao.save(lessonsLearned));
				newDto.setRealeasesId(l.getRealeasesId());
				dtos.add(newDto);
			});
			return new ResponseEntity<>(dtos, HttpStatus.CREATED);
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}
		return new ResponseEntity<>(HttpStatus.FORBIDDEN);
	}
}
