package com.set;
import com.code.Customer;


import java.util.HashSet;
import java.util.TreeSet;

public class test_Hashset {

	public static void main(String[] args) {
		
		HashSet<Integer> hset=MySetUtil.getAllNumbers();
		System.out.println(hset);
		
		hset.add(22);
		hset.add(55);
		System.out.println(hset);
		
		System.out.println(hset.contains(55));
		
		System.out.println(hset.remove(20));
		System.out.println(hset);
		
//		hset.clear();
		
//		Collections.sort(null);
		
		TreeSet<Integer> sortedNumbers=new TreeSet<Integer>(hset);
		System.out.println("Sprted");
		System.out.println(sortedNumbers);

	}
}
 