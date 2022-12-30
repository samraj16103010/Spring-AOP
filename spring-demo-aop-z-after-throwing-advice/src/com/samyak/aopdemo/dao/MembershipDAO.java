package com.samyak.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	public void addAccount() {
		System.out.println(getClass() + " ADDING THE MEMBERSHIP ACCOUNT\n");
	}
	
	public boolean addSillyMemberAccount() {
		System.out.println(getClass() + " ADDING THE SILLY MEMBER ACCOUNT\n");
		return true;
	}
}
