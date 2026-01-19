package service;

import data.DBConnection;
import entity.Book;
import entity.Library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ShowBook implements BookService {

    public void show(Library library) {
        library.getBooks().clear();

        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT * FROM books";
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Book book = new Book(
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getString("genre")
                );
                book.setAvailable(rs.getBoolean("available"));
                library.getBooks().add(book);
            }

            for (Book b : library.getBooks()) {
                System.out.println(b);
            }

            process(true);
        } catch (Exception e) {
            System.out.println("DB error: " + e.getMessage());
        }
    }

    @Override
    public void process(boolean status) {
    }
}