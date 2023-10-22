package com.model;

import java.util.ArrayList;
import java.util.List;

public class Users {

	private List<User> users;
	public List<User> getusers(){
		if(users==null) {
			users=new ArrayList<User>();
		}
		return users;
	}
	
	public void setusers(List<User>users) {
		this.users=users;
	}
}
