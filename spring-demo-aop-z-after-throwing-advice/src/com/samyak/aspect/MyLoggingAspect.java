package com.samyak.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class MyLoggingAspect {
	@AfterThrowing(pointcut = "execution(* com.samyak.aopdemo.dao.AccountDAO.getAllAcount(..))",
			        throwing = "exceptionObj"
			       )
	public void myLogging(JoinPoint theJoinPoint,Throwable exceptionObj) {
		String method = theJoinPoint.getSignature().toShortString();
		
		System.out.println(">>Method : " + method);
		
		System.out.println(">>>Executing it After com.samyak.aopdemo.dao.AccountDAO.getAllAcount()!!!");
		
		System.out.println("Exeption Object : " + exceptionObj);
	}
}
