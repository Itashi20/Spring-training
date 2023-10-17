package com.insurance;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

public class FamilyFloater implements IRDA {

	@Value(value="5")
	private int duration;
	@Value(value="13456.44")
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
	
	public FamilyFloater() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("I am in FamilyFloater");
	}
	

}
