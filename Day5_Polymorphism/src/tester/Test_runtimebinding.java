package tester;

import myapplication.*;

public class Test_runtimebinding {

	public static void main(String[] args) {
		
//		Car c = new Car();
//		c.speed();
//		
//		BMW bmw=new BMW();
//		bmw.speed();
//		
//		Car cobj = new Ferrari();
		//Base class object can hold reference of Derived class
		
		Car baseObj = new BMW();//upcasting :implicit
		
		//baseobj compiler :car class
		//baseobj runtime :BMW class
		
		baseObj.speed();
		
		baseObj = new Nano();//upcasting
		baseObj.speed();
		
		baseObj=new Ferrari();
		baseObj.speed();
	}

}
