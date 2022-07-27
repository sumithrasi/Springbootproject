package com.customer.customer.service;
import java.util.ArrayList;

import com.customer.customer.dao.CustomerDao;
import com.customer.customer.entity.Customer;

import org.springframework.beans.factory.annotation.Autowired;
public class Customerservice1 implements Customerservice{
	@Autowired
	private CustomerDao bdao;

	@Override
	public String addcustomer( Customer b) {
		return bdao.addcustomer(b);
	}

	@Override
	public Customer viewcustomer(int customerid) {
		return bdao.viewcustomer(customerid);
	}

	@Override
	public ArrayList< Customer> viewAllcustomer() {
		return bdao.viewAllcustomer();
	}
	

	@Override
	public String updatecustomer( Customer b) {
		return bdao.updatecustomer(b);
	}

	@Override
	public String deletcustomer(int customerid) {
		return bdao.deletecustomer(customerid);

}

}

