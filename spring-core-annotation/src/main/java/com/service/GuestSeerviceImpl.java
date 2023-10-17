package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.model.Restaurant;

@Service("s")
public class GuestSeerviceImpl implements GuestService {
	@Autowired
	@Qualifier("ir")
private Restaurant restaurant;
	

	public GuestSeerviceImpl(Restaurant restaurant) {
		super();
		this.restaurant = restaurant;
	}


	@Override
	public String inRoomDining(String order) {
		 
		return restaurant.PrepareDish(order);
	}


	public GuestSeerviceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
