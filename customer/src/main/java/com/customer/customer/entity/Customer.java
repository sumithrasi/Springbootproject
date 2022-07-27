package com.customer.customer.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Customer {
	@Id
	
	private int customerid;
	
	private String customername;
	
	private int phoneno;
	
	private String address;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerid, String customername, int phoneno, String address) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.phoneno = phoneno;
		this.address = address;
		
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customername=" + customername + ", phoneno=" + phoneno
				+ ", address=" + address + "]";
	}
	
	
	
	
	}
	
	

