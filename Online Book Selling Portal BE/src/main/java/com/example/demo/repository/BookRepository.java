package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Book;



public interface BookRepository extends CrudRepository<Book,Integer> {

    @Query(value = "Select b.* from book b join city_details c on b.book_Id = c.book_Id where c.city_Id = :cityId",nativeQuery = true)
    List<Book> findBookByCityId(Integer cityId);

    
    
    @Query(value = "Select b.* from book b join cart on b.book_Id = cart.book_Id where cart.customer_Id = :customerId",nativeQuery = true)
    List<Book> findBookByCustomerId(Integer customerId);
}
