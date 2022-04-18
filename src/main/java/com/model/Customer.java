package com.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Customer {

	@Id
	@Email(message="Email should be valid")
	private String customerEmail;
	@NotNull
	@Size(min=3,max=20)
	private String customerName;
	@NotNull
	@Size(min=10,max=400)
	private String address;
	
	@Size(min=10,max=11)
	private String mobile;
	
	
	public Customer()
	{
		
	}


	public String getCustomerEmail() {
		return customerEmail;
	}


	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
}
