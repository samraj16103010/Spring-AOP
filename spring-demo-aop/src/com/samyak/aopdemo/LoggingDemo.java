package com.samyak.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.samyak.aopdemo.dao.AccountDAO;
import com.samyak.aopdemo.dao.MembershipDAO;

public class LoggingDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO theAccountDao = context.getBean("daoAccount",AccountDAO.class);
		MembershipDAO theMembershipDao = context.getBean("membershipDAO",MembershipDAO.class);
		
		theAccountDao.addAccount();
		theMembershipDao.addAccount();
		theMembershipDao.addSillyMemberAccount();
		
		context.close();
	}

}
