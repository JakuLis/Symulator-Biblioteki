import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w symulatorze Biblioteki!");

        boolean running = true;
        while (running) {
            System.out.println("\nWybierz opcję:");
            System.out.println("1. Dodaj książkę");
            System.out.println("2. Usuń książkę");
            System.out.println("3. Wyświetl wszystkie książki");
            System.out.println("4. Zarejestruj użytkownika");
            System.out.println("5. Wyświetl użytkowników");
            System.out.println("6. Wypożycz książkę");
            System.out.println("7. Zwrot książki");
            System.out.println("8. Wyjdź");

            System.out.print("Twój wybór: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Oczyszczenie bufora

            switch (choice) {
                case 1 -> {
                    System.out.print("Podaj tytuł książki: ");
                    String title = scanner.nextLine();
                    System.out.print("Podaj autora książki: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(title, author));
                }
                case 2 -> {
                    System.out.print("Podaj ID książki do usunięcia: ");
                    int bookId = scanner.nextInt();
                    library.removeBook(bookId);
                }
                case 3 -> library.displayBooks();
                case 4 -> {
                    System.out.print("Podaj imię użytkownika: ");
                    String name = scanner.nextLine();
                    library.registerUser(new User(name));
                }
                case 5 -> library.displayUsers();
                case 6 -> {
                    System.out.print("Podaj ID użytkownika: ");
                    int userId = scanner.nextInt();
                    System.out.print("Podaj ID książki: ");
                    int bookId = scanner.nextInt();
                    library.borrowBook(userId, bookId);
                }
                case 7 -> {
                    System.out.print("Podaj ID użytkownika: ");
                    int userId = scanner.nextInt();
                    System.out.print("Podaj ID książki: ");
                    int bookId = scanner.nextInt();
                    library.returnBook(userId, bookId);
                }
                case 8 -> {
                    System.out.println("Do zobaczenia!");
                    running = false;
                }
                default -> System.out.println("Niepoprawna opcja. Spróbuj ponownie.");
            }
        }

        scanner.close();
    }
}
