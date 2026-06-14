package com.shopping;

public class Product implements Comparable<Product> {
	private int prid;
	private String name;
	private double price;
	
	public Product(int prid, String name, double price) {
		this.prid = prid;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [prid=" + prid + ", name=" + name + ", price=" + price + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPrid() {
		return prid;
	}
	

	@Override
	public int compareTo(Product o) {
    //default sort by prid
		if(this.prid<o.prid)
			return -1;
		else if(this.prid>o.prid)
			return 1;
		else
			return 0;
	
}
	

}
