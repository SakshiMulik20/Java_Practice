package com;
import java.util.Scanner;

public class Methods_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strl = "Welcome";
		
		System.out.println(strl.toLowerCase());
		System.out.println(strl.toUpperCase());
		
		System.out.println("Contains .com"+ strl.contains(".com"));
		System.out.println("Email");
		
		Scanner sc = new Scanner(System.in);
		
		String email= sc.next();
		System.out.println("Email : " + email );
		
		if(email.endsWith(".com") && email.contains("&")) {
			System.out.println("Valid");
		}else {
			System.out.println("Not Valid");
		}
		
		System.out.println(strl.hashCode());
		System.out.println(strl.isBlank());
		System.out.println("enter string");
//		String str2=sc.next();
//	
//		if(str1.equals(str2)) {
//			
//		}

	}

}
