public class Main {

    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter", "J.K.Rowling", "Fantasy");
        Book b2 = new Book("Sherlock Holmes", "Arthur Conan Doyle", "Detective fiction");
        Book b3 = new Book("The Lord of the Rings", "J.R.R. Tolkien", "???");

        b1.getInfo();
        b2.getInfo();
        b3.getInfo();

        System.out.println("--- Genre entered for book 3: ---");
        System.out.println("Current genre: " + b3.getGenre());
        b3.setGenre("Fantasy");
        b3.getInfo();

        System.out.println("   Same genre? " + b1.getGenre().equals(b3.getGenre()));

        System.out.println("----------------------------------------------------------");
        LibraryMember m1 = new LibraryMember("Anelya", "+7 746 246 4565", 77);
        LibraryMember m2 = new LibraryMember("Aliya", "+7 456 234 0974", 78);

        m1.borrowBook();
        m1.getInfo();

        m1.returnBook();
        m1.getInfo();
        m2.getInfo();

        System.out.println("   Same memberID? " + (m1.getMemberID() == m2.getMemberID()));

        System.out.println("----------------------------------------------------------");

        Library l1 = new Library("Central Library", "Kabanbay batyr Avenue 24, Astana", 7500);
        Library l2 = new Library("Silk Road Archives", "Dostyk Street, Almaty", 3400);

        l1.getInfo();
        l1.addBook(500);

        System.out.println("----------------------------------------------------------");
        l2.getInfo();
        l2.removeBook(400);
    }
}

