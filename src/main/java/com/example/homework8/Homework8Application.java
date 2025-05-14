package com.example.homework8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class Homework8Application {

    public static void main(String[] args) {
        SpringApplication.run(Homework8Application.class, args);
    }

}
