package com.samyak.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.samyak.aopdemo.dao.AccountDAO;

public class AfterReturningAdviceMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO theAccountDao = context.getBean("daoAccount",AccountDAO.class);
		
		theAccountDao.getAllAcount();
		
		context.close();
	}

}
