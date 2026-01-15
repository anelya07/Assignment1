package service;

import entity.Book;

public class Reserve implements BookService {
    public void reserve(Book book) {
        if (book.getAvailable()) {
            book.setAvailable(false);
            process(true);
        }
        else {
            process(false);
        }
    }

    @Override
    public void process(boolean status) {
        if (status) {
            System.out.println("Book reserved.");
        }
        else {
            System.out.println("Book is not available.");
        }
    }
}
