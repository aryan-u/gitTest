package gitTest;

import java.util.Arrays;
import java.util.List;

public class BookDAO {

	public static List<Book> getBooks() {
		Book book1 = new Book(1, "The C++ Programming Language", 250, "Bjarne Stroustrup");
		Book book2 = new Book(2, "Java: The Complete Reference", 760, "Herbert Schildt");
		Book book3 = new Book(3, "Introduction to Algorithms", 250, "Charles");
		return Arrays.asList(book1, book2, book3);
	}
}
