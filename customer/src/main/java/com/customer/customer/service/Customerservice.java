package com.customer.customer.service;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.customer.customer.entity.Customer;
@Service
public interface Customerservice {
	String addcustomer( Customer b);
	Customer viewcustomer(int customerid);
	ArrayList< Customer> viewAllcustomer();
	String updatecustomer( Customer b);
	String deletcustomer(int customerid);


}
