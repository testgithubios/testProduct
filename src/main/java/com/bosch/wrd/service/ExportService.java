package com.bosch.wrd.service;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.wrd.constraints.TestingType;
import com.bosch.wrd.dao.EtpTestingRepository;
import com.bosch.wrd.dao.LessonsLearnedRepository;
import com.bosch.wrd.dao.PortfolioRepository;
import com.bosch.wrd.dao.ProjectReviewRepository;
import com.bosch.wrd.dao.ReleaseRepository;
import com.bosch.wrd.dao.StearingCommitteeRepository;
import com.bosch.wrd.dao.TestingCapacityDetailRepository;
import com.bosch.wrd.dao.TestingCapacityRepository;
import com.bosch.wrd.dao.TypeOfChangeRepository;
import com.bosch.wrd.dto.Converter;
import com.bosch.wrd.dto.LessonsLearnedConverter;
import com.bosch.wrd.dto.LessonsLearnedDto;
import com.bosch.wrd.dto.LocationConverter;
import com.bosch.wrd.dto.LocationDto;
import com.bosch.wrd.dto.PortfolioConverter;
import com.bosch.wrd.dto.PortfolioDto;
import com.bosch.wrd.dto.ProjectReviewConverter;
import com.bosch.wrd.dto.ProjectReviewDto;
import com.bosch.wrd.dto.ReleasesConverter;
import com.bosch.wrd.dto.ReleasesDto;
import com.bosch.wrd.dto.StearingCommiteeConverter;
import com.bosch.wrd.dto.StearingCommiteeDto;
import com.bosch.wrd.dto.TestingCapacityConverter;
import com.bosch.wrd.dto.TestingCapacityDetailConverter;
import com.bosch.wrd.dto.TestingCapacityDetailDto;
import com.bosch.wrd.dto.TestingCapacityDto;
import com.bosch.wrd.entity.entityImpl.LessonsLearned;
import com.bosch.wrd.entity.entityImpl.Portfolio;
import com.bosch.wrd.entity.entityImpl.ProjectReview;
import com.bosch.wrd.entity.entityImpl.Releases;
import com.bosch.wrd.entity.entityImpl.StearingCommittee;
import com.bosch.wrd.entity.entityImpl.TestingCapacity;
import com.bosch.wrd.entity.entityImpl.TestingCapacityDetail;
import com.bosch.wrd.entity.entityImpl.TypeOfChange;
import com.bosch.wrd.export.excel.LessonsLearnedXLSX;
import com.bosch.wrd.export.excel.MilestoneXLSX;
import com.bosch.wrd.export.excel.SelectedReleasesXLSX;
import com.bosch.wrd.export.excel.TestingCapacityXLSX;
import com.bosch.wrd.export.excel.api.ExcelWriter;
import com.bosch.wrd.export.excel.api.CustomWorkbook;
import com.bosch.wrd.export.excel.milestone.MilestoneRowsBuilder;
import com.bosch.wrd.export.excel.portfolio.PortfolioRowsBuilder;
import com.bosch.wrd.export.pdf.ExportPdf;
import com.bosch.wrd.export.pdf.ExportPdfImpl;
import com.bosch.wrd.util.DateUtil;
import com.bosch.wrd.util.ExcelUtil;
import com.bosch.wrd.util.FileUtil;
import com.itextpdf.text.DocumentException;

import com.bosch.wrd.entity.entityImpl.Location;

import javassist.expr.NewArray;

@RestController
@RequestMapping(value = "/api/")
public class ExportService {

	private Logger LOG = Logger.getLogger(ExportService.class);

