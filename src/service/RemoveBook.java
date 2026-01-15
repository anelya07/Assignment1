package service;

import entity.Book;
import entity.Library;

public class RemoveBook implements BookService {
    public void remove(Library library, Book book) {
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

