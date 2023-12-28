package com.zofia.tokarczyk.uni.dao;

import com.zofia.tokarczyk.uni.entity.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class BookDaoImpl implements BookDao{

    // define field for entity manager
    private EntityManager entityManager;
    // inject entity manager using constructor injection
    @Autowired
    public BookDaoImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void saveBook(Book theBook) {
        if (theBook.getId() == 0) {
            // persist for new entity
            entityManager.persist(theBook);
        } else {
            // merge for an existing entity
            entityManager.merge(theBook);
        }
    }

    @Override
    public List<Book> findAll() {
        TypedQuery<Book> theQuery = entityManager.createQuery("from Book", Book.class);
        List<Book> books = theQuery.getResultList();
        return books;
    }

    @Override
    public void deleteById(int id) {
        Book tempBook = entityManager.find(Book.class, id);

        // break the association in future

        entityManager.remove(tempBook);

    }

    @Override
    public Book findById(int id) {
        Book tempBook = entityManager.find(Book.class, id);
        return tempBook;
    }

    @Override
    @Transactional
    public void updateBook(Book book) {
        entityManager.merge(book);
    }
}
