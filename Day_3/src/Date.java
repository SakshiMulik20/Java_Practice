
public class Date {
	private int date , month ,year ;
	
	public void assign_date(int dd , int mm , int yy) {
		date = dd ;
		month = mm ;
		year = yy ;
	}
	
	public void show_date() {
		System.out.println(date +"/"+month+"/"+year );
	}
	
	public static void main(String[] args) {
		
		
		Date dt = new Date();
		dt.assign_date(20, 8, 2005);
		dt.show_date();
		
		Date dt1 = new Date();
		dt1.assign_date(04, 4, 2010);
		dt1.show_date();
	}

}
