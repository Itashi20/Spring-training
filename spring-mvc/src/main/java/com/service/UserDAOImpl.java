package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.model.User;

@Service
public class UserDAOImpl implements UserDAO {
	ArrayList<User> al=new ArrayList<User>();
	@Override
	
	public boolean loginValidated(User users){
		for(User user:al) {
			if(user.getUname().equals(users.getUname())&& user.getPwd().equals(users.getPwd())) {
				return true;
			}
		}
		return false;

	
}
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		al.add(user);
		
	}
	@Override
	public List<User> loadAll() {
		// TODO Auto-generated method stub
		return al;
	}
	@Override
	public boolean findUser(String uname) {
		// TODO Auto-generated method stub
		for(User user:al) {
			if(user.getUname().equals(uname)) {
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean deleteUser(String uname) {
	
		int id=-1;
		for(int i=0;i<al.size();i++) {
			if(al.get(i).getUname().equalsIgnoreCase(uname)) {
				id=i;
			}
		}
		if(id!=-1)
			return true;
		return false;
	}
	@Override
	public boolean updateUser(String name, User user) {
		// TODO Auto-generated method stub
		
		for(User users:al) {
			if(users.getUname().equalsIgnoreCase(name)) {
			users.setUname(user.getUname());
			users.setPwd(user.getPwd());
			users.setEmail(user.getEmail());
			users.setCity(user.getCity());
			return true;
			}
		}
		return false;
	}}
