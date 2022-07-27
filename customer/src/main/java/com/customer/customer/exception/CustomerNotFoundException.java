package com.customer.customer.exception;

public class CustomerNotFoundException extends Exception{

	@Override
	public String toString() {
		return "Invalid customer...";
	}
}
