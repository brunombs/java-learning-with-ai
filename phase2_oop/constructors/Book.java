public class Book {
    private final String title;
    private final String author;
    private final double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {
        Book book = new Book("Bugbusters", "Phantom", 10.0);
        System.out.println("Book title: " + book.title);
        System.out.println("Author Title: " + book.author);
        System.out.println("Price: " + book.price);
    }
}
