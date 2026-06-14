import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("1.Bag:200 2.Pen:20 3.Bottle:100 4.Colourbox:150");
	
	int choice;
	int qut;
	double total = 0 ;

	
	do {
	System.out.println("Enter your choice");
	choice = sc.nextInt();
	
//	System.out.println("enter quantity");
//	qut = sc.nextInt();
//	
	
	switch(choice) {
	case 1 :
		System.out.println("Bag cost is 200rs");
		System.out.println("enter quantity");
		qut = sc.nextInt();
		total += (qut * 200);
		break;
	case 2 :
		System.out.println("Pen cost isx 20rs");
		System.out.println("enter quantity");
		qut = sc.nextInt();
		total += (qut *20);
		break;
	case 3 :
		
		System.out.println("Bottle cost is 100 Rs");
		System.out.println("enter quantity");
		
		qut = sc.nextInt();
		total += qut *100;
		break;
	case 4 :
		
		System.out.println("Colourbox cost is 150rs");
		System.out.println("enter quantity");
		qut = sc.nextInt();
		total += qut *150;
		break;
	default : System.out.println("Invalid Input");
	}
	
//	if(choice == 1 ) {
//		System.out.println("total = " + qut * 200);
//	}else if(choice == 2) {
//		System.out.println("total = " + qut * 20);
//	}else if(choice == 3) {
//		System.out.println("total = " + qut * 100);
//	}else if(choice == 4) {
//		System.out.println("total = " + qut * 150);
//	}else {
//		System.out.println("INvalid choice");
//	}
//	
	}while(choice != 0);
	System.out.println("total price is " + total);
	System.out.println("Thanks");
	}
}
