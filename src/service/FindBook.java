package service;

import entity.Book;
import entity.Library;

public class FindBook {
    public Book findByTitle(Library library, String title) {
        for (Book b : library.getBooks()) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }
}

