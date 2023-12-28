package com.zofia.tokarczyk.uni.service;

import com.zofia.tokarczyk.uni.dao.BookDao;
import com.zofia.tokarczyk.uni.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    private BookDao bookDao;

    @Autowired
    public BookServiceImpl(BookDao bookDao){
        this.bookDao = bookDao;
    }

    @Override
    public Book save(Book book) {
        bookDao.saveBook(book);
        return book;
    }

    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        bookDao.deleteById(id);
    }

    @Override
    public Book findById(int id) {
        return bookDao.findById(id);
    }

    @Override
    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }
}
