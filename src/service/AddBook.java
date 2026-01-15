package service;

import entity.Book;
import entity.Library;

public class AddBook implements BookService {

    private Library library;
    private Book book;

    public AddBook(Library library, Book book) {
        this.library = library;
        this.book = book;
    }

    public void add() {
        library.getBooks().add(book);
        process(true);
    }

    @Override
    public void process(boolean status) {
        System.out.println("Book added successfully.");
    }
}




