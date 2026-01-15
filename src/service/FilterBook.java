package service;

import entity.Book;
import entity.Library;

public class FilterBook {

    public void filterByGenre(Library library, String genre) {
        for (Book b : library.getBooks()) {
            if (b.getGenre().equalsIgnoreCase(genre)) {
                System.out.println(b.getTitle());
            }
        }
    }
}
