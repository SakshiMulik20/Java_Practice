package com.tester;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test_ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileReader filereader=new FileReader("MyData.txt");
			BufferedReader reader = new BufferedReader(new FileReader("MyData.txt"));
			
			String str =null ;
			while((str=reader.readLine())!=null)
			{
				System.out.println(str);
			}
			reader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
