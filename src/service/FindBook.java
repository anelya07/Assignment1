package service;

import entity.Book;
import entity.Library;

public class FindBook implements BookService {
    public Book findByTitle(Library library, String title) {
        for (Book b : library.getBooks()) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        process(false);
        return null;
    }

    @Override
    public void process(boolean status) {
        if (!status) {
            System.out.println("Book not found.");
        }
    }
}

