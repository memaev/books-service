package com.example.demo.model;

public class Book {
    private int id, price;
    private String bookName, bookAuthor;

    public Book(int id, int price, String bookName, String bookAuthor) {
        this.id = id;
        this.price = price;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }
}