	private static final String PDF_CONTENT_TYPE = "application/pdf";
	private static final String EXCEL_CONTENT_TYPE = "application/vnd.ms-excel";
	private static final String ATTACHMENT = "attachment";
	private static final String CURRENT_HIGHLIGHTS_TITLE = "Current highlights";
	private static final String ACTIVITIES_TITLE = "Activities planned next weeks";
	private static final String RISKS_ISSUES_TITLE = "Risks/Issues (Quality, Costs, Planning)";
	private static final String MITIGATION_TITLE = "Mitigation/Support needed";
	private static final String SOP_TITLE = "B-SOP: ";
	private static final String COORDINATOR_TITLE = "Coordinator: ";
	private static final String DATE_FORMAT2 = "MMM.yyyy";

	private ExportPdf exportPdf = new ExportPdfImpl();

	private HttpHeaders resHeaders = null;

	@Autowired
	private ProjectReviewRepository projectReviewRepository;
	@Autowired
	private ReleaseRepository releaseRepository;
	@Autowired
	private StearingCommitteeRepository committeeRepository;
	@Autowired
	private LessonsLearnedRepository lessonsLearnedRepository;
	@Autowired
	private EtpTestingRepository testingRepository;
	@Autowired
	private TestingCapacityRepository capacityRepository;
	@Autowired
	private TestingCapacityDetailRepository capacityDetailRepository;
	@Autowired
	private TypeOfChangeRepository typeOfChangeRepository;
	@Autowired
	private PortfolioRepository portfolioRepository;

	private Converter<ProjectReviewDto, ProjectReview> projectReviewCvt = new ProjectReviewConverter();
	private Converter<StearingCommiteeDto, StearingCommittee> stearingCvt = new StearingCommiteeConverter();
	private Converter<LessonsLearnedDto, LessonsLearned> lessonsLearnedCvt = new LessonsLearnedConverter();
	private Converter<TestingCapacityDto, TestingCapacity> testingCapacityCvt = new TestingCapacityConverter();
	private Converter<TestingCapacityDetailDto, TestingCapacityDetail> detailConverter = new TestingCapacityDetailConverter();
	private Converter<ReleasesDto, Releases> releasesCvt = new ReleasesConverter();
	private Converter<PortfolioDto, Portfolio> portfolioCvt = new PortfolioConverter();
	private Converter<LocationDto, Location> locCvt = new LocationConverter();

	@RequestMapping(value = "pdf/projectReview/{nr}", method = RequestMethod.GET, produces = PDF_CONTENT_TYPE)
	public ResponseEntity<InputStreamResource> downloadPdfProjectReview(@PathVariable Long nr) {
		try {
			List<ProjectReview> projectReviews = projectReviewRepository.findByReleases_Nr(nr);
			Releases releases = (Releases) releaseRepository.findByNr(nr);
			ProjectReviewDto dto = null;
			String coordinator = "";

			if (projectReviews != null && projectReviews.size() > 0) {
				dto = projectReviewCvt.convertFromEntity(projectReviews.get(0));
				coordinator = projectReviews.get(0).getCoordinator();
			} else {
				dto = new ProjectReviewDto();
			}

			dto.setActivitiesPlanned(ACTIVITIES_TITLE);
			dto.setCurrentHighLight(CURRENT_HIGHLIGHTS_TITLE);
			dto.setRisks(RISKS_ISSUES_TITLE);
			dto.setMitigation(MITIGATION_TITLE);
			dto.setSubTitle1(SOP_TITLE + DateUtil.convertDate(releases.getRbSopActual(), DATE_FORMAT2));
			dto.setSubTitle2(COORDINATOR_TITLE);
			dto.setCoordinator(coordinator);
			dto.setCurrentHighLightData(releases.getProjectHighlight());

			InputStream in = exportPdf.exportProjectTemplate(dto);

			resHeaders = new HttpHeaders();
			resHeaders.setContentType(MediaType.parseMediaType(PDF_CONTENT_TYPE));
			resHeaders.setContentLength(in.available());
			resHeaders.setContentDispositionFormData(ATTACHMENT, FileUtil.PROJECT_REVIEW_OUT);

			InputStreamResource isr = new InputStreamResource(in);
			return new ResponseEntity<InputStreamResource>(isr, resHeaders, HttpStatus.OK);
		} catch (IOException e) {
			LOG.error(e.getMessage());
		} catch (DocumentException e) {
			LOG.error(e.getMessage());
		}
		return new ResponseEntity<InputStreamResource>(HttpStatus.FORBIDDEN);
	}

