package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDao;
import com.model.Employee;


@Service("esi")
public class EmployeeServiceImpl  implements EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		dao.addEmployee(employee);
		
	}

}
