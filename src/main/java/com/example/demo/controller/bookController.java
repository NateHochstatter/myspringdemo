package com.example.demo.controller;

import com.example.demo.domain.Book;
import com.example.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RequiredArgsConstructor
@RestController
public class bookController {
    private final BookService bookService;
    @GetMapping("/hello")
    public  String HelloWorld(){
        return "Hello World";
    }
    @GetMapping("/clock")
    public Date clock(){
        Date date = new Date();
        return date;
    }
    @PostMapping("/book")
    public ResponseEntity<?>save(@RequestBody Book book){
        return new ResponseEntity<>(bookService.create(book), HttpStatus.CREATED);
    }
    @GetMapping("/findAll")
    public  ResponseEntity<?> findAll(){
        return new ResponseEntity<>(bookService.findAll(), HttpStatus.OK);
    }
}
