package com.shopping;
import java.util.ArrayList;

public class ProductUtil {
	
	public static ArrayList<Product> getAllprds(){
		ArrayList<Product> list = new ArrayList<Product>();
		
		Product P1 = new Product(20 , "Pen" , 15);
		list.add(P1);
		
		list.add(new Product(21 , "book" , 95));
		list.add(new Product(22 , "scale" , 10));
		list.add(new Product(23 , "bottle" , 105));
		list.add(new Product(24 , "pecil" , 12));
		
		return list;
	
	}

}
