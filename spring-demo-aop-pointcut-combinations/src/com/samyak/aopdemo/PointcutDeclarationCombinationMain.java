package com.samyak.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.samyak.aopdemo.dao.AccountDAO;
import com.samyak.aopdemo.dao.MembershipDAO;

public class PointcutDeclarationCombinationMain {

	public static void main(String[] args) {
		//creating the spring container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//retrieving the required beans from spring container
		AccountDAO theAccountDao = context.getBean("daoAccount",AccountDAO.class);
		MembershipDAO theMembershipDao = context.getBean("membershipDAO",MembershipDAO.class);
		
		//creating the account object and set parameters
		Account accountObj = new Account();
		accountObj.setName("Rafel");
		accountObj.setServiceCode("Platinum");
		
		//call the setters
		theAccountDao.setName("Thomas");
		theAccountDao.setServiceCode("Gold");
		
		//call the getters
		String name = theAccountDao.getName();
		String serviceCode = theAccountDao.getServiceCode();
		
		////call the member functions of AccountDAO
		theAccountDao.addAccount(accountObj);
		theAccountDao.goToSleep();
		
		//call the member functions pf MembershipDAO
		theMembershipDao.addAccount();
		theMembershipDao.addSillyMemberAccount();
		
		//close the context
		context.close();
	}

}
