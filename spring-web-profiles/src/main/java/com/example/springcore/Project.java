package com.example.springcore;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
public class Project {
private String pname;
private String location;
private int noOfEmp;
private double budget;
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public int getNoOfEmp() {
	return noOfEmp;
}
public void setNoOfEmp(int noOfEmp) {
	this.noOfEmp = noOfEmp;
}
public double getBudget() {
	return budget;
}
public void setBudget(double budget) {
	this.budget = budget;
}

@Bean
@Profile("india")
public String devDBConnect() {
	System.out.println(pname);
	System.out.println(location);
	System.out.println(noOfEmp);
	System.out.println(budget);
	
	return "connected to india";
}

@Bean
@Profile("Uk")
public String UKDBConnect() {
	System.out.println(pname);
	System.out.println(location);
	System.out.println(noOfEmp);
	System.out.println(budget);
	
	return "connected to UK";
}


@Bean
@Profile("USA")
public String USADBConnect() {
	System.out.println(pname);
	System.out.println(location);
	System.out.println(noOfEmp);
	System.out.println(budget);
	
	return "connected to USA";
}

}
