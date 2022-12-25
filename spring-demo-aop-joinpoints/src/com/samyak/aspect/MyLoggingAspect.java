package com.samyak.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.aspectj.weaver.IHasSourceLocation;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.samyak.aopdemo.Account;

@Aspect
@Component
@Order(-8)
public class MyLoggingAspect {
	
	@Pointcut("execution(* com.samyak.aopdemo.dao.*.*(..))")
	public void forTestBeforeAdvice() {}
	
	@Before("forTestBeforeAdvice()")
	public void myLoggingReport(JoinPoint theJoinPoint) {
		System.out.println(">>>Excuting it before myLoggingReport!!!");
		
		MethodSignature methodSign = (MethodSignature)theJoinPoint.getSignature();
		System.out.println("The Method Signature is : " + methodSign);
		
		Object[] objArr = theJoinPoint.getArgs();
		for(Object obj : objArr) {
			System.out.println(obj);
			
			if(obj instanceof Account) {
				Account account = (Account)obj;
				
				System.out.println("Name : " + account.getName());
				System.out.println("Service Code : " + account.getServiceCode());
			}
		}
		
	}
	
}
