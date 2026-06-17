package com.shopping.model;

public class Customer {
	private int id;
	private String name, email,pwd;
	public Customer(int id, String name, String email, String pwd) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.pwd = pwd;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", pwd=" + pwd + "]";
	}
	
	
	

}
