import java.util.ArrayList;
import java.util.Comparator;

public class Library {
    private String libraryName;
    private String address;
    private int numberOfBooks;
    private ArrayList<Book> books;

    public Library(String libraryName, String address, int numberOfBooks) {
        this.libraryName = libraryName;
        this.address = address;
        this.numberOfBooks = numberOfBooks;
        this.books = new ArrayList<>();
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public void getInfo(){
        System.out.println("Library Name: " + libraryName);
        System.out.println("Address: " + address);
        System.out.println("Number of Books: " + numberOfBooks);
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(Book book){
        if(books.remove(book)){
            System.out.println("Book removed: " + book.getTitle());
        }
        else {
            System.out.println("Book not found!");
        }
    }

    public void showAllBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public Book findByTitle(String title){
        for(Book b : books){
            if(b.getTitle().equalsIgnoreCase(title)){
                return b;
            }
        }
        return null;
    }

    public void filterByGenre(String genre){
        for(Book b : books){
            if(b.getGenre().equalsIgnoreCase(genre)){
                System.out.println(b);
            }
        }
    }

    public void sortByTitle(){
        books.sort(Comparator.comparing(Book::getTitle));
    }

}

