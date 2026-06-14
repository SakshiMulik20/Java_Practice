package com.set;

public class Book implements Comparable<Book> {
	private int bookid;
	private String bname;
	private double bprice;
	
	public Book(int bookid, String bname, double bprice) {
		this.bookid = bookid;
		this.bname = bname;
		this.bprice = bprice;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public double getBprice() {
		return bprice;
	}
	public void setBprice(double bprice) {
		this.bprice = bprice;
	}
	public int getBookid() {
		return bookid;
	}
	@Override
	public String toString() {
		return "bookid=" + bookid + ", bname=" + bname + ", bprice=" + bprice ;
	}
	@Override
	public int compareTo(Book o) {
		if(this.bookid<o.bookid)
			return -1;
		else if(this.bookid>o.bookid)
			return 1;
		else 
		return 0;
	}
	
	

}
