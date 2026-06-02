public class Book {
    private final String title;
    private final String author;
    private final boolean available;

    public Book(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        String status = available ? "available" : "borrowed";
        return title + " by " + author + " (" + status + ")";
    }
}
