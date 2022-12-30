package com.samyak.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.samyak.aopdemo.dao.AccountDAO;

public class AfterThrowingAdviceMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO theAccountDao = context.getBean("daoAccount",AccountDAO.class);
		
		try {
			boolean exceptionflag = true;
			theAccountDao.getAllAcount(exceptionflag);
		}catch (Exception e) {
			System.out.println(e + " : Gotcha an Exception!!");
		}
		
		context.close();
	}

}
