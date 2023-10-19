package com.service;

import com.model.Employee;
import com.model.Insurance;
import com.model.Project;

public interface EmpInsService {

	public void assignINSTOEMP(Employee emp,Insurance insurance);
	public void assignPROTOEMP(Employee emp,Project project);
}
