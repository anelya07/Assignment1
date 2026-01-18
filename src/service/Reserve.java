package service;

import data.DBConnection;
import entity.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Reserve implements BookService {

    public void reserve(Book book) {
        if (!book.getAvailable()) {
            process(false);
            return;
        }

        book.setAvailable(false);

        try (Connection conn = DBConnection.getConnection()) {
            String sql = "UPDATE books SET available = false WHERE title = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, book.getTitle());
            ps.executeUpdate();

            process(true);
        } catch (Exception e) {
            System.out.println("DB error: " + e.getMessage());
        }
    }

    @Override
    public void process(boolean status) {
        if (status)
            System.out.println("Book reserved.");
        else
            System.out.println("Book not available.");
    }
}
