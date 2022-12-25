package com.samyak.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(-8)
public class MyLoggingAspect {
	
	@Pointcut("execution(* com.samyak.aopdemo.dao.*.*(..))")
	public void forTestBeforeAdvice() {}
	
	@Before("forTestBeforeAdvice()")
	public void myLoggingReport() {
		System.out.println(">>>Excuting it before myLoggingReport!!!");
	}
	
}
