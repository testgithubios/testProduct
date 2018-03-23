package com.bosch.wrd.service;

import java.util.ArrayList;
import java.util.LinkedList;
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

import com.bosch.wrd.dao.PortfolioRepository;
import com.bosch.wrd.dao.ReleaseRepository;
import com.bosch.wrd.dto.Converter;
import com.bosch.wrd.dto.PortfolioConverter;
import com.bosch.wrd.dto.PortfolioDto;
import com.bosch.wrd.entity.entityImpl.Portfolio;
import com.bosch.wrd.entity.entityImpl.Releases;
import com.bosch.wrd.util.DateUtil;
import com.bosch.wrd.util.ExcelUtil;

@RestController
@RequestMapping(value = "/api/porfolio")
public class PortfolioService extends BaseService<Portfolio, Long> {
	private static final Logger LOG = Logger.getLogger(PortfolioService.class);

	private Converter<PortfolioDto, Portfolio> converter = new PortfolioConverter();

	public PortfolioService(PortfolioRepository dao) {
		super();
		this.dao = dao;
	}

	@Autowired
	private ReleaseRepository releasesRepository;

	@RequestMapping(value = "/findByTypeOfChange/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<List<PortfolioDto>> findByTypeOfChange(@PathVariable String id) {
		LinkedList<PortfolioDto> dtos = new LinkedList<>();
		List<Portfolio> portfolios = ((PortfolioRepository) this.dao).findByTypeOfChange(id);
		List<Releases> releases = releasesRepository.findByHcpAndTypeOfChange(id);
		portfolios.forEach(p -> {
			PortfolioDto newDto = converter.convertFromEntity(p);
			updateFromReleases(newDto, p.getReleases(), id);
			dtos.add(newDto);
		});
		releases.forEach(r -> {
			PortfolioDto newDto = null;
			if (!checkReleasesNotInPortfolio(r, portfolios)) {
				newDto = new PortfolioDto();
				updateFromReleases(newDto, r, id);
				dtos.add(newDto);
			}
		});
		return new ResponseEntity<>(dtos, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/findByOther", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<List<PortfolioDto>> findByOther() {
		List<PortfolioDto> dtos = new ArrayList<>();
		List<Portfolio> portfolios = ((PortfolioRepository) this.dao).findByOther();
		List<Releases> releases = releasesRepository.findByHcpAndOther();
		portfolios.forEach(p -> {
			PortfolioDto newDto = converter.convertFromEntity(p);
			updateFromReleases(newDto, p.getReleases(), null);
			dtos.add(newDto);
		});
		releases.forEach(r -> {
			PortfolioDto newDto = null;
			if (!checkReleasesNotInPortfolio(r, portfolios)) {
				newDto = new PortfolioDto();
				updateFromReleases(newDto, r, null);
				dtos.add(newDto);
			}
		});
		return new ResponseEntity<>(dtos, HttpStatus.OK);
	}
	
	private void updateFromReleases(PortfolioDto newDto, Releases r, String id) {
		newDto.setProjectOwner(r.getPic());
		newDto.setHcpPjmCoordinator(r.getPic());
		newDto.setTbpSlppPJM(r.getCounterPart());
		newDto.setProjectName(ExcelUtil.getProjectName(r));
		newDto.setTypeOfChange(id);
		newDto.setReleasesId(r.getNr());
		newDto.setPlannedStartTime(DateUtil.convertDate(r.getPlannedStartTime(), DateUtil.DATE_FORMAT));
		newDto.setPlannedSop(DateUtil.convertDate(r.getPlannedSop(), DateUtil.DATE_FORMAT));
		newDto.setPlannedISR(DateUtil.convertDate(r.getPlannedIsr(), DateUtil.DATE_FORMAT));
		newDto.setDispatchFromHcpSite(DateUtil.convertDate(r.getDispatchFromPlantActual(), DateUtil.DATE_FORMAT));
		newDto.setCustomer(r.getObjCustomer() != null ? r.getObjCustomer().getName() : null);
		newDto.setAlElLl(r.getLine());
	}
	
	private boolean checkReleasesNotInPortfolio(Releases r, List<Portfolio> portfolios) {
		boolean isExit = false;
		for (Portfolio p : portfolios) {
			if (r.getNr() == p.getReleases().getNr()) {
				isExit = true;
				break;
			}
		}
		return isExit;
	}
	
	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<List<PortfolioDto>> saveOrUpdate(@RequestBody List<PortfolioDto> list) {

		try {
			LinkedList<PortfolioDto> dtos = new LinkedList<>();
			list.forEach(p -> {
				Portfolio portfolio = converter.convertFromDto(p);
				Releases releases = releasesRepository.findOne(p.getReleasesId());
				portfolio.setReleases(releases);
				Portfolio newObj = this.dao.save(portfolio);				
				PortfolioDto dto = converter.convertFromEntity(newObj);
				if (releases != null) {
					releases.setPlannedStartTime(DateUtil.stringToDate(p.getPlannedStartTime(), DateUtil.DATE_FORMAT));
					releases.setPlannedSop(DateUtil.stringToDate(p.getPlannedSop(), DateUtil.DATE_FORMAT));
					releases.setPlannedIsr(DateUtil.stringToDate(p.getPlannedISR(), DateUtil.DATE_FORMAT));
					Releases r = releasesRepository.save(releases);
					
					dto.setReleasesId(r.getNr());
					dto.setPlannedStartTime(DateUtil.convertDate(r.getPlannedStartTime(), DateUtil.DATE_FORMAT));
					dto.setPlannedSop(DateUtil.convertDate(r.getPlannedSop(), DateUtil.DATE_FORMAT));
					dto.setPlannedISR(DateUtil.convertDate(r.getPlannedIsr(), DateUtil.DATE_FORMAT));
					dto.setDispatchFromHcpSite(DateUtil.convertDate(r.getDispatchFromPlantActual(), DateUtil.DATE_FORMAT));
					dto.setCustomer(r.getObjCustomer() != null ? r.getObjCustomer().getName() : null);
					dto.setProjectName(ExcelUtil.getProjectName(r));
					dto.setHcpPjmCoordinator(r.getPic());
					dto.setTbpSlppPJM(r.getCounterPart());
				}
				dtos.add(dto);
			});
			return new ResponseEntity<>(dtos, HttpStatus.OK);
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}
		return new ResponseEntity<>(HttpStatus.FORBIDDEN);
	}

}
