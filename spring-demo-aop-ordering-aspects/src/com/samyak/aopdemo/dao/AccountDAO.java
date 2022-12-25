package com.samyak.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.samyak.aopdemo.Account;

@Component(value = "daoAccount")
public class AccountDAO {
	
	public void addAccount(Account theAccount) {
		System.out.println(getClass() + " ADDING ACCOUNT!\n");
	}
	
	public void goToSleep() {
		System.out.println(getClass() + " GO TO SLEEP AFTER ASSIGNMENT COMPLETION...\n");
	}
}
