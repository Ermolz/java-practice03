import java.util.List;

public class Library {
    private final List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public void printAllBooks() {
        books.forEach(book -> System.out.println("- " + book));
    }

    public void printAvailableBooks() {
        books.stream()
                .filter(Book::isAvailable)
                .forEach(book -> System.out.println("- " + book));
    }
}
