package com.samyak.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.samyak.aopdemo.dao.AccountDAO;
import com.samyak.aopdemo.dao.MembershipDAO;

public class JoinPointMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO theAccountDao = context.getBean("daoAccount",AccountDAO.class);
		MembershipDAO theMembershipDao = context.getBean("membershipDAO",MembershipDAO.class);
		
		//setting the account object params
		Account accountObj = new Account();
		accountObj.setName("Paul");
		accountObj.setServiceCode("Silver");
		
		//calling the methods of account dao and membership dao 
		theAccountDao.addAccount(accountObj);
		theAccountDao.goToSleep();
		theMembershipDao.addAccount();
		theMembershipDao.addSillyMemberAccount();
		
		context.close();
	}

}
