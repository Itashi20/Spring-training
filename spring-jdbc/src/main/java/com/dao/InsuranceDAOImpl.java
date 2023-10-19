package com.dao;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.model.Insurance;

@Repository
public class InsuranceDAOImpl extends JdbcDaoSupport implements InsuranceDAO {
	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	public void init() {
		setDataSource(dataSource);
	}
	@Override
	public void addInsuranceToEMP(Insurance insurance) {
		// TODO Auto-generated method stub
		String sql="insert into insurance(emp_Id,insType,amount)values(?,?,?)";
		getJdbcTemplate().update(sql,new Object[] {insurance.getEmpId(),
			insurance.getInsurancetype().name(),insurance.getCoverageAmount()
		});
		
		
	}

}
