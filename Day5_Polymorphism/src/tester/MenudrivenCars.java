package tester;
import java.util.Scanner;

import myapplication.BMW;
import myapplication.Ferrari;
import myapplication.Nano;

public class MenudrivenCars {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Choose Car for details ");
		
		int ch;
		do {
			System.out.println("1.Nano 2.Ferrari 3.BMW ");
			ch=sc.nextInt();
	
			switch(ch) {
			case 1 :
				Nano nano = new Nano();
				nano.speed();
				nano.safety();
				break;
				
			case 2 :
				Ferrari fr= new Ferrari();
				fr.speed();
				fr.safety();
				break;
				
			case 3 :
				BMW bmw = new BMW();
				bmw.speed();
				bmw.safety();
				break;
				default : System.out.println("Invalid choice");
				
			}
			
			
		}while(ch!=0);



		
	}

}
