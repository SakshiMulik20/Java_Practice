package com.set;

import java.util.HashSet;

public class BookUtil {

	public static HashSet<Book> getAllBooks(){
		
		HashSet<Book> books=new HashSet<Book>();
		
		books.add(new Book(20 , "hello" , 900));
		books.add(new Book(37, "hii" , 400));
		books.add(new Book(290 , "hey" , 90));
		books.add(new Book(90 , "welcome" , 450));
		books.add(new Book(38 , "bye" , 200));
		books.add(new Book(91 , "hhahah" , 20));
		
		return books;
	}
}
