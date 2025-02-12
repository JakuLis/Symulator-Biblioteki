public class Book {
    private static int counter = 1;
    private final int id;
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author) {
        this.id = counter++;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrow() {
        this.isBorrowed = true;
    }

    public void returnBook() {
        this.isBorrowed = false;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Tytuł: " + title + ", Autor: " + author + (isBorrowed ? " (Wypożyczona)" : "");
    }
}