	@RequestMapping(value = "pdf/stearingCommittee/{nr}", method = RequestMethod.GET, produces = PDF_CONTENT_TYPE)
	public ResponseEntity<InputStreamResource> downloadPdfStearingCommitee(@PathVariable Long nr) {
		try {
			List<StearingCommittee> committees = committeeRepository.findByReleases_Nr(nr);
			Releases releases = releaseRepository.findByNr(nr);
			StearingCommiteeDto dto = stearingCvt.convertFromEntity(committees.get(0));
			dto.setProjectHighlightReason(releases.getProjectHighlight());
			dto.setRbSop(DateUtil.convertDate(releases.getRbSopActual(), DateUtil.DATE_FORMAT));
			dto.setQgPlant1(DateUtil.convertDate(releases.getQg1(), DateUtil.DATE_FORMAT));
			dto.setQgPlant2(DateUtil.convertDate(releases.getQg2(), DateUtil.DATE_FORMAT));
			dto.setQgPlant3(DateUtil.convertDate(releases.getQg3(), DateUtil.DATE_FORMAT));
			dto.setQgPlant4(DateUtil.convertDate(releases.getQg4(), DateUtil.DATE_FORMAT));
			dto.setQgPlant5(DateUtil.convertDate(releases.getQg5(), DateUtil.DATE_FORMAT));

			InputStream in = exportPdf.exportStearingCommiteeTemplate(dto);
			resHeaders = new HttpHeaders();
			resHeaders.setContentType(MediaType.parseMediaType(PDF_CONTENT_TYPE));
			resHeaders.setContentLength(in.available());
			resHeaders.setContentDispositionFormData(ATTACHMENT, FileUtil.STEERING_COMMITTEE_OUT);

			InputStreamResource isr = new InputStreamResource(in);
			return new ResponseEntity<InputStreamResource>(isr, resHeaders, HttpStatus.OK);
		} catch (IOException e) {
			LOG.error(e.getMessage());
		} catch (DocumentException e) {
			LOG.error(e.getMessage());
		}
		return new ResponseEntity<InputStreamResource>(HttpStatus.FORBIDDEN);
	}

	@RequestMapping(value = "xlsx/lessonslearned/{nr}", method = RequestMethod.GET, produces = EXCEL_CONTENT_TYPE)
	public ResponseEntity<InputStreamResource> downloadXLSXLessonsLearned(@PathVariable Long nr) {
		try {
			LessonsLearnedXLSX xlsx = new LessonsLearnedXLSX(getListLessonsLearned(nr));
			InputStream in = xlsx.render();

			resHeaders = new HttpHeaders();
			resHeaders.setContentType(MediaType.parseMediaType(EXCEL_CONTENT_TYPE));
			resHeaders.setContentLength(in.available());
			resHeaders.setContentDispositionFormData(ATTACHMENT, FileUtil.LESSONS_LEARNED);

			InputStreamResource isr = new InputStreamResource(in);
			return new ResponseEntity<InputStreamResource>(isr, resHeaders, HttpStatus.OK);
		} catch (IOException e) {
			LOG.error(e.getMessage());
		}
		return new ResponseEntity<InputStreamResource>(HttpStatus.FORBIDDEN);
	}

	private List<LessonsLearnedDto> getListLessonsLearned(Long nr) {
		List<LessonsLearnedDto> dtos = new ArrayList<>();
		List<LessonsLearned> lessonsLearneds = lessonsLearnedRepository.findByReleases_Nr(nr);

		lessonsLearneds.forEach(l -> {
			LessonsLearnedDto dto = lessonsLearnedCvt.convertFromEntity(l);
			dtos.add(dto);
		});
		return dtos;
	}

