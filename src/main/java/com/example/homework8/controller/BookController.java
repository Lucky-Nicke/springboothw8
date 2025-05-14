package com.example.homework8.controller;

import com.example.homework8.Service.BookService;
import com.example.homework8.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("book")
public class BookController {
    @Autowired
    private BookService bookService;
    @RequestMapping("/findById/{id}")
    public Book findById(@PathVariable Integer id){
        return bookService.findById(id);
    }

    @RequestMapping("/editById/{id}/{name}")
    public Book editById(@PathVariable Integer id, @PathVariable String name){
        return bookService.updateById(id, name);
    }

    @RequestMapping("/delById/{id}")
    public void delById(@PathVariable Integer id){
        bookService.delById(id);
    }
}
