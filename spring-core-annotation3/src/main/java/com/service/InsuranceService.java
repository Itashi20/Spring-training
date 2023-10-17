package com.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.insurance.IRDA;

public class InsuranceService {
private IRDA irda;
	

//	public IRDA getIrda() {
//		return irda;
//	}
//
//	public void setIrda(IRDA irda) {
//		this.irda = irda;
//	}

	public double PremiumValue(int age) {
		return irda.calculatePremium(age);
	}

	public InsuranceService(IRDA irda) {
		super();
		this.irda = irda;
	}

	public InsuranceService() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("I am in Insurance Service");
	}

	@PostConstruct
	public void init() {
		System.err.println("called after bean is initilized");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("After bean destroyed");
	}
}
