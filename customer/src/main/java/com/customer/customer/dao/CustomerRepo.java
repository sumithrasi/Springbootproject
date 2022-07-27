package com.customer.customer.dao;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.customer.customer.entity.Customer;
public interface CustomerRepo extends CrudRepository<Customer,Integer>{
	 
}
