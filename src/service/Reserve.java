package service;

import entity.Book;

public class Reserve implements BookService {
    private Book book;

    public Reserve(Book book) {
        this.book = book;
    }

    public void reserve() {
        if (!book.getAvailable()) {
            book.setAvailable(true);
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
            System.out.println("Book already reserved.");
        }
    }
}
