package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {

    @Autowired
    private BooksRepository booksRepository;

    public void addBook(Book book) {
        booksRepository.addBook(book);
    }

    public List<Book> getAll() {
        return booksRepository.getAll();
    }

    public Book getById(int id) {
        return booksRepository.getById(id);
    }
}
