package com.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TesstArrayListint {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> intList=new ArrayList<Integer>();
		
		intList.add(1);
		intList.add(35);
		intList.add(99);
		intList.add(132);
		intList.add(32);
		
		//show all elements s
	
		for(int i :intList) {
			System.out.println(i + " ");
		}
		
		System.out.println();
		
		//search elemnent at index 
		System.out.println("Enter index value :");
		int index=sc.nextInt();
		System.out.println("Element :"+ intList.get(index));
		
		System.out.println("Search 32 in list:" + intList.contains(32));

		System.out.println("Remove element at o]index");
		int r =sc.nextInt();
		
		intList.remove(r);
		
		System.out.println("After remove:"+intList);
		System.out.println("----sort-----");
		
		Collections.sort(intList);
		System.out.println(intList);
		
		
		
		
		
	}

}
