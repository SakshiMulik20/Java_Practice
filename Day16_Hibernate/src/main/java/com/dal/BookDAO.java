package com.dal;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.pojo.Book;
import com.util.HibUtil;

public class BookDAO {
	
	
	private static SessionFactory sf;
	static {
		sf=HibUtil.getSessionFactory();
	}
	
	public BookDAO() {
		System.out.println("BookDAO created");
	}
	
	public List<Book> getAllBooks() {
		//use query object for executing HQL
		//sql:select * from book;//book is table
		//hql: from Book bk;//Book is class and bk is object
		System.out.println("Get ALL Books");
		String hql = "from Book bk";
		//Create query based on the current session 
		
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		
		Query query =session.createQuery(hql);
		
		List<Book> bookList=query.getResultList();
		
		session.getTransaction().commit();
		session.close();
		
		return bookList;
	}
	
	public void saveBook(Book newBook) {
		System.out.println("Inseide savebook"+newBook);
		Session session= sf.getCurrentSession();
		session.beginTransaction();
		
		session.save(newBook);
		
		session.getTransaction().commit();
		session.close();
		System.out.println("\nNew book added sucessfully");
		
	}
	
	public void editBook(Book bkObj) {
		
		System.out.println("\n INside edit book");
		
		//sql : update book set name =?,aurhor=? ,price=? where bid=?;
		
		Session session=sf.getCurrentSession();
		session.beginTransaction();
		
		Book objToEdit = session.get(Book.class, bkObj.getBid());
		
		if(objToEdit!=null) {
			System.out.println("Book is present to update ");
			
			objToEdit.setName(bkObj.getName());
			objToEdit.setAuthor(bkObj.getAuthor());
			objToEdit.setPrice(bkObj.getPrice());
			
			session.update(objToEdit);
			System.out.println("Updated book:"+objToEdit);
			
		}else {
			System.out.println("NO such book present to update ");
		}
		
		
		session.getTransaction().commit();
		session.close();
		System.out.println("Book updated ");
		
	}
	
	public void deleteBook(int bid) {
		
		System.out.println("Inside delete book");
		Session session =sf.getCurrentSession();
		session.beginTransaction();
		
		Book bk=session.get(Book.class , bid);
		if(bk!= null) {
			System.out.println("Book deleted:"+bk);
			session.delete(bk);
			
		}else {
			System.out.println("No such book to delete");
		}
		
		session.getTransaction().commit();
		session.close();
		System.out.println("Book deleted");
	
	}
	
	public void getBookById(int bid) {
		System.out.println("Inseide book");
		Session session=sf.getCurrentSession();
		session.beginTransaction();
		
		Book bk =session.get(Book.class, bid);
		if(bk!= null) {
			System.out.println("Book :"+bk);
		
		}else {
			System.out.println("No such book to display");
		}
		
		session.getTransaction().commit();
		session.close();
		System.out.println("Details of Book !");
	}
	
	public List<Book> getBookByAuthor(String author){
		
		System.out.println("Inside book");
		Session session=sf.getCurrentSession();
		session.beginTransaction();
		
		String hql="from Book bk where bk.author=?1";
		Query query=session.createQuery(hql);
		query.setParameter(1, author);
		
		List<Book> list=query.getResultList();
		
		session.getTransaction().commit();
		session.close();
		return list;
		
	}
	
	public List<Book> getBookByPrice(double price) {
		System.out.println("Inside book price");
		Session session=sf.getCurrentSession();
		session.beginTransaction();
		
		String hql="from Book bk where bk.price >=?1";
		Query query = session.createQuery(hql);
		
	    query.setParameter(1, price);
	    
	    List<Book> list = query.getResultList();
		
		session.getTransaction().commit();
		session.close();
		return list;
	
	}
	
	public void delBookByAuth(String author){
		
		Session session=sf.getCurrentSession();
		session.beginTransaction();
		
		String hql="delete from Book bk where bk.author=?1";
		Query query = session.createQuery(hql);
		
		query.setParameter(1, author);
		List<Book> list=query.getResultList();
		
		for(Book b:list) {
			session.delete(b);
			System.out.println("Deleted :"+ b);
		
		}
		
		
		session.getTransaction().commit();
		session.close();
		
	}

}
