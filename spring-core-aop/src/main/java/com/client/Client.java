package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.context.AppContext;
import com.model.Welcome;
import com.model.WelcomeImpl;



public class Client {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=new AnnotationConfigApplicationContext(AppContext.class);
		WelcomeImpl wi=(WelcomeImpl)ctx.getBean("service");
         System.out.println(wi.sayWelcome("sunlife"));
         wi.sayHi("Itashi");
         
         ctx.close();
         

	}

}
