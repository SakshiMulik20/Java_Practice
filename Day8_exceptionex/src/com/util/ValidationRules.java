package com.util;

public class ValidationRules {
	
	public static void validateEmail(String email) throws CustomeException{
		if(!email.contains("@") || !email.endsWith("com"))
			throw new CustomeException("Inavalid Email id");
	}
	
	public static void validateAge(int age) throws CustomeException {
		
		if(age<18 || age>80) {
			throw  new CustomeException("The age is invalid");
		}
	}
		
	}

