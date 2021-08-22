package com.luv2code.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	//define default value for coursecode
	//to validate with multiple string
	//public String[] value() default {"LUV","TOPS"};
	public String value() default "LUV"; 
	
	//define default error message
	public String message()  default "Must Start with LUV" ;
	
	//define default group :
	public Class<?>[] groups() default {};
	
	//defina default payloads  payload : provide custom details about validation failure (severity level , error code etc;
	
	public Class<? extends Payload>[] payload() default {};
	
	
	

}
