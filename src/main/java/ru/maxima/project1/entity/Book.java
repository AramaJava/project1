package ru.maxima.project1.entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

/**
 * @author AramaJava 31.07.2023
 */

public class Book {

    private int id;

    @NotEmpty(message = "Название книги не дожно быть пустым")
    @Size(min = 3, max = 100, message = "Название книги должно быть от 3 до 100 символов")
    private String title;

    @NotEmpty(message = "ФИО автора книги не дожно быть пустым")
    @Size(min = 3, max = 100, message = "ФИО автора книги должно быть от 3 до 100 символов")
    private String author;
    @Min(value = 1500, message = "Год книги должен быть больше 1500 года")
    private int year;

    public Book() {
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
