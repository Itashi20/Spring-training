package com.dao;

import org.springframework.stereotype.Service;

import com.model.User;
import com.model.Users;

@Service
public class UserDaoImpl implements UserDao {

	
	public static Users list=new Users();
	
	static {
		list.getusers().add(new User(1,"SOM","som@gmail.com","Delhi"));
		list.getusers().add(new User(2,"ABC","abc@gmail.com","Delhi"));

		list.getusers().add(new User(3,"XYZ","xyz@gmail.com","Delhi"));
	
	
	}
	
	public Users getAllUsers() {
		return list;
	}
	
	
	public void addUser(User user) {
		list.getusers().add(user);
	}
}
