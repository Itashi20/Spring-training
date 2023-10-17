package com.example.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.GuestService;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringCoreApplication.class, args);
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		GuestService gs=(GuestService)ctx.getBean("service");
		System.out.println(gs.inRoomDining("Fries"));
	}

}
