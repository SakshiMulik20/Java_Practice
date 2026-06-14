package com;

import java.util.Locale.Category;

public class Product {
	
	private int prid;
	private String pName;
	private Date dom;
//	private Date doe;//expiry
//	private Date dop;
	private String category;
	private Category prdCate;
	
	public Product(int prid, String pName, Date dom ,String prdCate) {
		this.prid = prid;
		this.pName = pName;
		this.dom = dom;
		this.prdCate=Category.valueOf(prdCate);
	}
	@Override
	public String toString() {
		return "prid=" + prid + "pName=" + pName + ", dom=" + dom;
	}
	
		
	

}
