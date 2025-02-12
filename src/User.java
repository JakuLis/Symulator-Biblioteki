import java.util.ArrayList;
import java.util.List;

public class User extends Person {
    private final List<Book> borrowedBooks = new ArrayList<>();

    public User(String name) {
        super(name);
    }

    public void borrowBook(Book book) {
        if (borrowedBooks.size() >= 3) {
            System.out.println("Użytkownik nie może wypożyczyć więcej niż 3 książki.");
            return;
        }
        borrowedBooks.add(book);
        book.borrow();
        System.out.println("Książka wypożyczona: " + book.getTitle());
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.returnBook();
        System.out.println("Książka zwrócona: " + book.getTitle());
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    @Override
    public String toString() {
        return super.toString() + ", Wypożyczone książki: " + borrowedBooks.size();
    }
}
