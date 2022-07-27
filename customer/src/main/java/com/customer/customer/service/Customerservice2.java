package com.customer.customer.service;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.customer.customer.dao.CustomerRepo;
import com.customer.customer.entity.Customer;

import com.customer.customer.exception.CustomerNotFoundException ;
@Service
@Primary
public class Customerservice2 implements Customerservice{
	@Autowired
	CustomerRepo brepo;

	@Override
	public String addcustomer( Customer b) {
		brepo.save(b);
		return "customer Added Successfully";
	}

	@Override
	public Customer viewcustomer(int customerid) {
		return brepo.findById(customerid).orElse(null);
	}

	@Override
	public ArrayList< Customer> viewAllcustomer() {
		return (ArrayList<Customer>) brepo.findAll();
	}

	@Override
	public String updatecustomer( Customer b){
		Customer b1 = brepo.findById(b.getCustomerid()).orElse(null);
		try {
		if(b1 != null)
		{
			brepo.delete(b1);
		
		brepo.save(b);
		return "customer updated successfully..";
	}else {
		
		throw new CustomerNotFoundException();
	}
	
		}
		 catch (CustomerNotFoundException e) {
				return e.toString();
		 }
		}
		
			


	@Override
	public String deletcustomer(int customerid) {
		Customer b1 = brepo.findById(customerid).orElse(null);
		try {
		if(b1 != null)
		{
			brepo.delete(b1);
			return "customer deleted Successfully..";
		}else {
		
			throw new CustomerNotFoundException();
		}
		}
		 catch (CustomerNotFoundException e) {
				return e.toString();
		
	}

	}


}





