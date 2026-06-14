
package com.my;

import java.util.Scanner;

public class Tester_trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		Scanner sc =new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = a / b;
		System.out.println(c);
		
		
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	
	}

}
