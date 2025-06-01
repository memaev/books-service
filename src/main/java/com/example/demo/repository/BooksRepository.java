package com.example.demo.repository;

import com.example.demo.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BooksRepository {
    private ArrayList<Book> books = new ArrayList<>();

    public List<Book> getAll() {
        return books;
    }

    public void addAll(List<Book> books) {
        this.books.addAll(books);
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public Book getById(int id) {
        for (Book curr : books) {
            if (curr.getId() == id)
                return curr;
        }
        return null;
    }
}
