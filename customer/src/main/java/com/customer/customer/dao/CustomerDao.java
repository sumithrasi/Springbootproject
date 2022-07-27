package com.customer.customer.dao;

import java.util.ArrayList;

import com.customer.customer.entity.Customer;


public class CustomerDao {
	
	private ArrayList<Customer> blist = new ArrayList<Customer>();

	public String addcustomer(Customer b) {
		blist.add(b);
		return "customer added successfully...";
	}


	public Customer viewcustomer(int customerid) {
		for( Customer b:blist)
		{
			if(b.getCustomerid()  == customerid)
			{
				return b;
			}
		}
		return null;
	}


	public ArrayList<Customer> viewAllcustomer() {
		return blist;
	}


	public String updatecustomer( Customer b) {
		for( Customer b1:blist)
		{
			if(b1.getCustomerid() == b.getCustomerid())
			{
				b1.setCustomername(b.getCustomername());
				b1.setPhoneno(b.getPhoneno());
				b1.setaddress(b.getaddress());
				
				return "customer updated successfully...";
			}
		}
		blist.add(b);
		return "customer added successfully...";
	}


	public String deletecustomer(int customerid) {
		for(int i=0; i<blist.size(); i++)
		{
			if(blist.get(i).getCustomerid() == customerid)
			{
				blist.remove(blist.get(i));
				return "customer deleted Successfully";
			}
		}
		return "customer not found";
	}
	}

