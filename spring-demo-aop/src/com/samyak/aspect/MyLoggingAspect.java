package com.samyak.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {
	
	@Before("execution(* com.samyak.aopdemo.dao.*.*())")
	public void testBeforeAdvice() {
		System.out.println("It will be executed before addAccount!!");
	}
	
}
