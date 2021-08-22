package com.lov2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	private String firstName;
	
	//adding validation for lastName
	
	@NotNull(message="LastName is Required")
	@Size(min=1, message="LastName is required")
	private String lastName;
	
	
	//adding validation
	//make it required field keep in mind datatype sould be Integer
	@NotNull(message="cannot be null !!!")
	@Min(value=0, message="Must be greater or equal to 0")
	@Max(value=10,message="Must be less or equal to 10")
	private Integer freePass;
	
	//adding validation using RegExp for postal code
	@Pattern(regexp="^[a-zA-Z0-9]{5}",message="only 5 char/digits")
	@NotNull(message="Postal Code Cannot be null !!")
	private String postalCode;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getFreePass() {
		return freePass;
	}
	public void setFreePass(Integer freePass) {
		this.freePass = freePass;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	

}
