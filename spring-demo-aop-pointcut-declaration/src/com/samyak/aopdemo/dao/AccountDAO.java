package com.samyak.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.samyak.aopdemo.Account;

@Component(value = "daoAccount")
public class AccountDAO {
	private String name;
	private String serviceCode;
	
	public void addAccount(Account theAccount) {
		System.out.println(getClass() + " ADDING ACCOUNT!\n");
	}
	
	public void goToSleep() {
		System.out.println(getClass() + " GO TO SLEEP AFTER ASSIGNMENT COMPLETION...\n");
	}

	public String getName() {
		System.out.println(">>Inside the getter of name...");
		return name;
	}

	public void setName(String name) {
		System.out.println(">>Inside the setter of name...");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(">>Inside the getter of serviceCode...");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(">>Inside the setter of serviceCode...");
		this.serviceCode = serviceCode;
	}
}
