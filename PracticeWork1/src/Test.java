import java.lang.*;
public class Test {
	public static void main(String[] args) {
		Book b1 = new Book("Lalala", 123);
		Book b2 = new Book("Klaklakla");
		b2.setNumberOfPages(253);
		System.out.println(b1);
	}

}
