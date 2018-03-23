package com.bosch.wrd.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.wrd.dao.EtpTestingRepository;
import com.bosch.wrd.dao.ReleaseRepository;
import com.bosch.wrd.dao.TestingCapacityDetailRepository;
import com.bosch.wrd.dao.TestingCapacityRepository;
import com.bosch.wrd.dto.Converter;
import com.bosch.wrd.dto.TestingCapacityConverter;
import com.bosch.wrd.dto.TestingCapacityDetailConverter;
import com.bosch.wrd.dto.TestingCapacityDetailDto;
import com.bosch.wrd.dto.TestingCapacityDto;
import com.bosch.wrd.entity.entityImpl.Releases;
import com.bosch.wrd.entity.entityImpl.TestingCapacity;
import com.bosch.wrd.entity.entityImpl.TestingCapacityDetail;
import com.bosch.wrd.util.DateUtil;
import com.bosch.wrd.util.ExcelUtil;


@RestController
@RequestMapping(value = "/api/testingCapacity")
public class TestingCapacityService extends BaseService<TestingCapacity, Long> {
	private static final Logger LOG = Logger.getLogger(TestingCapacityService.class);
	
	@Autowired
	private EtpTestingRepository testingRepository;
	@Autowired
	private TestingCapacityDetailRepository testingCapacityDetailRepository;
	@Autowired
	private ReleaseRepository releaseRepository;
	
	private Converter<TestingCapacityDto, TestingCapacity> converter = new TestingCapacityConverter();
	private Converter<TestingCapacityDetailDto, TestingCapacityDetail> detailConverter = new TestingCapacityDetailConverter();

	public TestingCapacityService(TestingCapacityRepository dao) {
		super();
		this.dao = dao;
	}
	
	@RequestMapping(value = "/findByEtpTestingId/{id}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<List<TestingCapacityDto>> findByEtpTestingId(@PathVariable String id) {
		try {
			List<Releases> list = testingRepository.findByEtpTestingId(id);
			return new ResponseEntity<>(getLists(list), HttpStatus.OK);
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}
		return new ResponseEntity<>(HttpStatus.FORBIDDEN);
	}
	
	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<List<TestingCapacityDto>> saveOrUpdate(@RequestBody List<TestingCapacityDto> dtos) {
		try {
			return new ResponseEntity<>(getResults(dtos), HttpStatus.CREATED);
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}
		return new ResponseEntity<>(HttpStatus.FORBIDDEN);
	}
	
	private List<TestingCapacityDto> getLists(List<Releases> list) {
		List<TestingCapacityDto> dtos = new ArrayList<>();
		list.forEach(r -> {
			List<TestingCapacity> capacities = ((TestingCapacityRepository) this.dao).findByReleases_Nr(r.getNr());
			capacities.forEach(c -> {
				TestingCapacityDto dto = converter.convertFromEntity(c);
				dto.setRealeasesId(r.getNr());
				dto.setProjectName(ExcelUtil.getProjectName(r));
				dto.setPlannedStartTime(DateUtil.convertDate(r.getPlannedStartTime(), DateUtil.DATE_FORMAT));
				dto.setPlannedSop(DateUtil.convertDate(r.getPlannedSop(), DateUtil.DATE_FORMAT));
				dto.setPlannedIsr(DateUtil.convertDate(r.getPlannedIsr(), DateUtil.DATE_FORMAT));
				
				List<TestingCapacityDetailDto> testingDates = new ArrayList<>();
				c.getCapacityDetails().forEach(d -> {
					TestingCapacityDetailDto detailDto = detailConverter.convertFromEntity(d);
					detailDto.setReadOnly(DateUtil.isDateExpired(d.getDateOfNotes()) ? true : false);
					testingDates.add(detailDto);
				});
				TestingCapacityDetailDto[] capacityDetailDtos = new TestingCapacityDetailDto[testingDates.size()];
				capacityDetailDtos = testingDates.toArray(capacityDetailDtos);
				dto.setTestingDates(capacityDetailDtos);
				dtos.add(dto);
			});
			
			if (capacities == null || capacities.size() == 0) {
				TestingCapacityDto dto = new TestingCapacityDto();
				ExcelUtil.setDataCapacityByReleases(r, dto);
				dtos.add(dto);
			}
		});
		return dtos;
	}
	
	private List<TestingCapacityDto> getResults(List<TestingCapacityDto> dtos) {
		List<TestingCapacityDto> newDtos = new ArrayList<>();
		
		dtos.forEach(dto -> {
			Releases r = null;
			if (dto.getRealeasesId() != null) {
				r = releaseRepository.findOne(dto.getRealeasesId());
				r.setPlannedStartTime(DateUtil.stringToDate(dto.getPlannedStartTime(), DateUtil.DATE_FORMAT));
				r.setPlannedSop(DateUtil.stringToDate(dto.getPlannedSop(), DateUtil.DATE_FORMAT));
				r.setPlannedIsr(DateUtil.stringToDate(dto.getPlannedIsr(), DateUtil.DATE_FORMAT));
				releaseRepository.save(r);
			}
			
			TestingCapacity oldTestingCapacity = converter.convertFromDto(dto);
			oldTestingCapacity.setReleases(r);
			
			TestingCapacity newTestingCapacity = this.dao.save(oldTestingCapacity);
			TestingCapacityDto newTestingCapacityDto = converter.convertFromEntity(this.dao.save(oldTestingCapacity));
			ExcelUtil.setDataCapacityByReleases(r, newTestingCapacityDto);
			
			List<TestingCapacityDetailDto> testingDates = new ArrayList<>();
			for (TestingCapacityDetailDto detailDto : dto.getTestingDates()) {
				TestingCapacityDetail capacityDetail = detailConverter.convertFromDto(detailDto);
				capacityDetail.setTestingCapacity(newTestingCapacity);
				
				TestingCapacityDetailDto newCapacityDetailDto = detailConverter
						.convertFromEntity(testingCapacityDetailRepository.save(capacityDetail));
				newCapacityDetailDto.setReadOnly(DateUtil.isDateExpired(capacityDetail.getDateOfNotes()) ? true : false);
				testingDates.add(newCapacityDetailDto);
			}
			
			TestingCapacityDetailDto[] capacityDetailDtos = new TestingCapacityDetailDto[testingDates.size()];
			capacityDetailDtos = testingDates.toArray(capacityDetailDtos);
			newTestingCapacityDto.setTestingDates(capacityDetailDtos);
			newDtos.add(newTestingCapacityDto);
		});
		return newDtos;
	}
}