	@RequestMapping(value = "xlsx/testingcapacity/{startDate}/{endDate}", method = RequestMethod.GET, produces = EXCEL_CONTENT_TYPE)
	public ResponseEntity<InputStreamResource> downloadXLSXTestingCapacity(@PathVariable String startDate,
			@PathVariable String endDate) {
		try {
			TestingCapacityXLSX capacityXLSX = new TestingCapacityXLSX(getListCapacityDtos(startDate, endDate));
			InputStream in = capacityXLSX.render();

			resHeaders = new HttpHeaders();
			resHeaders.setContentType(MediaType.parseMediaType(EXCEL_CONTENT_TYPE));
			resHeaders.setContentLength(in.available());
			resHeaders.setContentDispositionFormData(ATTACHMENT, FileUtil.TESTING_CAPACITY);

			InputStreamResource isr = new InputStreamResource(in);
			return new ResponseEntity<InputStreamResource>(isr, resHeaders, HttpStatus.OK);
		} catch (IOException e) {
			LOG.error(e.getMessage());
		}
		return new ResponseEntity<InputStreamResource>(HttpStatus.FORBIDDEN);
	}

	@RequestMapping(value = "xlsx/selectedReleases/{releasesIds}", method = RequestMethod.GET, produces = EXCEL_CONTENT_TYPE)
	public ResponseEntity<InputStreamResource> downloadXLSXSelectedReleases(@PathVariable List<Long> releasesIds) {
		try {
			List<ReleasesDto> dtos = new ArrayList<>();
			if (releasesIds != null && releasesIds.size() > 0) {
				List<Releases> releases = releaseRepository.getReleasesByNrs(releasesIds);
				releases.forEach(r -> {
					dtos.add(releasesCvt.convertFromEntity(r));
				});
			}

			SelectedReleasesXLSX xlsx = new SelectedReleasesXLSX(dtos);
			InputStream in = xlsx.render();

			resHeaders = new HttpHeaders();
			resHeaders.setContentType(MediaType.parseMediaType(EXCEL_CONTENT_TYPE));
			resHeaders.setContentLength(in.available());
			resHeaders.setContentDispositionFormData(ATTACHMENT, FileUtil.SELECTED_RELEASES);

			InputStreamResource isr = new InputStreamResource(in);
			return new ResponseEntity<InputStreamResource>(isr, resHeaders, HttpStatus.OK);
		} catch (IOException e) {
			LOG.error(e.getMessage());
		}
		return new ResponseEntity<InputStreamResource>(HttpStatus.FORBIDDEN);
	}

	@RequestMapping(value = "xlsx/milestone", method = RequestMethod.GET, produces = EXCEL_CONTENT_TYPE)
	public ResponseEntity<InputStreamResource> downloadXLSXMilestone() {
		try {
			Map<String, LinkedList<ReleasesDto>> map = new HashMap<>();
			LinkedList<ReleasesDto> dtos = new LinkedList<>();

			List<Releases> releases = releaseRepository.getListReleases();
			releases.forEach(r -> {
				dtos.add(releasesCvt.convertFromEntity(r));
				/*for (int i = 0; i <= r.getLocations().size(); i++) {
					List<Location> lst = new ArrayList<Location>(r.getLocations());
					List<LocationDto> lstDto = new ArrayList<LocationDto>();
					for (ReleasesDto dto:  dtos){
						lstDto.add(locCvt.convertFromEntity(lst.iterator().next()));
						dto.setLocations(lst);
					}
					
				}*/
				LOG.info(">>>>>>>>>> " + r.getLocations().size());
			});
			map.put("releases", dtos);

			MilestoneXLSX xlsx = new MilestoneXLSX(dtos);
			InputStream in = xlsx.render();

			resHeaders = new HttpHeaders();
			resHeaders.setContentType(MediaType.parseMediaType(EXCEL_CONTENT_TYPE));
			resHeaders.setContentLength(in.available());
			resHeaders.setContentDispositionFormData(ATTACHMENT, FileUtil.MILESTONE);

			InputStreamResource isr = new InputStreamResource(in);
			return new ResponseEntity<InputStreamResource>(isr, resHeaders, HttpStatus.OK);
		} catch (IOException e) {
			LOG.error(e.getMessage());
		}
		return new ResponseEntity<InputStreamResource>(HttpStatus.FORBIDDEN);
	}

