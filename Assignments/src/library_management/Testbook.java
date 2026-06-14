package library_management;
import java.util.Scanner;

public class Testbook {
	public static void main(String[] args) {
		
		Book[] bk = new Book[5];
	    Scanner sc = new Scanner(System.in);
	    
	    Book b1 = new Book();
        System.out.println(b1);
        
        for (int i = 0 ; i< bk.length ; i++) {
        	Book b2 = new Book(sc.nextInt() , sc.next() , sc.next() , sc.nextDouble());
        	bk[i]=b2;
        	
        }
        
        for (int i = 0 ; i< bk.length ; i++) {
        	System.out.println(bk[i]);
        	
        }
	}
}
