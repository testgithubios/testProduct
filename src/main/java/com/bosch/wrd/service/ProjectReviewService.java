/**
 * 
 */
package com.bosch.wrd.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.InvalidDataAccessApiUsageException;
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

import com.bosch.wrd.dao.ProjectReviewRepository;
import com.bosch.wrd.dao.ReleaseRepository;
import com.bosch.wrd.dto.Converter;
import com.bosch.wrd.dto.ProjectReviewConverter;
import com.bosch.wrd.dto.ProjectReviewDto;
import com.bosch.wrd.entity.entityImpl.ProjectReview;
import com.bosch.wrd.entity.entityImpl.Releases;
import com.bosch.wrd.util.DateUtil;

/**
 * @author hnd1hc
 *
 */
@RestController
@RequestMapping(value = "/api/projectReview")
@CrossOrigin
public class ProjectReviewService extends BaseService<ProjectReview, Long> {
	
	private static final Logger LOG = Logger.getLogger(ProjectReviewService.class);

	@Autowired
	private ReleaseRepository releaseRepository;

	private static final String CURRENT_HIGHLIGHTS_TITLE = "Current highlights";
	private static final String ACTIVITIES_TITLE = "Activities planned next weeks";
	private static final String RISKS_ISSUES_TITLE = "Risks/Issues (Quality, Costs, Planning)";
	private static final String MITIGATION_TITLE = "Mitigation/Support needed";
	private static final String DATE_FORMAT2 = "MMM.yyyy";
	private static final String DATE_FORMAT1 = "dd-MMM";

	private Converter<ProjectReviewDto, ProjectReview> converter = new ProjectReviewConverter();

	public ProjectReviewService(ProjectReviewRepository dao) {
		super();
		this.dao = dao;
	}

	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin
	public @ResponseBody ResponseEntity<ProjectReviewDto> saveOrUpdate(@RequestBody ProjectReviewDto dto) {
		
		try {
			ProjectReview projectReviews = convertToEntity(dto);
			Releases rel = releaseRepository.findByNr(dto.getReleasesId());
			if (null != rel) {
				rel.setProjectHighlight(dto.getCurrentHighLightData());
				releaseRepository.save(rel);
			}

			projectReviews.setRelease(rel);

			ProjectReview newProjectReviews = this.dao.save(projectReviews);
			ProjectReviewDto newDto = convertToDto(newProjectReviews);
			newDto.setReleasesId(dto.getReleasesId());
			return new ResponseEntity<>(newDto, HttpStatus.CREATED);
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}
		
		return new ResponseEntity<>(HttpStatus.FORBIDDEN);
	}

	@RequestMapping(value = "/findByReleaseNr/{nr}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<List<ProjectReviewDto>> findByProjectReview_Nr(@PathVariable Long nr)
			throws InvalidDataAccessApiUsageException {

		List<ProjectReviewDto> dtos = new ArrayList<>();
		List<ProjectReview> projectReviews = ((ProjectReviewRepository) dao).findByReleases_Nr(nr);
		Releases releases = (Releases) releaseRepository.findByNr(nr);

		projectReviews.forEach(pro -> {
			ProjectReviewDto dto = convertToDto(pro);

			Date dateCreated = DateUtil.stringToDate(dto.getDateCreated(), DateUtil.DATE_FORMAT);
			Date dateUpdated = DateUtil.stringToDate(dto.getDateUpdated(), DateUtil.DATE_FORMAT);

			dto.setActivitiesPlanned(ACTIVITIES_TITLE);
			dto.setCurrentHighLight(CURRENT_HIGHLIGHTS_TITLE);
			dto.setRisks(RISKS_ISSUES_TITLE);
			dto.setMitigation(MITIGATION_TITLE);
			dto.setSubTitle1(DateUtil.convertDate(releases.getRbSopActual(), DATE_FORMAT2));
			dto.setDateCreated(DateUtil.convertDate(dateCreated, DATE_FORMAT1));
			dto.setDateUpdated(DateUtil.convertDate(dateUpdated, DATE_FORMAT1));
			dto.setCurrentHighLightData(releases.getProjectHighlight());
			dtos.add(dto);
		});
		
		if ((projectReviews == null || projectReviews.size() == 0) && releases != null) {
			ProjectReviewDto dto = new ProjectReviewDto();
			dto.setCurrentHighLightData(releases.getProjectHighlight());
			dto.setSubTitle1(DateUtil.convertDate(releases.getRbSopActual(), DATE_FORMAT2));
			dto.setReleasesId(releases.getNr());
			dtos.add(dto);
		}

		return new ResponseEntity<>(dtos, HttpStatus.OK);
	}

	private ProjectReviewDto convertToDto(ProjectReview projectReview) {
		ProjectReviewDto dto = converter.convertFromEntity(projectReview);

		String current_highlights = null == projectReview.getCurrentHighlights() ? null
				: projectReview.getCurrentHighlights();
		dto.setCurrentHighLightData(current_highlights);

		String risk_issues = null == projectReview.getRisksIssues() ? null : projectReview.getRisksIssues();
		dto.setRisksData(risk_issues);

		String activities_plans = null == projectReview.getActivitiesPlanned() ? null
				: projectReview.getActivitiesPlanned();
		dto.setActivitiesPlannedData(activities_plans);

		String mitigation = null == projectReview.getMitigation() ? null : projectReview.getMitigation();
		dto.setMitigationData(mitigation);

		String dateCreated = null == projectReview.getDateCreated() ? null : projectReview.getDateCreated().toString();
		dto.setDateCreated(dateCreated);

		String dateUpdated = null == projectReview.getDateUpdated() ? null : projectReview.getDateUpdated().toString();
		dto.setDateUpdated(dateUpdated);
		
		String coordinator = null == projectReview.getCoordinator() ? null : projectReview.getCoordinator();
		dto.setCoordinator(coordinator);

		dto.setReleasesId(projectReview.getReleases().getNr());
		return dto;
	}

	private ProjectReview convertToEntity(ProjectReviewDto dto) {

		ProjectReview pro = converter.convertFromDto(dto);

		/*
		 * if (dto.getId() != null) { ProjectReview oldPro =
		 * dao.findOne(dto.getId()); if (oldPro != null) {
		 * pro.setRelease(oldPro.getId()); } else { pro.setRelease(null); } }
		 */

		String current_highlights = null == dto.getCurrentHighLightData() ? null : dto.getCurrentHighLightData();
		pro.setCurrentHighlights(current_highlights);

		String risk_issues = null == dto.getRisksData() ? null : dto.getRisksData();
		pro.setRisksIssues(risk_issues);

		String activities_plans = null == dto.getActivitiesPlannedData() ? null : dto.getActivitiesPlannedData();
		pro.setActivitiesPlanned(activities_plans);

		String mitigation = null == dto.getMitigationData() ? null : dto.getMitigationData();
		pro.setMitigation(mitigation);

		Date dateCreated = null == dto.getDateCreated() ? null
				: DateUtil.stringToDate(dto.getDateCreated(), DateUtil.DATE_FORMAT);
		pro.setDateCreated(dateCreated);

		Date dateUpdated = null == dto.getDateUpdated() ? null
				: DateUtil.stringToDate(dto.getDateUpdated(), DateUtil.DATE_FORMAT);
		pro.setDateUpdated(dateUpdated);
		
		String coordinator = null == dto.getCoordinator() ? null : dto.getCoordinator();
		pro.setCoordinator(coordinator);

		return pro;
	}
}
