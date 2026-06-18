package com.pojo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Book {
	
	@Id
	private int bid;
	@Column
	private String name;
	@Column
	private String author;
	@Column
	private double price;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Book(int bid, String name, String author, double price) {
		this.bid = bid;
		this.name = name;
		this.author = author;
		this.price = price;
	}


	public int getBid() {
		return bid;
	}


	public void setBid(int bid) {
		this.bid = bid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "bid=" + bid + ", name=" + name + ", author=" + author + ", price=" + price;
	}
	
	
	
	
	

}
