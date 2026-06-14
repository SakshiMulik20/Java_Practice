package tester;
import java.util.Scanner;

import myapplication.*;


public class Test_Mennudriven {

	public static void main(String[] args) {
		
		System.out.println("1.Ferrari 2.BMW 3.Nano 4.Start Race ");
		
		int ch ;
		Scanner sc = new Scanner(System.in);
		
		Car[] myCars= new Car[3];//null null null
		int index = 0 ;
		
		do {
			System.out.println("Enter choice");
			ch=sc.nextInt();
			
			switch(ch) {
			case 1 :
				if(index < myCars.length) {
				Ferrari fobj = new Ferrari();
				myCars[index]=fobj;
				index++;
				System.out.println("Ferrari added");}
				else {
					System.out.println("__Full__");
				}
				break;
				
			case 2 :
				if(index < myCars.length) {
				BMW bobj = new BMW();
				myCars[index]=bobj;
				index++;
				System.out.println("BMW added");}
				else {
					System.out.println("__Full__");
				}
				break;
				
			case 3 :
				if(index < myCars.length) {
				Nano nobj = new Nano();
				myCars[index]=nobj;
				index++;
				System.out.println("Nano added");}
				else {
					System.out.println("__Full__");
				}
				break;
				
			case 4 :
				System.out.println("start racing");
				for(int i = 0 ; i <myCars.length;i++) {
					if(myCars[i]!=null) {
					myCars[i].speed();}
				}
				break;
			default : System.out.println("Invalid choice!");
			}
			
		}while(ch!=0);
		System.out.println("Thankyou for using app");
		
	}

}
