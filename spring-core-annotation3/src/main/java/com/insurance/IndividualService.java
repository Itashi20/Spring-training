package com.insurance;

import org.springframework.stereotype.Component;


public class IndividualService implements IRDA {

	private int duration;
	private double amount;
	
	@Override
	public double calculatePremium(int age) {
		// TODO Auto-generated method stub
		return amount*age/duration;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public IndividualService() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("I am in Individual Service");
	}
	
	

}
