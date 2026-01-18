package service;

import data.DBConnection;
import entity.Book;
import entity.Library;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddBook implements BookService {

    public void add(Library library, Book book) {
        library.getBooks().add(book);

        try (Connection conn = DBConnection.getConnection()) {
            String sql = "INSERT INTO books(title, author, genre, available) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setString(3, book.getGenre());
            ps.setBoolean(4, book.getAvailable());
            ps.executeUpdate();

            process(true);
        } catch (Exception e) {
            System.out.println("DB error: " + e.getMessage());
        }
    }

    @Override
    public void process(boolean status) {
        System.out.println("Book added successfully.");
    }
}




