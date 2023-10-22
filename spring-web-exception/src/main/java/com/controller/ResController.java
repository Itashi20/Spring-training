package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.UserDao;
import com.model.User;
import com.model.Users;

@RestController
@RequestMapping("/users")
public class ResController {

	@Autowired
	private UserDao userdao;

	@PostMapping("/adduser")
public ResponseEntity<Object> AddNewUser(@RequestBody User user){
		
//		userdao.addUser(users);
//		return "user added";
		
		Integer id=userdao.getAllUsers().getusers().size()+1;
		user.setUid(id);
		userdao.addUser(user);
		return ResponseEntity.ok("user added successfully");
		
	}

	@GetMapping("/loadusers")
public Users loadAll(
		@RequestHeader(name="X-COM-PERSIST",required=true)String headerPersist,
        @RequestHeader(name="X-COM-LOCATION",defaultValue="ASIA")String headerloc)
{
		return userdao.getAllUsers();
	}

}