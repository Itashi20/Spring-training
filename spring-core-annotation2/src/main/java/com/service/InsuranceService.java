package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.insurance.IRDA;
@Service("service")
public class InsuranceService {
@Autowired
@Qualifier("ff")
private IRDA irda;
	

	public IRDA getIrda() {
		return irda;
	}

	public void setIrda(IRDA irda) {
		this.irda = irda;
	}
	public double PremiumValue(int age) {
		return irda.calculatePremium(age);
	}

	public InsuranceService() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("I am in Insurance Service");
	}

	
	public void init() {
		System.err.println("called after bean is initilized");
	}
	
	public void destroy() {
		System.out.println("After bean destroyed");
	}
}
