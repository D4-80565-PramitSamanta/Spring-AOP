package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLogginAspect {
	@Before("execution(public void com.aop.dao.AccountDAO.addAccount())") // this is pointcut expression
	// where we map advice with joincut
	public void beforeaddAccountAdvice()
	{
		System.out.println("doing some check before addAccount");
	}
}
