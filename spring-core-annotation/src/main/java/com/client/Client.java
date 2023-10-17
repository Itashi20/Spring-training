package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.InsuranceService;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
         
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		
		//InsuranceService is=(InsuranceService)ctx.getBean("service");
         //System.out.println(is.PremiumValue(34));
         
//         InsuranceService is2=(InsuranceService)ctx.getBean("service");
//         System.out.println(is.hashCode());
//         System.out.println(is2.hashCode());
         
         //both have same hashcodes ,so have same object
         //scope by default is singletopn
         ctx.close();
         

	}

}
