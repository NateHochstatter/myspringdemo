package com.example.demo.service;

import com.example.demo.domain.Book;
import com.example.demo.repository.BookRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookService {
    private final BookRepository bookRepository;

    @Transactional
    public Book create(Book book){
        return bookRepository.save(book);
    }
    @Transactional
    public List<Book> findAll(){
        return bookRepository.findAll();
    }
    /*
    @Autowired  // tells spring to inject an instances of BookRepository into BookService
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }  // depends on BookService to access and manipulate the book object data
     */

}
