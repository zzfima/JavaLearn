package com.company;

public class Book implements BookReadOnly {
    private final int id;
    private final String author;
    private String title;
    private Price price;

    public Book(int id, String title, String author, Double price) {
        this(id, title, author, new Price(price));
    }

    public Book(Book book) {
        this(book.id, book.title, book.author, book.price);
    }

    public Book(int id, String title, String author, Price price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }

    @Override
    public Price getPrice() {
        return new Price(this.price);
    }

    public void setPrice(Double price) {
        this.price = new Price(price);
    }
}