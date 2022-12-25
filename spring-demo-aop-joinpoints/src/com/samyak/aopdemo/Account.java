package com.samyak.aopdemo;

import org.springframework.stereotype.Component;

@Component
public class Account {
	private String name;
	private String serviceCode;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Inside name Setter");
		this.name = name;
	}
	public String getServiceCode() {
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		System.out.println("Inside serviceCode Setter");
		this.serviceCode = serviceCode;
	}
	
	@Override
	public String toString() {
		return "Account [name=" + name + ", serviceCode=" + serviceCode + "]";
	}
}
