/**
 * 
 */
package com.bosch.wrd.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.wrd.constraints.InternalCustomerType;
import com.bosch.wrd.dao.CustomerPlantRepository;
import com.bosch.wrd.dao.CustomerRepository;
import com.bosch.wrd.dao.EtpTestingRepository;
import com.bosch.wrd.dao.LocationRepository;
import com.bosch.wrd.dao.PriorityRepository;
import com.bosch.wrd.dao.ProjectReviewRepository;
import com.bosch.wrd.dao.ReleaseRepository;
import com.bosch.wrd.dao.TypeOfChangeRepository;
import com.bosch.wrd.dao.UnitRepository;
import com.bosch.wrd.dao.UserRepository;
import com.bosch.wrd.dto.Converter;
import com.bosch.wrd.dto.CustomerDto;
import com.bosch.wrd.dto.CustomerPlantDto;
import com.bosch.wrd.dto.InternalCustomerAlignmentDto;
import com.bosch.wrd.dto.LocationConverter;
import com.bosch.wrd.dto.LocationDto;
import com.bosch.wrd.dto.PriorityDto;
import com.bosch.wrd.dto.ReleasesConverter;
import com.bosch.wrd.dto.ReleasesDto;
import com.bosch.wrd.dto.SelectedReleasesDto;
import com.bosch.wrd.dto.SelectedReleasesResultDto;
import com.bosch.wrd.dto.StatusDto;
import com.bosch.wrd.dto.TypeOfChangeDto;
import com.bosch.wrd.entity.entityImpl.Customer;
import com.bosch.wrd.entity.entityImpl.CustomerPlant;
import com.bosch.wrd.entity.entityImpl.EtpTesting;
import com.bosch.wrd.entity.entityImpl.Location;
import com.bosch.wrd.entity.entityImpl.Priority;
import com.bosch.wrd.entity.entityImpl.ProjectReview;
import com.bosch.wrd.entity.entityImpl.Releases;
import com.bosch.wrd.entity.entityImpl.TypeOfChange;
import com.bosch.wrd.entity.entityImpl.Unit;
import com.bosch.wrd.entity.entityImpl.User;
import com.bosch.wrd.util.DateUtil;
import com.google.common.collect.Lists;

@RestController
@RequestMapping(value = "/api/release")
public class ReleasesService extends BaseService<Releases, Long> {
	private static final Logger LOG = Logger.getLogger(ReleasesService.class);
	
	private static final String COMMA = ",";

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private TypeOfChangeRepository changeRepository;
	@Autowired
	private UnitRepository unitRepository;
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private PriorityRepository priorityRepository;
	@Autowired
	private CustomerPlantRepository customerPlantRepository;
	@Autowired
	private ProjectReviewRepository projectReviewRepository;
	@Autowired
	private EtpTestingRepository etpTestingRepository;
	@Autowired
	private ReleaseRepository releaseRepository;
	@Autowired
	private LocationRepository locationRepository;

	private Converter<ReleasesDto, Releases> converter = new ReleasesConverter();
	private Converter<LocationDto, Location> locationCvt = new LocationConverter();

	public ReleasesService(ReleaseRepository dao) {
		super();
		this.dao = dao;
	}

