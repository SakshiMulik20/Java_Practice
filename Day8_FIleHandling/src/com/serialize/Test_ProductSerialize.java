package com.serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test_ProductSerialize {
	
	public static void main(String[] args) {
		
		try {
			ObjectOutputStream writer=new ObjectOutputStream(new FileOutputStream("Product.dat"));
			Product prd =new Product(11 , "cake".)
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}{
			
		}
	}

}
