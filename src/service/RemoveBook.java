package service;

import entity.Book;
import entity.Library;

public class RemoveBook implements BookService {
    private Library library;
    private Book book;

    public RemoveBook(Library library, Book book) {
        this.library = library;
        this.book = book;
    }

    public void remove() {
        library.getBooks().remove(book);
        process(true);
    }

    @Override
    public void process(boolean status) {
        if (status)
            System.out.println("Book removed.");
        else
            System.out.println("Book not found.");
    }
}

