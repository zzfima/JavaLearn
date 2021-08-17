package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Book> books = populateBooks();

        //Print all books, author starts with 'J'

        //1. using foreach
        System.out.println("***ForEach***");
        for (Book b : books) {
            if (b.getAuthor().startsWith("J"))
                System.out.println(b);
        }

        //2. using streams
        System.out.println("***Streams one line***");
        books.stream().filter(b -> b.getAuthor().startsWith("J")).forEach(b -> System.out.println(b));

        System.out.println("***Streams 2 lines***");
        Stream<Book> sb = books.stream().filter(b -> b.getAuthor().startsWith("J"));
        sb.forEach(b -> System.out.println(b));
    }

    private static List<Book> populateBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Alice Walker", "The Color Purple"));
        books.add(new Book("Alice Walker", "Meridian"));
        books.add(new Book("Toni Morrison", "Beloved"));
        books.add(new Book("Toni Morrison", "Jazz"));
        books.add(new Book("Toni Morrison", "Paradise"));
        books.add(new Book("John Steinbeck", "The Grapes of Wrath"));
        books.add(new Book("John Steinbeck", "East of Eden"));
        books.add(new Book("Kazuo Ishiguro", "The Remains of the Day"));
        books.add(new Book("Kazuo Ishiguro", "Never Let Me Go"));
        books.add(new Book("Kazuo Ishiguro", "The Buried Giant"));
        books.add(new Book("Jane Austen", "Pride and Prejudice"));
        books.add(new Book("Jane Austen", "Emma"));
        books.add(new Book("Jane Austen", "Persuasion"));
        books.add(new Book("Jane Austen", "Mansfield Park"));
        books.add(new Book("Chinua Achebe", "Things Fall Apart"));
        books.add(new Book("Chinua Achebe", "No Longer at Ease"));
        books.add(new Book("Chinua Achebe", "Home and Exile"));

        return books;
    }
}
