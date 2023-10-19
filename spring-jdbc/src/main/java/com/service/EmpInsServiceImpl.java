package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.EmployeeDao;
import com.dao.InsuranceDAO;
import com.dao.ProjectDAO;
import com.model.Employee;
import com.model.Insurance;
import com.model.Project;

@Service
public class EmpInsServiceImpl implements EmpInsService {

	@Autowired
	private EmployeeDao empDAO;
	@Autowired
	private InsuranceDAO insDAO;
	@Autowired
	private ProjectDAO proDAO;
	
	@Override
	@Transactional
	public void assignINSTOEMP(Employee emp, Insurance insurance) {
		// TODO Auto-generated method stub
		empDAO.addEmployee(emp);
		insDAO.addInsuranceToEMP(insurance);
		//proDAO.addProjectToEMP(project);
		
	}
	
	//create a different method and add empDAO and proDAO in it
	public void assignPROTOEMP(Employee emp, Project proj) {
////		// TODO Auto-generated method stub		
		empDAO.addEmployee(emp);
		proDAO.addProjectToEMP(proj);
	
}}
