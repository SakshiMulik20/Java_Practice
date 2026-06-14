package com.tester;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Test_CopyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(BufferedReader reader = new BufferedReader(new FileReader("MyData.txt"));
			PrintWriter writer=new PrintWriter("destination.txt");){
			
			String str = null;
			
			while((str=reader.readLine())!=null) {
				writer.println(str);
			}
			System.out.println("data copied done");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
