package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

import java.util.*;

@RestController
public class BookController {
    
    @Autowired
    private BookService bookService;


    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book){
        return bookService.insertBook(book);
    }

    @GetMapping("/getAllBooks")
    public List<Book> getAllBook(){
      return bookService.getAllBook();
    }

    //Update method........................................................................................................
    @PutMapping("/updateBook")
    public Book updateBooks(@RequestBody Book book){
       return bookService.updateBooks(book);
    }


    // Delete Method........................................................................................................
    @DeleteMapping("/deleteRecord/{bookId}")
    public void deleteBook(@PathVariable("bookId") Integer Book_id){
       bookService.deleteBook(Book_id);
    }

    //get a particular book.................................................................................................
    @GetMapping("/getBook/{bookid}")  
    private Book getBooks(@PathVariable("bookid") int bookid){  
      return bookService.getBooksById(bookid);  
    }


    //get a list of books in particular city................................................................................
    @GetMapping("/getDetailsbyCityId/{cityId}")
    public List<Book> getAllDetailbyCityId(@PathVariable Integer cityId ){
      return bookService.getAllbooksByCityId(cityId);
    }


    //get a list of books based on customerId..............................................................................
    @GetMapping("/getDetailsbyCustomerId/{customerId}")
    public List<Book> getAllDetailbyCustomerId(@PathVariable Integer customerId ){
      return bookService.getAllbooksByCustomerId(customerId);
    }


    
}
