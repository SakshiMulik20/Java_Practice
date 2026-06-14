package com.shapes;
//instance of object class not allowed 
//It must be inherited
public abstract class Shape {
	//methods a re non implemented methods
	//methods will be implemented in child class 
	//inherit abstract class and override abstract methods 
	public abstract void area();
	
	public void display() {
		System.out.println("Noraml method");
	}

}
