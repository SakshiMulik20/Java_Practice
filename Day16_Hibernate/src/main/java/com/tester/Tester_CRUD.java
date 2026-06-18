package com.tester;

import java.util.List;
import java.util.Scanner;

import com.dal.BookDAO;
import com.pojo.Book;

public class Tester_CRUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hibernate CRUD");
		System.out.println("!.Show ALL Books");
		System.out.println("2.Add new Book");
		System.out.println("3.Edit Book details");
		System.out.println("4.Remove Book");
		System.out.println("5.Get book by id");
		System.out.println("6.Get book by author");
		System.out.println("7.Get book by Price");
		System.out.println("8.Delete book by Author");
		
		BookDAO bookDao=new BookDAO();
		
		
		Scanner sc = new Scanner(System.in);
		int ch;
		
		do {
		System.out.println("Enter choice \n");
		ch=sc.nextInt();
		
		switch(ch) {
		
		case 1 :
			for(Book bk:bookDao.getAllBooks()) {
				System.out.println(bk);
			}
			break;
		case 2 : 
			System.out.println("Bookid name Author Price");
			Book bk = new Book(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble());
			bookDao.saveBook(bk);
			break;
		case 3 :
			System.out.println("Enter Bookid to edit");
			int id = sc.nextInt();
			System.out.println("Enter name author price");
			String nm = sc.next();
			String auth=sc.next();
			double pr =sc.nextDouble();
			
			bookDao.editBook(new Book(id , nm ,auth ,pr));
			break;
		case 4 : 
			System.out.println("Enter Bookid to delete");
			int id1= sc.nextInt();
			
			bookDao.deleteBook(id1);
			
			break;
		case 5 : 
			System.out.println("Enter Bookid to display details");
			int id2= sc.nextInt();
			
			bookDao.getBookById(id2);
			break;
		case 6 :
			System.out.println("Enter name of author");
			List<Book> bks=bookDao.getBookByAuthor(sc.next());
			for(Book b :bks) {
				System.out.println(b);
			}
			break;
		    default:System.out.println("Invalid choice!");
		case 7:
		    System.out.println("Enter the price to search books");
		    List<Book> bk1=bookDao.getBookByPrice(sc.nextDouble());
		    for(Book b:bk1) {
		    	System.out.println(b);
		    }	
			break;
		case 8:
			System.out.println("Enter name of author ");
			bookDao.delBookByAuth(sc.next());
			break;
			
		}
		
	}while(ch!=0);
		System.out.println("----end----");

	}
}
