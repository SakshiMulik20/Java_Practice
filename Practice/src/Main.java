import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter num1 and num2");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		
//		System.out.println(num1);
//		System.out.println(num2);
//		
		
//		if(num1%2==0 && num1>=50) {
//			System.out.println("Num1 is even");
//		}else {
//			System.out.println("Num1 is odd");
//		}
		
		for(int i = 1 ; i < 11 ; i++) {
			if(i%2 == 0 ) {
				System.out.println(i);
			}
		}
		for(int i = 1 ; i < 11 ; i++) {
			if(i%2 != 0) {
				System.out.println(i);
			}
		}
		System.out.println("----------------");
		for(int i = 1 ; i < 11; i++) {
			if(i == 5) {
				continue;
			}
			System.out.println(i*2);
		}
		System.out.println("---------While loop----------------");
		
		int num1 =1 ;
		while(num1<11) {
			
			System.out.println(num1);
			num1++;
			
		}
		
		System.out.println("--------------------------");
		num1 = 1;
		
		do {
			if(num1 % 2 == 0)
		
			System.out.println(num1);
			num1++;
			
		}while(num1<11);
	}

}
