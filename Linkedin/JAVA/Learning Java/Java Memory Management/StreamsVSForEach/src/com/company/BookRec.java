package com.company;

public record BookRec(String author, String title) {

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Author: " + getAuthor() + ", Title: " + getTitle();
    }
}
