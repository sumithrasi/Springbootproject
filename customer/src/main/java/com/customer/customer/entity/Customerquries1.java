package com.customer.customer.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity

public class Customerquries1 {
	@Id
	
	private int customerid;
	private String customerquries;
	public Customerquries1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customerquries1(int customerid, String customerquries) {
		super();
		this.customerid = customerid;
		this.customerquries = customerquries;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomerquries() {
		return customerquries;
	}
	public void setCustomerquries(String customerquries) {
		this.customerquries = customerquries;
	}
	@Override
	public String toString() {
		return "customerquries [customerid=" + customerid + ", customerquries=" + customerquries + "]";
	}
	

}
