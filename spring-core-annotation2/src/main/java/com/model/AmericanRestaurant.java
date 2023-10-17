package com.model;

import org.springframework.stereotype.Component;

@Component("ar")

public class AmericanRestaurant implements Restaurant {
	public String PrepareDish(String dishType) {
		// TODO Auto-generated method stub
		return "Prepaing"+dishType+" with lot of american herbs and breads";
	}
}
