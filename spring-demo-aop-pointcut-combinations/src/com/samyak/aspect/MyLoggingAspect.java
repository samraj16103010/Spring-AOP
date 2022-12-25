package com.samyak.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {
	
	@Pointcut("execution(* com.samyak.aopdemo.dao.*.*(..))")
	private void forTestBeforeAdvice() {}
	
	@Pointcut("execution(* com.samyak.aopdemo.dao.*.get*(..))")
	private void forGetters() {}
	
	@Pointcut("execution(* com.samyak.aopdemo.dao.*.set*(..))")
	private void forSetters() {}
	
	@Pointcut("forTestBeforeAdvice() && !(forGetters() || forSetters())")
	private void forTestBeforeAdviceAndNotGettersAndSetters() {}
	
	@Before("forTestBeforeAdviceAndNotGettersAndSetters()")
	public void testBeforeAdvice() {
		System.out.println("\n>>It will be executed before the forTestBeforeAdviceAndNotGettersAndSetters() pointCut!!");
	}
}
