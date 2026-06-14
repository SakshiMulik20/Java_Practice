package tester;

import myapplication.*;

public class Test_downcasting {
	
	
	public static void startCar()

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car obj = new Ferrari();//upacsting implicily
		
//		obj.abs();
		
//		obj=new Ferrari();
		
//		BMW bmw = (BMW) obj;//downcasting 
//		bmw.abs();
		//Class cast Excepiton 
		//to avoid those use RTTI:Run time type identification
		
		//instanceof operator
		if(obj instanceof Ferrari) {
			Ferrari fr= (Ferrari) obj;
			fr.nos();
			System.out.println("Down casting for ferrari done");
			
		}else if(obj instanceof BMW) {
			BMW bmw=(BMW) obj;
			bmw.abs();
			System.out.println("Down casting for BMW done");
			
		}else if (obj instanceof Nano) {
			Nano nano = (Nano) obj;
			nano.nanoDisplay();
			System.out.println("Down casting for Nano done");
		}
		
		

	}

}
