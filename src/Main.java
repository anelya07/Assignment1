import java.util.Scanner;
import service.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book b1 = new Book("Harry Potter", "J.K.Rowling", "Fantasy");
        Book b2 = new Book("Sherlock Holmes", "Arthur Conan Doyle", "Detective fiction");

        LibraryMember member = new LibraryMember("Anelya", "+7 746 246 4565", 77);

        Library library = new Library("Central Library", "Kabanbay batyr Avenue 24, Astana", 7500);

        library.addBook(b1);
        library.addBook(b2);

        System.out.println("All books:");
        library.showAllBooks();

        System.out.println("Books filtered by Fantasy:");
        library.filterByGenre("Fantasy");

        System.out.println("1 - Reserve book");
        System.out.println("2 - Extend loan");
        int choice = sc.nextInt();

        BookService service;

        if (choice == 1) {
            service = new Reserve();
            service.process(b1.getAvailable());
            if (b1.getAvailable()) {
                b1.setAvailable(false);
                member.borrowBook();
            }
        }
        else if (choice == 2) {
            service = new Extend();
            service.process(member.getBorrowedBooks() > 0);
        }
        else {
            System.out.println("Invalid choice");
        }


        /*Assignment 1:
        System.out.println("Current genre: " + b3.getGenre());
        b3.setGenre("Fantasy");

        System.out.println("Same genre? " + b1.getGenre().equals(b3.getGenre()));

        member.borrowBook();
        member.returnBook();
        member.getInfo();
        m2.getInfo();

        System.out.println("Same memberID? " + (member.getMemberID() == m2.getMemberID()));
        */
    }
}

