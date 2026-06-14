package com.shop;

import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ProductUtil {
	
	public static ArrayList<Product> getAllPrds(){
		
		ArrayList<Product> allPrds=new ArrayList<Product>();
		
		allPrds.add(new Product(102 , "cake" , 20));
		allPrds.add(new Product(103 , "cake" , 20));
		allPrds.add(new Product(104 , "cake" , 20));
		allPrds.add(new Product(105 , "cake" , 20));
		allPrds.add(new Product(106 , "pen" , 27));
		
		return allPrds;
	}
	
	
		public static void writePrdIntofile(String filename,ArrayList<Product> list) {
			
			try {
				//object for writinf=g data into file 
				PrintWriter writer = new PrintWriter(filename);
				
				//read from arraylist 
				for(Product p : list) {
					
					writer.println(p);
					
				}
				writer.close();
				System.out.println("done");
				
			}catch (FileNotFoundException e) {
				e.printStackTrace();
		}
		
		}

}
