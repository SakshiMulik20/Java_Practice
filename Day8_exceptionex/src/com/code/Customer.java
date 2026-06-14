
package com.code;

public class Customer {
	
	private int cudtid;
	private String name ,email;
	private int age;
	
	public Customer(int cudtid, String name, String email, int age) {
		this.cudtid = cudtid;
		this.name = name;
		this.email = email;
		this.age = age;
		System.out.println("Customer created sucessfully");
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCudtid() {
		return cudtid;
	}
	@Override
	public String toString() {
		return "Customer [cudtid=" + cudtid + ", name=" + name + ", email=" + email + ", age=" + age + "]";
	}
	
	

}
