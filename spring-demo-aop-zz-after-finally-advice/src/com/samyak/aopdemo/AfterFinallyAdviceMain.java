package com.samyak.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.samyak.aopdemo.dao.AccountDAO;

public class AfterFinallyAdviceMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO theAccountDao = context.getBean("daoAccount",AccountDAO.class);
		
		try {
			boolean exceptionflag = false;
			List<AccountDAO>acounts = theAccountDao.getAllAcount(exceptionflag);
		}catch (Exception e) {
			System.out.println(e + " : Gotcha an Exception!!");
		}
		
		context.close();
	}

}
