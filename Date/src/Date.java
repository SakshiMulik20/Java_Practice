
public class Date {
	private int date ;
	private int month ;
	private int year ;
	
	public Date() {
		System.out.println("----Defautlt constructor----");
		date = 20 ;
		month = 8;
		year= 2005;
	}
	
	public Date(int i , int j ,int k) {
		System.out.println("Date parameter constructor");
		date = i ;
		month = j ;
		year = k ;
		
	}

}
