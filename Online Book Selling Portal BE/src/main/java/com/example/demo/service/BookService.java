package com.example.demo.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Book;
//import com.example.demo.model.City;
import com.example.demo.repository.BookRepository;
// import com.example.demo.repository.CityRepository;

//import lombok.extern.slf4j.Slf4j;


@Service
 //@Slf4j
public class BookService {
    
    @Autowired
    private BookRepository bookRepository;
    

    public Book insertBook(Book book){
        return bookRepository.save(book);
    }

  
    public List<Book> getAllBook() {
        return (List<Book>)bookRepository.findAll();
    }



    public Book updateBooks(Book book) {
        Optional<Book> optionalBook = bookRepository.findById(book.getBookId());
        if(optionalBook.isPresent()){
             return bookRepository.save(book);
        }
        else{
            return null;
        }
    }


    public void deleteBook(Integer Book_id) {
         bookRepository.deleteById(Book_id);
    }


    public Book getBooksById(int bookid) {
        return bookRepository.findById(bookid).get();
    }


    //FIND LIST OF BOOKS IN PARTICULAR CITY BASED ON CITYID....................
    public List<Book> getAllbooksByCityId (Integer cityId){
        return bookRepository.findBookByCityId(cityId);
    }

    //FIND LIST OF BOOKS IN CART BASED ON CUSTOMERID................
    public List<Book> getAllbooksByCustomerId (Integer customerId){
        return bookRepository.findBookByCustomerId(customerId);
    }

}
