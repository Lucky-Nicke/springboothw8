package com.example.homework8.Service;

import com.example.homework8.dao.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Book;

@Service
@CacheConfig(cacheNames = "book")
@Transactional
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;
    @Cacheable(key = "#id")
    public Book findById(Integer id){
        return bookRepository.findById(id).get();
    }

    @Cacheable(key = "#id")
    public Book updateById(Integer id ,String name){
        Book book=this.findById(id);
        book.setName(name);
        return bookRepository.save(book);
    }

    @Cacheable(key = "#id")
    public void delById(Integer id){
        bookRepository.deleteBy(id);
    }
}
