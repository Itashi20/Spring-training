
package com.Advice;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AppAdvice {
@Before("execution(* com.service.EmpInsServiceImpl.assignINSTOEMP(..))")
	public void callBeforeEMP() {
		System.out.println("Called before Employee Insurance Type.....");
	}


@Before("execution(* com.service.EmpInsServiceImpl.assignPROTOEMP(..))")
public void callBeforePRO() {
	System.out.println("Called before Employee Insurance Type.....");
}


@After("execution(* com.service.EmpInsServiceImpl.assignPROTOEMP(..))")
public void callAfterPRO() {
	System.out.println("After is called successfully PROJECT ADDED TO EMPLOYEE");
}
	
}
