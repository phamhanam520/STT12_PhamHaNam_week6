package org.example.author.controllers;

import lombok.AllArgsConstructor;
import org.example.author.models.Author;
import org.example.author.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/author")
@AllArgsConstructor
public class AuthorController {
    @Autowired
    AuthorRepository authorRepository;

    @GetMapping("/test")
    String test(){
        return "test";
    }

    @PostMapping("/")
    Author post(){
        Author b = new Author();
        b.setName("post new author");
        Author save = authorRepository.save(b);
        return save;
    }

    @GetMapping("/")
    List<Author> get(){
        List<Author> list = authorRepository.findAll();
        return list;
    }
}
