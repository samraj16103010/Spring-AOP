package com.samyak.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.samyak.aopdemo.Account;

@Component(value = "daoAccount")
public class AccountDAO {
	private String name;
	private String serviceCode;
	
	public AccountDAO() {	}

	public AccountDAO(String name, String serviceCode) {
		this.name = name;
		this.serviceCode = serviceCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public void addAccount(Account theAccount) {
		System.out.println(getClass() + " ADDING ACCOUNT!\n");
	}
	
	public void goToSleep() {
		System.out.println(getClass() + " GO TO SLEEP AFTER ASSIGNMENT COMPLETION...");
	}
	
	public List<AccountDAO> getAllAcount(boolean exceptionflag){
		if(!exceptionflag) {
			System.out.println(">>Inside com.samyak.aopdemo.dao.AccountDAO.getAllAcount()");
			List<AccountDAO>accounts = new ArrayList<AccountDAO>();
			
			accounts.add(new AccountDAO("Jack", "Gold"));
			accounts.add(new AccountDAO("Paul", "Silver"));
			accounts.add(new AccountDAO("Jimmy", "Platinum"));
			
			return accounts;
		}else {
			System.out.println(">>Craving for some exeption...");
			throw new ArithmeticException();
		}
	}

	@Override
	public String toString() {
		return "AccountDAO [name=" + name + ", serviceCode=" + serviceCode + "]";
	}
}