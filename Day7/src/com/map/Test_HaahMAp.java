package com.map;

import java.util.HashMap;

public class Test_HaahMAp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm =new HashMap<Integer , String>();
		
		hm.put(101,"Sakshi");
		hm.put(102,"Anu");
		hm.put(103,"Madhu");
		
		
		System.out.println(hm);
		hm.put(102,"rajas");
		System.out.println(hm);
		
		System.out.println(hm.get(102));
		System.out.println(hm.remove(102));
		System.out.println(hm);
		
		hm.putIfAbsent(102, "anushka");
		System.out.println(hm);
	
		System.out.println();																																		
		hm.clear();
		System.out.println(hm);
	
		
	}

}
