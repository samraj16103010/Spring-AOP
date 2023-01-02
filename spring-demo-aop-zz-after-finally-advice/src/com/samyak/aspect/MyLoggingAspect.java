package com.samyak.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class MyLoggingAspect {
	@After("execution(* com.samyak.aopdemo.dao.AccountDAO.getAllAcount(..))")
	public void afterFinallyAdviceMethod(JoinPoint theJoinPoint) {
		String method = theJoinPoint.getSignature().toShortString();
		
		System.out.println(">>Method : " + method);

		System.out.println(">>Inside the After Finally Advice ...");
	}
	
	@AfterThrowing(pointcut = "execution(* com.samyak.aopdemo.dao.AccountDAO.getAllAcount(..))",
			        throwing = "exceptionObj"
			       )
	public void afterThrowAdvieMetid(JoinPoint theJoinPoint,Throwable exceptionObj) {
		String method = theJoinPoint.getSignature().toShortString();
		
		System.out.println(">>Method : " + method);
		
		System.out.println(">>>Executing it After com.samyak.aopdemo.dao.AccountDAO.getAllAcount()!!!");
		
		System.out.println(">>Inside the After Throw Advice ...");
		
		System.out.println("Exeption Object : " + exceptionObj);
	}
}
