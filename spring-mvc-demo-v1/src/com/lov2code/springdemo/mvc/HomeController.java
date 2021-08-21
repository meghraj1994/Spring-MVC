package com.lov2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
     @RequestMapping("/")
	public String showPage() {
		return "main-page";
	}
     
     
     @RequestMapping("/form")
     public String studentForm() {
    	 return "form";
     }
     
     @RequestMapping("/response")
     public String getResponse() {
    	 return "response-page";
     }

}
