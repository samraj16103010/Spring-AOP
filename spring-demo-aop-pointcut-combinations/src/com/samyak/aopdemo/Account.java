package com.samyak.aopdemo;

public class Account {
	private String name;
	private String serviceCode;
	
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
	
	@Override
	public String toString() {
		return "Account [name=" + name + ", serviceCode=" + serviceCode + "]";
	}
}
