package com.company;

public class Book {
    private final int id;
    private final String title;
    private final String author;
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

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String toString() {
        return title + " by " + author;
    }

    public Price getPrice() {
        return new Price(this.price);
    }

    public void setPrice(Double price) {
        this.price = new Price(price);
    }
}