	@RequestMapping(value = "xlsx/portfolio", method = RequestMethod.GET, produces = EXCEL_CONTENT_TYPE)
	public ResponseEntity<InputStreamResource> downloadXLSXPortfolio() {
		try {
			SXSSFWorkbook wb = new SXSSFWorkbook();
			SXSSFSheet sheet = wb.createSheet();
			CustomWorkbook workbook = new CustomWorkbook(wb, sheet);
			PortfolioRowsBuilder builder = new PortfolioRowsBuilder(workbook);
			ExcelWriter xlsx = new ExcelWriter();

			InputStream in = xlsx.createExcelFile2(builder.build(loadData()));

			resHeaders = new HttpHeaders();
			resHeaders.setContentType(MediaType.parseMediaType(EXCEL_CONTENT_TYPE));
			resHeaders.setContentLength(in.available());
			resHeaders.setContentDispositionFormData(ATTACHMENT, FileUtil.PORTFOLIO);

			InputStreamResource isr = new InputStreamResource(in);
			return new ResponseEntity<InputStreamResource>(isr, resHeaders, HttpStatus.OK);
		} catch (IOException e) {
			LOG.error(e.getMessage());
		}
		return new ResponseEntity<InputStreamResource>(HttpStatus.FORBIDDEN);
	}

	private Map<String, List<PortfolioDto>> loadData() {
		Map<String, List<PortfolioDto>> map = new HashMap<>();
		List<PortfolioDto> currents = null;
		Iterable<TypeOfChange> typeOfChanges = typeOfChangeRepository.findAll();

		// Find by Type Of Change
		for (TypeOfChange t : typeOfChanges) {
			List<Portfolio> portfolios = portfolioRepository.findByTypeOfChange(t.getId());
			currents = new ArrayList<>();
			for (Portfolio p : portfolios) {
				Releases r = releaseRepository.findOne(p.getReleases().getNr());
				PortfolioDto newDto = portfolioCvt.convertFromEntity(p);
				updateFromReleases(newDto, r, t.getId());
				currents.add(newDto);
			}

			if (portfolios != null && portfolios.size() > 0)
				map.put(t.getName(), currents);
		}

		if (map.isEmpty()) {
			for (TypeOfChange t : typeOfChanges) {
				List<Releases> lstReleases = releaseRepository.findByHcpAndTypeOfChange(t.getId());
				currents = new ArrayList<>();
				for (Releases r : lstReleases) {
					PortfolioDto newDto = new PortfolioDto();
					updateFromReleases(newDto, r, t.getId());
					currents.add(newDto);
				}
				if (lstReleases != null && lstReleases.size() > 0)
					map.put(t.getName(), currents);
			}
		}

		// Find by Other
		List<Portfolio> portfolios = portfolioRepository.findByOther();
		List<PortfolioDto> others = new ArrayList<>();
		for (Portfolio p : portfolios) {
			Releases r = releaseRepository.findOne(p.getReleases().getNr());
			PortfolioDto newDto = portfolioCvt.convertFromEntity(p);
			updateFromReleases(newDto, r, null);
			others.add(newDto);
		}

		List<Releases> releases = releaseRepository.findByHcpAndOther();
		for (Releases r : releases) {
			PortfolioDto newDto = new PortfolioDto();
			newDto.setReleasesId(r.getNr());
			newDto.setPlannedStartTime(DateUtil.convertDate(r.getPlannedStartTime(), DateUtil.DATE_FORMAT));
			newDto.setPlannedSop(DateUtil.convertDate(r.getPlannedSop(), DateUtil.DATE_FORMAT));
			newDto.setPlannedISR(DateUtil.convertDate(r.getPlannedIsr(), DateUtil.DATE_FORMAT));
			newDto.setDispatchFromHcpSite(DateUtil.convertDate(r.getDispatchFromPlantActual(), DateUtil.DATE_FORMAT));
			newDto.setCustomer(r.getObjCustomer() != null ? r.getObjCustomer().getName() : null);
			newDto.setProjectName(ExcelUtil.getProjectName(r));
			newDto.setHcpPjmCoordinator(r.getPic());
			newDto.setTbpSlppPJM(r.getCounterPart());
			others.add(newDto);
		}
		if (others.size() > 0)
			map.put("Other", others);

		return map;
	}

