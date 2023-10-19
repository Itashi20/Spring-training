package com.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

//the name of the attributes and name parameter in html should be same
public class User {

	private String uname;
	private String pwd;
	private String email;
	private String city;
	
}
