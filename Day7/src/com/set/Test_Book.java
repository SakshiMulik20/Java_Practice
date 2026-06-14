package com.set;

import java.util.HashSet;
import java.util.TreeSet;

public class Test_Book {

	public static void main(String[] args) {
		
		HashSet<Book> library = BookUtil.getAllBooks();
		
		System.out.println(library);
		
		System.out.println();
		for(Book bk:library) {
			System.out.println(bk);
		}
		
		TreeSet<Book> sortedset=new TreeSet<Book>(library);
		System.out.println("sorted array");
		for(Book bk:sortedset) {
			System.out.println(bk);
		}
		
	}

}
