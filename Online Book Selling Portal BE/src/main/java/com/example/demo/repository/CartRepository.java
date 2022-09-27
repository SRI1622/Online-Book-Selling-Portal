package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Cart;
import com.example.demo.model.CartId;

public interface CartRepository extends CrudRepository<Cart,CartId> {

    
    
}
