import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter", "J.K.Rowling", "Fantasy");
        Book b2 = new Book("Sherlock Holmes", "Arthur Conan Doyle", "Detective fiction");

        b1.printBook();
        b2.printBook();


    }
}

