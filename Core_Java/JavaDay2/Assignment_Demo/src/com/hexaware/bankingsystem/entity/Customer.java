package com.hexaware.bankingsystem.entity;

import java.time.LocalDate;

public class Customer {
	
	
	private int customerId;
	private String firstName;
	
	private  LocalDate  dob;

	public Customer() {
		super();
	}

	public Customer(int customerId, String firstName, LocalDate dob) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.dob = dob;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
	
	
	

}
