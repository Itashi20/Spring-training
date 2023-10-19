package com.dao;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.model.Project;

@Repository

public class ProjectDAOImpl extends JdbcDaoSupport implements ProjectDAO {

	
	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	public void init() {
		setDataSource(dataSource);
	}
	@Override
	public void addProjectToEMP(Project project) {
		// TODO Auto-generated method stub
		
		String sql="insert into Project(emp_Id,project_Id,project_Name,location)values(?,?,?,?)";
		getJdbcTemplate().update(sql,new Object[] {
				project.getEmpid(),project.getProjectId(),project.getProjectName(),project.getLocation()
		 
		});
		
	}

}
