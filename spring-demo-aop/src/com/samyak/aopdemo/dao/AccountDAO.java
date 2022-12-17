package com.samyak.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component(value = "daoAccount")
public class AccountDAO {
	
	public void addAccount() {
		System.out.println(getClass() + "ADDING ACCOUNT!");
	}
	
}
