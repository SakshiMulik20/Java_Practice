package com.tester;

import java.util.Scanner;

public class Tester_Customer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ch;

		HashSet<Customer> myCustomer;

		do {
			System.out.println("choice");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				for(Customer c:myCustomer) {
					System.out.println(c);
				}
				break;
			case 2:
				System.out.println("Enter id ,name ,emial , age");
				try {
					customerCRUD.createCustomer(sc.nextInt() , sc.next() , sc.next() , sc.nextInt())
				}catch(CustomerException ex){az
					ex: 
				}
				break;
			}

		} while (ch != 0);

	}

}
