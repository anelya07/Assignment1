import java.util.InputMismatchException;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;

import data.DBConnection;
import entity.*;
import service.*;

public class MyApplication {

    private final Scanner scanner = new Scanner(System.in);
    private final Library library;
    private final LibraryMember member;

    public MyApplication(Library library, LibraryMember member) {
        this.library = library;
        this.member = member;

        try (Connection conn = DBConnection.getConnection()) {
            String sql = "INSERT INTO libraries(name, address) VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, library.getLibraryName());
            ps.setString(2, library.getAddress());
            ps.executeUpdate();
        }
        catch (Exception e) {
            System.out.println("Library DB error: " + e.getMessage());
        }

        AddBook addBook = new AddBook();
        addBook.add(library, new Book("Harry Potter", "J.K.Rowling", "Fantasy"));
        addBook.add(library, new Book("Sherlock Holmes", "Arthur Conan Doyle", "Detective"));
    }


    private void mainMenu() {
        System.out.println();
        System.out.println("--- Library Management System ---");
        System.out.println("1. Show all books");
        System.out.println("2. Add book");
        System.out.println("3. Remove book");
        System.out.println("4. Find book by title");
        System.out.println("5. Filter books by genre");
        System.out.println("6. Reserve book");
        System.out.println("7. Exit");
        System.out.print("Choose option: ");
    }

    public void start() {
        while (true) {
            mainMenu();
            try {
                int option = scanner.nextInt();
                scanner.nextLine();

                switch (option) {
                    case 1: showAllBooks(); break;
                    case 2: addBookMenu(); break;
                    case 3: removeBookMenu(); break;
                    case 4: findBookMenu(); break;
                    case 5: filterMenu(); break;
                    case 6: reserveMenu(); break;
                    default: return;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input must be a number.");
                scanner.nextLine();
            }

            System.out.println("______________________________");

        }
    }

    private void showAllBooks() {
        ShowBook service = new ShowBook();
        service.show(library);
    }

    private void addBookMenu() {
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Author: ");
        String author = scanner.nextLine();
        System.out.print("Genre: ");
        String genre = scanner.nextLine();

        Book book = new Book(title, author, genre);
        AddBook service = new AddBook();
        service.add(library, book);
    }

    private void removeBookMenu() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();

        FindBook find = new FindBook();
        Book book = find.findByTitle(library, title);

        if (book != null) {
            RemoveBook service = new RemoveBook();
            service.remove(library, book);
        }
    }

    private void findBookMenu() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();

        FindBook service = new FindBook();
        Book book = service.findByTitle(library, title);

        if (book != null) {
            System.out.println(book);
        }
    }

    private void filterMenu() {
        System.out.print("Enter genre: ");
        String genre = scanner.nextLine();

        FilterBook service = new FilterBook();
        service.filterByGenre(library, genre);
        System.out.println("Books sorted.");
    }

    private void reserveMenu() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();

        FindBook find = new FindBook();
        Book book = find.findByTitle(library, title);

        if (book != null) {
            Reserve service = new Reserve();
            service.reserve(book);
        }
    }
}




