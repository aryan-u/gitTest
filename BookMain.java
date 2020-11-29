package gitTest;
import java.util.List;
import java.util.function.Consumer;

public class BookMain {
    static Consumer<Book>  c1= p -> System.out.println(p);

    static Consumer<Book>  c2= p -> System.out.println(p.getName());

    static Consumer<Book>  c3= p -> System.out.println(p.getPrice());
    

    static Consumer<Book>  c4= p -> System.out.println(p.getId());

    public static void print(){

        List<Book> books = BookDAO.getBooks();

        books.forEach(c1);

    }

    public static void printNameAndId(){
        List<Book> books = BookDAO.getBooks();
        books.forEach(c4.andThen(c2));
    }

    public static void printNameAndIdAndPrice(){

        List<Book> books = BookDAO.getBooks();
        books.forEach(c4.andThen(c2).andThen(c3));
    }

    public static void main(String[] args) {

        print();
        printNameAndId();
        printNameAndIdAndPrice();
    }
}