	private void updateFromReleases(PortfolioDto newDto, Releases r, String id) {
		newDto.setReleasesId(r.getNr());
		newDto.setPlannedStartTime(DateUtil.convertDate(r.getPlannedStartTime(), DateUtil.DATE_FORMAT));
		newDto.setPlannedSop(DateUtil.convertDate(r.getPlannedSop(), DateUtil.DATE_FORMAT));
		newDto.setPlannedISR(DateUtil.convertDate(r.getPlannedIsr(), DateUtil.DATE_FORMAT));
		newDto.setDispatchFromHcpSite(DateUtil.convertDate(r.getDispatchFromPlantActual(), DateUtil.DATE_FORMAT));
		newDto.setCustomer(r.getObjCustomer() != null ? r.getObjCustomer().getName() : null);
		newDto.setProjectName(ExcelUtil.getProjectName(r));
		newDto.setHcpPjmCoordinator(r.getPic());
		newDto.setTbpSlppPJM(r.getCounterPart());
	}

	private List<TestingCapacityDto> getListCapacityDtos(String startDate, String endDate) {
		List<TestingCapacityDto> results = new ArrayList<>();
		List<Releases> listReleases = testingRepository.findByEtpTestingId(TestingType.TESTING_DONE.getValue());
		listReleases.forEach(r -> {
			List<TestingCapacity> capacities = capacityRepository.findByReleases_Nr(r.getNr());
			capacities.forEach(c -> {
				TestingCapacityDto dto = testingCapacityCvt.convertFromEntity(c);
				dto.setRealeasesId(r.getNr());
				dto.setProjectName(ExcelUtil.getProjectName(r));
				dto.setPlannedStartTime(DateUtil.convertDate(r.getPlannedStartTime(), DateUtil.YEAR_FORMAT));
				dto.setPlannedSop(DateUtil.convertDate(r.getPlannedSop(), DateUtil.PLANNED_SOP_FORMAT));
				dto.setPlannedIsr(DateUtil.convertDate(r.getPlannedIsr(), DateUtil.PLANNED_ISR_FORMAT));

				List<TestingCapacityDetailDto> testingDates = new ArrayList<>();
				if (c.getCapacityDetails() != null && !c.getCapacityDetails().isEmpty()) {
					TestingCapacityDetail capacityDetail = c.getCapacityDetails().iterator().next();
					List<TestingCapacityDetail> details = capacityDetailRepository.findByCapacityIdAndDate(
							capacityDetail.getId(), DateUtil.stringToDate(startDate, DateUtil.DATE_FORMAT_2),
							DateUtil.stringToDate(endDate, DateUtil.DATE_FORMAT_2));

					details.forEach(d -> {
						TestingCapacityDetailDto detailDto = detailConverter.convertFromEntity(d);
						testingDates.add(detailDto);
					});
				}
				TestingCapacityDetailDto[] capacityDetailDtos = new TestingCapacityDetailDto[testingDates.size()];
				capacityDetailDtos = testingDates.toArray(capacityDetailDtos);
				dto.setTestingDates(capacityDetailDtos);
				results.add(dto);
			});
		});
		return results;
	}

}
