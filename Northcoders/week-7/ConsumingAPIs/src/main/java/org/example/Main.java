package org.example;

import org.example.dao.FakeBooksDAO;
import org.example.model.Book;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        FakeBooksDAO booksDAO = new FakeBooksDAO();

        booksDAO.getFakeBooksResponse();

        FakeBooksDAO bookDAO = new FakeBooksDAO();
        List<Book> books = booksDAO.getBooks();
        books.forEach(book -> System.out.println(book.getTitle()));
    }
}

