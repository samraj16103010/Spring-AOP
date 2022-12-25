package com.samyak.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Aspect
@Component
@Order(0)
public class MyTestAnalyticsAspect {
	
	@Before("com.samyak.aspect.MyLoggingAspect.forTestBeforeAdvice()")
	public void myTestAnalticsReport() {
		System.out.println(">>>Excuting it before myTestAnalytisReport!!!");
	}
	
}
