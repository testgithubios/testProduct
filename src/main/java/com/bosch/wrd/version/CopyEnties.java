package com.bosch.wrd.version;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.bosch.wrd.entity.entityImpl.Customer;
import com.bosch.wrd.entity.entityImpl.CustomerPlant;
import com.bosch.wrd.entity.entityImpl.EtpTesting;
import com.bosch.wrd.util.SqlUtil;

@Component
public class CopyEnties {

	@Autowired
	private JdbcTemplate template;
	
	public void run() {
		String strDate = String.valueOf(System.currentTimeMillis());
		
		generateTables(strDate);
		copyData(strDate);
	}
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void copyData(String strDate) {
		List<Object[]> batch = new ArrayList<Object[]>();;
		
		// Copy Customer
		Collection<Customer> customers = template.query("SELECT id, name FROM customer", new RowMapper() {
			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Customer(rs.getString("id"), rs.getString("name"));
			}
		});
		for (Customer c : customers) {
			Object[] vals = new Object[] {c.getId(), c.getName()};
			batch.add(vals);
		}
		if (batch.size() > 0) {
			template.batchUpdate(SqlUtil.insertCustomer(strDate), batch);
			batch.clear();
		}
		
		// Copy CustomerPlant
		Collection<CustomerPlant> customerPlants = template.query("SELECT id, description FROM customer_plant", new RowMapper() {
			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new CustomerPlant(rs.getString("id"), rs.getString("description"));
			}
		});
		for (CustomerPlant c : customerPlants) {
			Object[] vals = new Object[] {c.getId(), c.getDescription()};
			batch.add(vals);
		}
		if (batch.size() > 0) {
			template.batchUpdate(SqlUtil.insertCustomerPlant(strDate), batch);
			batch.clear();
		}
		
		// Copy Etptesting
		Collection<EtpTesting> etpTestings = template.query("SELECT id, value FROM etptesting", new RowMapper() {
			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new EtpTesting(rs.getString("id"), rs.getString("value"));
			}
		});
		for (EtpTesting e : etpTestings) {
			Object[] vals = new Object[] {e.getId(), e.getValue()};
			batch.add(vals);
		}
		if (batch.size() > 0) {
			template.batchUpdate(SqlUtil.insertEtpTesting(strDate), batch);
			batch.clear();
		}
	}
	
	private void generateTables(String strDate) {
		template.execute(SqlUtil.createCustomer(strDate));
		template.execute(SqlUtil.createCustomerPlant(strDate));
		template.execute(SqlUtil.createEtptesting(strDate));
		template.execute(SqlUtil.createLocation(strDate));
		template.execute(SqlUtil.createPriority(strDate));
		template.execute(SqlUtil.createPermission(strDate));
		template.execute(SqlUtil.createRole(strDate));
		template.execute(SqlUtil.createRolePermission(strDate));
		template.execute(SqlUtil.createTypeOfChange(strDate));
		template.execute(SqlUtil.createUnit(strDate));
		template.execute(SqlUtil.createUser(strDate));
		template.execute(SqlUtil.createUserRole(strDate));
		template.execute(SqlUtil.createReleases(strDate));
		template.execute(SqlUtil.createHidhlight(strDate));
		template.execute(SqlUtil.createLessonsLearned(strDate));
		template.execute(SqlUtil.createPortfolio(strDate));
		template.execute(SqlUtil.createProjectReview(strDate));
		template.execute(SqlUtil.createReleasesCustomerPlants(strDate));
		template.execute(SqlUtil.createReleasesPriorities(strDate));
		template.execute(SqlUtil.createRowFormatting(strDate));
		template.execute(SqlUtil.createStearingCommittee(strDate));
		template.execute(SqlUtil.createTestingCapacity(strDate));
		template.execute(SqlUtil.createTestingCapacityDetail(strDate));
		template.execute(SqlUtil.createReleasesLocations(strDate));

		SqlUtil.createForeignKeys(strDate).forEach(sql -> {
			template.update(sql);
		});
	}
	
}
