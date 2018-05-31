package com.eventManagement.model;

import java.util.ArrayList;

public class Customer {
	private int custID=0;
	private String cust_name;
	private String cust_contactNo;
	private String cust_addr;
	private String cust_email_ID;
	public Customer(String cust_name, String cust_contactNo, String cust_addr, String cust_email_ID) {
		super();
		//this.custID++;
		this.cust_name = cust_name;
		this.cust_contactNo = cust_contactNo;
		this.cust_addr = cust_addr;
		this.cust_email_ID = cust_email_ID;
	}
	public String getCust_name() {
		return cust_name;
	}
	public String getCust_contactNo() {
		return cust_contactNo;
	}
	public String getCust_addr() {
		return cust_addr;
	}
	public String getCust_email_ID() {
		return cust_email_ID;
	}
	
	

}
