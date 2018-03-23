/**
 * 
 */
package com.bosch.wrd.service;

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

import com.bosch.wrd.dao.ReleaseRepository;
import com.bosch.wrd.dao.StearingCommitteeRepository;
import com.bosch.wrd.dto.Converter;
import com.bosch.wrd.dto.StearingCommiteeConverter;
import com.bosch.wrd.dto.StearingCommiteeDto;
import com.bosch.wrd.entity.entityImpl.Releases;
import com.bosch.wrd.entity.entityImpl.StearingCommittee;
import com.bosch.wrd.util.DateUtil;

@RestController
@RequestMapping(value = "/api/stearingCommittee")
@CrossOrigin
public class StearingCommitteeService extends BaseService<StearingCommittee, Long> {
	
	private static final Logger LOG = Logger.getLogger(StearingCommitteeService.class);
	
	public StearingCommitteeService(StearingCommitteeRepository dao) {
		super();
		this.dao = dao;
	}
	
	@Autowired
	private ReleaseRepository releaseRepository;
	
	private Converter<StearingCommiteeDto, StearingCommittee> converter = new StearingCommiteeConverter();
	
	@RequestMapping(value = "/findByReleaseNr/{nr}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<StearingCommiteeDto> findByNr(@PathVariable Long nr) {
		try {
			List<StearingCommittee> stearingCommittees = ((StearingCommitteeRepository) dao).findByReleases_Nr(nr);
			Releases releases = releaseRepository.findByNr(nr);

			StearingCommiteeDto dto = new StearingCommiteeDto();
			if(stearingCommittees !=null && stearingCommittees.size() > 0) {
				dto = converter.convertFromEntity(stearingCommittees.get(0));
			}
			
			dto.setQgPlant1(DateUtil.convertDate(releases.getQg1(), DateUtil.DATE_FORMAT));
			dto.setQgPlant2(DateUtil.convertDate(releases.getQg2(), DateUtil.DATE_FORMAT));
			dto.setQgPlant3(DateUtil.convertDate(releases.getQg3(), DateUtil.DATE_FORMAT));
			dto.setQgPlant4(DateUtil.convertDate(releases.getQg4(), DateUtil.DATE_FORMAT));
			dto.setQgPlant5(DateUtil.convertDate(releases.getQg5(), DateUtil.DATE_FORMAT));
			dto.setRbSop(DateUtil.convertDate(releases.getRbSopActual(), DateUtil.DATE_FORMAT));
			dto.setProjectHighlightReason(releases.getProjectHighlight());
			dto.setRealeasesId(releases.getNr());

			return new ResponseEntity<>(dto, HttpStatus.OK);
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}
		return new ResponseEntity<>(HttpStatus.FORBIDDEN);
	}
	
	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin
	public @ResponseBody ResponseEntity<StearingCommiteeDto> saveOrUpdate(@RequestBody StearingCommiteeDto dto) {
		try {
			StearingCommittee sc =  converter.convertFromDto(dto);
			Releases release = releaseRepository.findByNr(new Long(dto.getRealeasesId()));
			release.setRbSopActual(DateUtil.stringToDate(dto.getRbSop(), DateUtil.DATE_FORMAT));
			release.setProjectHighlight(dto.getProjectHighlightReason());
			releaseRepository.save(release);
			sc.setReleases(release);

			StearingCommiteeDto newDto = converter.convertFromEntity(this.dao.save(sc));
			newDto.setRealeasesId(dto.getRealeasesId());
			
			return new ResponseEntity<>(newDto, HttpStatus.CREATED);
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}
		return new ResponseEntity<>(HttpStatus.FORBIDDEN);
	}
	
}
