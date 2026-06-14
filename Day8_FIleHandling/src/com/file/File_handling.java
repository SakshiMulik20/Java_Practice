package com.file;

import java.io.File;
import java.io.IOException;

//import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class File_handling {

	public static void main(String[] args) throws IOException {
		
		String filename = "C:\\test.txt"; ;
		
		File file = new File(filename);
		
		if(file.exists()) {
			System.out.println("File exists");
			System.out.println("Name" + file.getName());
			System.out.println("Canread" + file.canRead());
			System.out.println("CanWrite" + file.canWrite());
			System.out.println("Name1:" + file.getAbsolutePath());
			System.out.println("Length " + file.length());
		}
		else {
			System.out.println("Not exist ");
			//not exist then create 
			file.createNewFile();
			System.out.println("created");
		}
		
	}
}
 