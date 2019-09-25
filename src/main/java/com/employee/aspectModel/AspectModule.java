package com.employee.aspectModel;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectModule {

	/**
	 * This is the method which would select before execution
	 */
	
	@Before("execution(* com.employee.service.EmployeeServiceImpl.save(..))")
	public void beforeAdvice() {
		System.out.println("Method In");
	}
	
	/*@After("execution(* com.employee.service.EmployeeServiceImple.save(..))")
	public void afterAdvice(){
		System.out.println("Method out");
	}*/

}
