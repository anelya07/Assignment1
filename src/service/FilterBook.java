package service;

import entity.Book;
import entity.Library;

public class FilterBook implements BookService {
    public void filterByGenre(Library library, String genre) {
        for (Book b : library.getBooks()) {
            if (b.getGenre().equalsIgnoreCase(genre)) {
                System.out.println(b.getTitle());
            }
        }
        process(true);
    }

    @Override
    public void process(boolean status) {
    }
}
