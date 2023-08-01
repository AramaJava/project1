package ru.maxima.project1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.maxima.project1.entity.Person;
import ru.maxima.project1.entity.Book;
import java.util.List;

/**
 * @author AramaJava 01.08.2023
 */

@Component
public class BookDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public BookDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Book> index() {
        return jdbcTemplate.query("SELECT * FROM book",
                BeanPropertyRowMapper.newInstance(Book.class));

    }

    public Book show(int id) {
        return jdbcTemplate.query("SELECT * FROM book WHERE id=?",
                        BeanPropertyRowMapper.newInstance(Book.class), id)
                .stream().findAny().orElse(null);

    }

    public void save(Book book) {
        jdbcTemplate.update("INSERT INTO book (title, author, year) VALUES (?, ?, ?)",
                book.getTitle(),
                book.getAuthor(),
                book.getYear());
    }

    public void update(int id, Book updatedBook) {
        jdbcTemplate.update("UPDATE book SET title=?, author=?, year=? WHERE id=?",
                updatedBook.getTitle(),
                updatedBook.getAuthor(),
                updatedBook.getYear(),
                id);
    }

    public void delete(int id) {
        jdbcTemplate.update("DELETE from book WHERE id=?", id);
    }


}
