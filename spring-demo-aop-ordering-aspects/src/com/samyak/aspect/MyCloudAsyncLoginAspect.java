package com.samyak.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(99)
public class MyCloudAsyncLoginAspect {

	@Before("com.samyak.aspect.MyLoggingAspect.forTestBeforeAdvice()")
	public void myAsyncCloudLoginReport() {
		System.out.println(">>>Excuting it before myAsyncCloudLoginReport!!!");
	}
	
}
