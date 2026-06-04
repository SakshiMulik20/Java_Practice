
public class Book {
	private int Bid ;
	private String name;
	private String author;
	private double price;
	
	public void assign_details(int id ,String n , String au ,double p ) {
		Bid = id ;
		name = n ;
		author = au ;
		price = p ;
		
	}
	
	public void display() {
		System.out.println("--------Book details-------");
		System.out.println(Bid + " " + name +" "+ author +" "+ price+ "\n");
	}
	

}
