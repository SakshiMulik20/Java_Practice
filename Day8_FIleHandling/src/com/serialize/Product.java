package com.serialize;

import java.io.Serializable;

public class Product implements Serializable{
	private int pid;
	private String name;
	private int qty;
	
	public Product(int pid, String name, int qty) {
		this.pid = pid;
		this.name = name;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getPid() {
		return pid;
	}

	@Override
	public String toString() {
		return "pid=" + pid + ", name=" + name + ", qty=" + qty;
	}
	
	
	

}