	@RequestMapping(value = "/getListReleases", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<List<ReleasesDto>> getListReleases() {
		List<ReleasesDto> dtos = new ArrayList<>();
		List<Releases> releases = releaseRepository.getListReleases();
		releases.forEach(r -> {
			ReleasesDto dto = convertToDto(r);
			dtos.add(dto);
		});
		return new ResponseEntity<>(dtos, HttpStatus.OK);
	}

	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin
	public @ResponseBody ResponseEntity<ReleasesDto> saveOrUpdate(@RequestBody ReleasesDto dto) {
		Releases releases = convertToEntity(dto);
		Releases newReleases = this.dao.save(releases);
		return new ResponseEntity<>(convertToDto(newReleases), HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/getSelectedReleases", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<SelectedReleasesResultDto> getSelectedReleases(@RequestBody SelectedReleasesDto dto, Pageable pageable, Model model) {
		try {
			
			return new ResponseEntity<>(searchListReleases(dto, pageable, model),
					HttpStatus.OK);
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}
		return new ResponseEntity<>(HttpStatus.FORBIDDEN);
	}
	
	@RequestMapping(value = "/updateInternalCustomer", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<InternalCustomerAlignmentDto> updateInternalCustomer(@RequestBody InternalCustomerAlignmentDto dto) {
		try {
			Releases releases = releaseRepository.findOne(dto.getNr());
			if (releases != null) {
				if (dto.getTypeChange().equals(InternalCustomerType.NPCS.toString())) {
					releases.setNpcsInitial(DateUtil.stringToDate(dto.getDateInitial(), DateUtil.DATE_FORMAT));
					releases.setNpcsActual(DateUtil.stringToDate(dto.getDateActual(), DateUtil.DATE_FORMAT));
					releases.setNpcsSubmission(DateUtil.stringToDate(dto.getDateSubmission(), DateUtil.DATE_FORMAT));
					releaseRepository.save(releases);
				}
				if (dto.getTypeChange().equals(InternalCustomerType.NPCR.toString())) {
					releases.setNpcrInitial(DateUtil.stringToDate(dto.getDateInitial(), DateUtil.DATE_FORMAT));
					releases.setNpcrActual(DateUtil.stringToDate(dto.getDateActual(), DateUtil.DATE_FORMAT));
					releases.setNpcrSubmission(DateUtil.stringToDate(dto.getDateSubmission(), DateUtil.DATE_FORMAT));
					releaseRepository.save(releases);
				}
				if (dto.getTypeChange().equals(InternalCustomerType.PDR1.toString())) {
					releases.setPdr1Initial(DateUtil.stringToDate(dto.getDateInitial(), DateUtil.DATE_FORMAT));
					releases.setPdr1Actual(DateUtil.stringToDate(dto.getDateActual(), DateUtil.DATE_FORMAT));
					releases.setPdr1Submission(DateUtil.stringToDate(dto.getDateSubmission(), DateUtil.DATE_FORMAT));
					releaseRepository.save(releases);
				}
				if (dto.getTypeChange().equals(InternalCustomerType.PDR2.toString())) {
					releases.setPdr2Initial(DateUtil.stringToDate(dto.getDateInitial(), DateUtil.DATE_FORMAT));
					releases.setPdr2Actual(DateUtil.stringToDate(dto.getDateActual(), DateUtil.DATE_FORMAT));
					releases.setPdr2Submission(DateUtil.stringToDate(dto.getDateSubmission(), DateUtil.DATE_FORMAT));
					releaseRepository.save(releases);
				}
				if (dto.getTypeChange().equals(InternalCustomerType.PSWS.toString())) {
					releases.setPswsInitial(DateUtil.stringToDate(dto.getDateInitial(), DateUtil.DATE_FORMAT));
					releases.setPswsActual(DateUtil.stringToDate(dto.getDateActual(), DateUtil.DATE_FORMAT));
					releases.setPswsSubmission(DateUtil.stringToDate(dto.getDateSubmission(), DateUtil.DATE_FORMAT));
					releaseRepository.save(releases);
				}
				if (dto.getTypeChange().equals(InternalCustomerType.PSWA.toString())) {
					releases.setPswaInitial(DateUtil.stringToDate(dto.getDateInitial(), DateUtil.DATE_FORMAT));
					releases.setPswaActual(DateUtil.stringToDate(dto.getDateActual(), DateUtil.DATE_FORMAT));
					releases.setPswaSubmission(DateUtil.stringToDate(dto.getDateSubmission(), DateUtil.DATE_FORMAT));
					releaseRepository.save(releases);
				}
			}
			return new ResponseEntity<>(dto, HttpStatus.OK);
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}
		return new ResponseEntity<>(HttpStatus.FORBIDDEN);
	}
	
	@RequestMapping(value = "/findByCustomerIdAndTypeOfChangeId", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<List<ReleasesDto>> findByCustomerIdAndTypeOfChangeId(
			@RequestParam(value = "customerId", required = false) String customerId,
			@RequestParam(value = "typeOfChangeId", required = false) String typeOfChangeId) {
		try {
			List<ReleasesDto> dtos = new ArrayList<>();
			List<Releases> list = new ArrayList<>();

			// Case general
			// Case 1 :
			if (StringUtils.isEmpty(customerId) && StringUtils.isEmpty(typeOfChangeId)) {
				list = releaseRepository.findNotInCustomerAndTypeOfChange();
			}
			// Case 2:
			if (StringUtils.isEmpty(customerId) && !StringUtils.isEmpty(typeOfChangeId)) {
				list = releaseRepository.findByTypeOfChangeId(typeOfChangeId);
			}

			// Case Jatco
			if ((!StringUtils.isEmpty(customerId) && !StringUtils.isEmpty(typeOfChangeId))
					&& customerId.equalsIgnoreCase("Jatco")) {
				list = releaseRepository.findByCustomerIdAndTypeOfChangeId(customerId, typeOfChangeId);
			}

			// Case Honda
			if (!StringUtils.isEmpty(customerId) && customerId.equalsIgnoreCase("Honda")) {
				list = releaseRepository.findByCustomerId(customerId);
			}

			list.forEach(r -> {
				dtos.add(convertToDto(r));
			});
			return new ResponseEntity<>(dtos, HttpStatus.OK);
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}
		return new ResponseEntity<>(HttpStatus.FORBIDDEN);
	}
	
	private ReleasesDto convertToDto(Releases releases) {
		ReleasesDto dto = converter.convertFromEntity(releases);

		String user = null == releases.getUser() ? null : releases.getUser().getId();
		dto.setUser(user);
		String change = null == releases.getChange() ? null : releases.getChange().getId();
		dto.setChange(change);
		String changeName = null == releases.getChange() ? null : releases.getChange().getName();
		dto.setChangeName(changeName);
		String unit = null == releases.getUnit() ? null : releases.getUnit().getId();
		dto.setUnit(unit);
		String customer = null == releases.getObjCustomer() ? null : releases.getObjCustomer().getId();
		dto.setObjCustomer(customer);
		String customerName = null == releases.getObjCustomer() ? null : releases.getObjCustomer().getName();
		dto.setCustomerName(customerName);
		String etpTesting = null == releases.getObjEtpTesting() ? null : releases.getObjEtpTesting().getId();
		dto.setEtpTesting(etpTesting);

		
		StringBuilder sb = null;
		List<CustomerPlant> customerPlants = customerPlantRepository.findByReleases_Nr(releases.getNr());
		if (null != customerPlants && customerPlants.size() > 0) {
			List<CustomerPlantDto> customerPlantsDto = new ArrayList<>();
			sb = new StringBuilder();
			for (CustomerPlant c : customerPlants) {
				customerPlantsDto.add(new CustomerPlantDto(c.getId(), c.getDescription()));
				sb.append(c.getDescription() + COMMA);
			}
			dto.setObjCustomerPlant(customerPlantsDto);
			dto.setCustomerPlantName(sb.toString());
		}

		List<Priority> priorities = priorityRepository.findByReleases_Nr(releases.getNr());
		if (null != priorities && priorities.size() > 0) {
			List<PriorityDto> prioritiesDto = new ArrayList<>();
			sb = new StringBuilder();
			for (Priority p : priorities) {
				prioritiesDto.add(new PriorityDto(p.getId(), p.getName()));
				sb.append(p.getName() + COMMA);
			}
			dto.setObjPriority(prioritiesDto);
			dto.setPriorityName(sb.toString());
		}
		
		List<Location> locations = locationRepository.findByReleasesNr(releases.getNr());
		if (locations != null && locations.size() > 0) {
			List<LocationDto> locationDtos = new ArrayList<>();
			sb = new StringBuilder();
			for (Location l : locations) {
				locationDtos.add(new LocationDto(l.getId(), l.getName()));
				sb.append(l.getName() + COMMA);
			}
			dto.setLocations(locationDtos);
			dto.setLocationName(sb.toString());
		}
		return dto;
	}

	private Releases convertToEntity(ReleasesDto dto) {
		Releases releases = converter.convertFromDto(dto);
		if (dto.getNr() != null) {
			Releases oldReleases = dao.findOne(dto.getNr());
			if (oldReleases != null) {
				releases.setNr(oldReleases.getNr());
				releases.setProjectHighlight(oldReleases.getProjectHighlight());
				releases.setPlannedStartTime(oldReleases.getPlannedStartTime());
				releases.setPlannedSop(oldReleases.getPlannedSop());
				releases.setPlannedIsr(oldReleases.getPlannedIsr());
			} else {
				releases.setNr(null);
			}
		}

		// find user by id
		User user = null;
		if (null != dto.getUser()) {
			user = userRepository.findOne(dto.getUser());
		}
		releases.setUser(user);

		// find Type of change by id
		TypeOfChange change = null;
		if (null != dto.getChange()) {
			change = changeRepository.findOne(dto.getChange());
		}
		releases.setChange(change);

		// find Unit by id
		Unit unit = null;
		if (null != dto.getUnit()) {
			unit = unitRepository.findOne(dto.getUnit());
		}
		releases.setUnit(unit);

		// find customer by id
		Customer customer = null;
		if (null != dto.getObjCustomer()) {
			customer = customerRepository.findOne(dto.getObjCustomer());
		}
		releases.setObjCustomer(customer);

		// find project review by id
		ProjectReview projectReview = null;
		if (null != dto.getProjectReviews()) {
			projectReview = projectReviewRepository.findOne(dto.getProjectReviews());
		}
		releases.setObjProjectReview(projectReview);

		// save etp testing.
		EtpTesting etpTesting = null;
		if (dto.getEtpTesting() != null) {
			etpTesting = etpTestingRepository.findOne(dto.getEtpTesting());
		}
		releases.setObjEtpTesting(etpTesting);

		Set<Releases> seReleases = new HashSet<>();
		seReleases.add(releases);

		// save priority
		if (dto.getObjPriority() != null && dto.getObjPriority().size() > 0) {
			Set<Priority> priorities = new HashSet<>();

			dto.getObjPriority().forEach(p -> {
				Priority priority = new Priority();
				priority.setId(p.getId());
				priority.setName(p.getName());
				priorities.add(priority);
			});
			releases.setPriorities(priorities);
		}

		// save customer plant
		if (dto.getObjCustomerPlant() != null && dto.getObjCustomerPlant().size() > 0) {
			Set<CustomerPlant> customerPlants = new HashSet<>();

			dto.getObjCustomerPlant().forEach(c -> {
				CustomerPlant plant = new CustomerPlant();
				plant.setId(c.getId());
				plant.setDescription(c.getDescription());
				customerPlants.add(plant);
			});
			releases.setCustomerPlants(customerPlants);
		}
		
		// save location
		if (dto.getLocations() != null && dto.getLocations().size() > 0) {
			Set<Location> locations = new HashSet<>();
			
			dto.getLocations().forEach(l -> {
				locations.add(locationCvt.convertFromDto(l));
			});
			releases.setLocations(locations);
		}
		return releases;
	}
	
	private SelectedReleasesResultDto searchListReleases(SelectedReleasesDto selectedReleasesDto, Pageable pageable, Model model) {
		SelectedReleasesResultDto result = new SelectedReleasesResultDto();
		List<ReleasesDto> dtos = new ArrayList<>();
		LinkedList<List<String>> params = new LinkedList<>();
		
		List<CustomerDto> customerDtos = Lists.newArrayList(selectedReleasesDto.getCustomers());
		List<TypeOfChangeDto> typeOfChangeDtos = Lists.newArrayList(selectedReleasesDto.getTypeOfChanges());
		List<LocationDto> locationDtos = Lists.newArrayList(selectedReleasesDto.getLocations());
		List<StatusDto> statusDtos = Lists.newArrayList(selectedReleasesDto.getStatus());
		
		// customer
		List<String> customerIds = new ArrayList<>();
		for (CustomerDto dto : customerDtos) {
			customerIds.add(dto.getId());
		}
		params.add(customerIds);
		
		// type of change
		List<String> typeIds = new ArrayList<>();
		for(TypeOfChangeDto dto : typeOfChangeDtos) {
			typeIds.add(dto.getId());
		}
		params.add(typeIds);
		
		// location
		List<String> locationIds = new ArrayList<>();
		for(LocationDto dto : locationDtos) {
			locationIds.add(dto.getId());
		}
		params.add(locationIds);
		
		// status
		List<String> statusVals = new ArrayList<>();
		for(StatusDto dto : statusDtos) {
			statusVals.add(dto.getValue());
		}
		params.add(statusVals);
		
		Page<Releases> page = releaseRepository.getSelectedReleases(customerIds, typeIds, locationIds, statusVals, pageable);
		List<Releases> releases = page.getContent();
		releases.forEach(r -> {
			StringBuilder sb = null;
			ReleasesDto dto = converter.convertFromEntity(r);
			dto.setCustomerName(r.getObjCustomer() != null ? r.getObjCustomer().getName() : null);
			dto.setChangeName(r.getChange() != null ? r.getChange().getName() : null);
			
			sb = new StringBuilder();
			for (Priority p : r.getPriorities()) {
				sb.append(p.getName() + COMMA);
			}
			dto.setPriorityName(sb.toString());
			
			sb = new StringBuilder();
			for (Location l : r.getLocations()) {
				sb.append(l.getName() + COMMA);
			}
			dto.setLocationName(sb.toString());
			
			sb = new StringBuilder();
			for (CustomerPlant p : r.getCustomerPlants()) {
				sb.append(p.getDescription() + COMMA);
			}
			dto.setCustomerPlantName(sb.toString());

			dtos.add(dto);
		});
		
		result.setReleasesDtos(dtos);
		result.setTotalPages(page.getTotalElements());
		return result;
	}

}
