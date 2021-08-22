package com.lov2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//add an initbinder ...to convert trim input string
	// remove leading and trailing wihitespaces
	// resolve whitesapce issue for our validation
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerBinder = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerBinder);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
    //Create the object of customer
		Customer theCustomer = new Customer();
		
		//load the customer object to model
		theModel.addAttribute("customer", theCustomer);
		
		return "customer-form";
	}
	
	@RequestMapping("/procesform")
	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult theBindingResult) {
		System.out.println("The binding "+theBindingResult);
		if(theBindingResult.hasErrors()) {
			return "customer-form";
		} else {
		return "customer-process-form";
	}
		

}}
