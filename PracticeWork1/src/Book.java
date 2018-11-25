import java.lang.*;
public class Book {
	private String name;
	private int numberOfPages;
	
	public Book(String n, int nop) {
		name = n;
		numberOfPages = nop;
	}
	public Book(String n) {
		name = n;
	}
	public Book() {
		name = "None";
		numberOfPages = 0;
	}
	
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public String getName() {
		return name;
	}
	
	public String toString() {
		return this.name+", number of pages "+this.numberOfPages;
	}
	
}
