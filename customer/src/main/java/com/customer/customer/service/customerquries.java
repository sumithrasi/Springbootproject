package com.customer.customer.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.customer.dao.Customerquries2;
import com.customer.customer.entity.Customerquries1;

@Service
public class customerquries {
	@Autowired
	private Customerquries2 bao;

	public String addCustomerquries(Customerquries1 p) {
		bao.save(p);
		return "Query registered successfully!";
	}
	
	public ArrayList< Customerquries1> viewAllQueries() {
		return (ArrayList<Customerquries1>) bao.findAll();
	}
}
