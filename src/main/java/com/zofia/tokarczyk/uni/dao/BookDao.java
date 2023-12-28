package com.zofia.tokarczyk.uni.dao;

import com.zofia.tokarczyk.uni.entity.Book;

import java.util.List;

public interface BookDao {

    void saveBook(Book book);
    List<Book> findAll();
    void deleteById(int id);
    Book findById(int id);
    void updateBook(Book book);
}
