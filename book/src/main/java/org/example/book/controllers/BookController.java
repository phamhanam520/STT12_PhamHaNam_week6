package org.example.book.controllers;

import lombok.AllArgsConstructor;
import org.example.book.models.Book;
import org.example.book.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class BookController {
    @Autowired
    BookRepository bookRepository;

    @PostMapping("/")
    Book post(){
        Book b = new Book();
        b.setName("test");
        Book save = bookRepository.save(b);
        return save;
    }

    @GetMapping("/")
    List<Book> get(){
        List<Book> list = bookRepository.findAll();
        return list;
    }
}
