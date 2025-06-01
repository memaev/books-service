package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    @Autowired
    private BooksService booksService;

    @GetMapping("")
    public List<Book> getAllBooks() {
        return booksService.getAll();
    }

    @GetMapping(value = "", params = {"id"})
    public ResponseEntity<Book> getBookById(@RequestParam Integer id) {
        Book book = booksService.getById(id);
        if (book == null)
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(book);
    }

    @PostMapping("")
    public void addNewBook(@RequestBody Book book) {
        booksService.addBook(book);
    }

    @PutMapping("")
    public String updateBook(@RequestParam(required = false, defaultValue = "") String bookPrevName, @RequestParam String bookNewName) {
        return "Updating book with name " + bookPrevName + " to name " + bookNewName;
    }

    @DeleteMapping("")
    public void deleteBook(String bookName) {

    }
}

// GET
// /books
