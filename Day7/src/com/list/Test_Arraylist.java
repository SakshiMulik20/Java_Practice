package com.list;
import java.util.ArrayList;

public class Test_Arraylist {
	
	public static void main(String[] args) {
		
		ArrayList<String> strList=new ArrayList<String>();
		
		System.out.println("Isempty: "+strList.isEmpty() + "Size=" + strList.size());
		
		strList.add("Ram");
		System.out.println("Isempty:" + strList.isEmpty() + "Size=" + strList.size());
		
		strList.add("Sham");
		strList.add("Sakshi");
		strList.add("ANushka");
		System.out.println("IsEmpty:" + strList.isEmpty() + "Size=" + strList.size());
		System.out.println(strList);
		System.out.println();
		
		
		
		//display elements 
		for(String str:strList) {
			System.out.println(str);
		}
		
		//search element 
	}

}
