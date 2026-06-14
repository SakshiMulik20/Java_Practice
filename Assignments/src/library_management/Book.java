package library_management;

public class Book {
	private int bookId;
    private String name, author;
    private double price;
    
    public Book() {
    	System.out.println("Default constructor");
    }
    
	public Book(int bookId, String name, String author, double price) {
		this.bookId = bookId;
		this.name = name;
		this.author = author;
		this.price = price;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the bookId
	 */
	public int getBookId() {
		return bookId;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	}
	
    
    
    

}
