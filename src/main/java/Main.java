import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = List.of(
                new Book("Clean Code", "Robert C. Martin", true),
                new Book("Effective Java", "Joshua Bloch", false),
                new Book("Java: A Beginner's Guide", "Herbert Schildt", true)
        );

        Library library = new Library(books);

        System.out.println("Mini Library");
        System.out.println("All books:");
        library.printAllBooks();

        System.out.println();
        System.out.println("Available books:");
        library.printAvailableBooks();
    }
}
