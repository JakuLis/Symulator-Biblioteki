import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books = new ArrayList<>();
    private final List<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Dodano książkę: " + book.getTitle());
    }

    public void removeBook(int id) {
        Book book = findBookById(id);
        if (book != null) {
            books.remove(book);
            System.out.println("Usunięto książkę: " + book.getTitle());
        } else {
            System.out.println("Nie znaleziono książki o ID: " + id);
        }
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Brak książek w bibliotece.");
        } else {
            books.forEach(System.out::println);
        }
    }

    public void registerUser(User user) {
        users.add(user);
        System.out.println("Zarejestrowano użytkownika: " + user.getName());
    }

    public void displayUsers() {
        if (users.isEmpty()) {
            System.out.println("Brak zarejestrowanych użytkowników.");
        } else {
            users.forEach(System.out::println);
        }
    }

    public void borrowBook(int userId, int bookId) {
        User user = findUserById(userId);
        Book book = findBookById(bookId);
        if (user != null && book != null && !book.isBorrowed()) {
            user.borrowBook(book);
        } else {
            System.out.println("Nie można wypożyczyć książki.");
        }
    }

    public void returnBook(int userId, int bookId) {
        User user = findUserById(userId);
        Book book = findBookById(bookId);
        if (user != null && book != null && book.isBorrowed()) {
            user.returnBook(book);
        } else {
            System.out.println("Nie można zwrócić książki.");
        }
    }

    private Book findBookById(int id) {
        return books.stream().filter(book -> book.getId() == id).findFirst().orElse(null);
    }

    private User findUserById(int id) {
        return users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
    }
}
