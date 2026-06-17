package com.shopping.model;

public class Product {
	
	private int pid ;
	private String pname;
	private double price;
	private int quantity;
	public int getPid() {
		return pid;
	}
	
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public Product() {
		super();
		
	}
	
	public Product(int pid, String pname, double price, int quantity) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "pid=" + pid + ", pname=" + pname + ", price=" + price + ", quantity=" + quantity;
	}
	
	

}
