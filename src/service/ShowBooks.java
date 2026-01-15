package service;

import entity.Book;
import entity.Library;

public class ShowBooks{
    public void show(Library library) {
        for (Book b : library.getBooks()) {
            System.out.println(b.getTitle() + " | " + b.getAuthor() + " | " + b.getGenre());
        }
    }
}
