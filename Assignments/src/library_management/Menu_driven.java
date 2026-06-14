package library_management;
import java.util.Scanner;

public class Menu_driven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Menu 1:Show All Books\r\n"
				+ " Menu 2:Add New Book\r\n"
				+ " Menu 3:Update Book\r\n"
				+ " Menu 4:Delete Book\r\n"
				+ " Menu 5:edit name \r\n"
				+ " Menu 6:edit Author\r\n"
				+ " Menu 7:edit price\r\n"
				+ " Menu 8:get book details by bookid\r\n"
				+ " Menu 9:Show All Books price >450\r\n"
				+ " Menu 10:Show All Books names only");
		
		int ch;
		Book[] bk = new Book[5];
		do {

			System.out.println("Enter your choice");
			
			switch(ch) {
			case 1 :
				for (int i = 0; i < bk.length; i++) {
                    System.out.println(bk[i]);
                }
				break;
			case 2 :
				 for (int i = 0 ; i< bk.length ; i++) {
			        	Book b2 = new Book(sc.nextInt() , sc.next() , sc.next() , sc.nextDouble());
			        	bk[i]=b2;
			        	
			        }
				break;
			case 3 
				break;
			case 4 :
				System.out.print("Enter Book ID to update: ");
				for (int i = 0; i < bk.length; i++) {
              
                        System.out.print("Enter new Name: ");
                        bk[i].setName(sc.next());
				}
				break;
			case 5 :
				System.out.print("Enter Book ID to update: ");
				for (int i = 0; i < bk.length; i++) {
             
                        System.out.print("Enter new Author: ");
                        bk[i].setAuthor(sc.next());
				}
				break;
			case 6 :
				
				System.out.print("Enter Book ID to update: ");
				for (int i = 0; i < bk.length; i++) {
             
                        System.out.print("Enter new Price: ");
                        bk[i].setPrice(sc.nextDouble());
				}
				break;
			case 7 :
				break;
			case 8 :
				break;
			case 9 :
				break;
			case 10 :
				break;
				default : System.out.println("Invalid choice");
			}
		
		}while(ch!=0);

	}

}
