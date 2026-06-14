package com.shopping;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Test_Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Product> shop =ProductUtil.getAllprds();
		
		System.out.println(shop.size());
		
		System.out.println("enter id name price");
		
		shop.add(new Product(sc.nextInt(),sc.next(),sc.nextDouble()));
		
		System.out.println("---show all----");
		for(Product p:shop) {
			System.out.println(p);
		}
		
		System.out.println("Search accorfing to index no.");
		int index=sc.nextInt();
		
		System.out.println(shop.get(index));
		
		System.out.println("__sort__");
		Collections.sort(  );

	}

}
