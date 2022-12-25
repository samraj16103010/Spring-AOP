package com.samyak.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.samyak.aopdemo.dao.AccountDAO;

@Aspect
@Component
public class MyLoggingAspect {
	@AfterReturning(pointcut = "execution(* com.samyak.aopdemo.dao.AccountDAO.getAllAcount(..))",
			        returning = "accountList"
			       )
	public void myLogging(JoinPoint theJoinPoint,List<AccountDAO> accountList) {
		String method = theJoinPoint.getSignature().toShortString();
		
		System.out.println(">>Method : " + method);
		
		System.out.println(">>>Excuting it After com.samyak.aopdemo.dao.AccountDAO.getAllAcount()!!!");
		
		System.out.println("\n>>Accounts Before Modifiation -->\n");
		for(AccountDAO acc : accountList) {
			System.out.println(acc.toString());
		}
		
		changeNamesToUpperCase(accountList);
		
		System.out.println("7\n>>Accounts After Modifiation -->\n");
		for(AccountDAO acc : accountList) {
			System.out.println(acc.toString());
		}
	}

	private void changeNamesToUpperCase(List<AccountDAO> accountList) {
		for(AccountDAO acc : accountList) {
			String name = acc.getName();
			acc.setName(name.toUpperCase());
		}
	}
}
