package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLogginAspect {
	
	// call only addAccount of AccountDAO
//	@Before("execution(public void com.aop.dao.AccountDAO.addAccount())") // this is pointcut expression
//	// where we map advice with joincut
//	public void beforeaddAccountAdvice()
//	{
//		System.out.println("doing some check before addAccount");
//	}
	
	
	// call addAccount of any class @Component
//	@Before("execution(public void addAccount())") // this is pointcut expression
//	// where we map advice with joincut
//	public void beforeaddAccountAdvice()
//	{
//		System.out.println("doing some check before addAccount");
//	}
	
	
	// call any add of any class @Component
//	@Before("execution(public void add*())") // this is pointcut expression
//	// where we map advice with joincut
//	public void beforeaddAccountAdvice()
//	{
//		System.out.println("doing some check before addAccount");
//	}
//	
	
	// call any add of any class @Component of any return type
	@Before("execution(* add*())") // this is pointcut expression
	// where we map advice with joincut
	public void beforeaddAccountAdvice()
	{
		System.out.println("doing some check before addAccount");
	}
	
	//() mathces method with zero argument
	//(*) mathces method with one argu of any type
	//(..) mathces method with zero or more with any type
	//*.*(..) any method of any class with zero or more argu with any type
	//com.aop.dao.AccountDAO.*.*(..) any method of AccountDAO class with zero or more argu with any type
}
