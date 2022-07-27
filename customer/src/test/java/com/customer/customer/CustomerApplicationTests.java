package com.customer.customer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.customer.customer.service.Customerservice2;
@SpringBootTest
class CustomerApplicationTests {
	@Autowired
	
		Customerservice2 psvc;
		
		@Test
		public void testDeletecustomer1() {
			assertEquals("customer Not Found...",psvc.deletcustomer(105));
		}

		@Test
		public void testDeleteProduct1()
		{
			assertEquals(" Deleted Successfully...",psvc.deletcustomer(101));
		}
		
		
		
	

	}


