package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.HTMLDocument;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    @Autowired
    private BooksService booksService;

    private static ArrayList<String> books = new ArrayList<>();

    @GetMapping("")
    public List<String> getAllValues() {
        return books;
    }
    @PostMapping("")
    public void addNewBook(@RequestParam String bookName) {
        books.add(bookName);
    }
    @DeleteMapping("")
    public void deleteBook(String bookName) {

    }
}

// GET
// /books
