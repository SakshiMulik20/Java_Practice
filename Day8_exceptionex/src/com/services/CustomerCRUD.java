package com.services;
import com.code.*;
import com.util.CustomeException;
import com.util.ValidationRules;

public class CustomerCRUD {
	public static HashSet<Customer> 
	
	private static void createCustomer(int custid, String name ,String email ,int age ) throws CustomeException {
		ValidationRules.validateEmail(email);
		ValidationRules.validateAge(age);
	}
	
	

}
