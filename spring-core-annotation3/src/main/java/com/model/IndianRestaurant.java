package com.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ir")
public class IndianRestaurant implements Restaurant {

	@Override
	public String PrepareDish(String dishType) {
		// TODO Auto-generated method stub
		return "Prepaing"+dishType+" with lot of indian herbs and breads";
	}

}
