package com.zofia.tokarczyk.uni.service;

import com.zofia.tokarczyk.uni.entity.Book;

import java.util.List;

public interface BookService {

    Book save(Book book);
    List<Book> findAll();
    void deleteById(int id);
    Book findById(int id);
    void updateBook(Book book);
}
