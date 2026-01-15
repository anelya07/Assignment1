package service;

import entity.Book;
import entity.Library;

public class AddBook implements BookService {
    public void add(Library library, Book book) {
        library.getBooks().add(book);
        process(true);
    }

    @Override
    public void process(boolean status) {
        System.out.println("Book added successfully.");
    }
}




