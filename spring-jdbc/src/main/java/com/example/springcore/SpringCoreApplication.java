package com.example.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.model.Employee;
import com.model.Insurance;
import com.model.InsuranceType;
import com.model.Project;
import com.service.EmpInsService;

@SpringBootApplication
@ComponentScan("com")
@EnableAspectJAutoProxy
public class SpringCoreApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringCoreApplication.class,args);
		EmpInsService es=(EmpInsService) ctx.getBean(EmpInsService.class);
		
		
		Employee emp=new Employee(101,"Itashi","blr");
		Insurance ins=new Insurance(101,InsuranceType.FIRE_INSURANCE,10000);
		Project pro=new Project(101,23,"NewProject","Blr");
		es.assignINSTOEMP(emp, ins);
		es.assignPROTOEMP(emp, pro);
		System.out.println("Employee  with INS Added successfully");
	}

}
