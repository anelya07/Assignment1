package service;

import data.DBConnection;
import entity.Book;
import entity.Library;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RemoveBook implements BookService {

    public void remove(Library library, Book book) {
        library.getBooks().remove(book);

        try (Connection conn = DBConnection.getConnection()) {
            String sql = "DELETE FROM books WHERE title = ?";
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
        System.out.println("Book removed.");
    }
}
