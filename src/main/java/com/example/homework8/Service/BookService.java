package com.example.homework8.Service;

import com.example.homework8.entity.Book;

public interface BookService {
    public Book findById(Integer id);
    public Book updateById(Integer id,String name);
    public void delById(Integer id);
}
