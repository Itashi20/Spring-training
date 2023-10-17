package com.example.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.insurance.FamilyFloater;
import com.insurance.IndividualService;
import com.service.InsuranceService;

@Configuration
@ComponentScan("com")

//we can also import xml suppose we have legacy code 200 classs now we cannot convert to annotations 
//every cllass so we simply import that xml file -->Reason
//@ImportResource(value=" ")
public class AppContext {

	@Bean
	public FamilyFloater ff() {
		return new FamilyFloater();
	}
	@Bean
	public IndividualService ii() {
		return new IndividualService();
	}
	@Bean
	public InsuranceService service() {
		return new InsuranceService(ff());
	}
}
