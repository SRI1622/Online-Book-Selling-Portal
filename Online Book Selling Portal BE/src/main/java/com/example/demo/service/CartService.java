package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Cart;
import com.example.demo.model.CartId;
import com.example.demo.repository.CartRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CartService {


    @Autowired
    private CartRepository cartRepository;


    //insert into cart................................................................
    public Cart insertIntoCart(Cart cart){
        log.info("{}", cart);
        try{
            return cartRepository.save(cart);
        
        }
        catch(Exception exception)
        {
            log.info("{}", exception.getMessage());
        }
        return null;
        
    }


    //delete books in cart................................................................
    public void removeCart(CartId cartId) {

        log.info("{}", cartId);
        try
        {
            cartRepository.deleteById(cartId);
        }
        catch(Exception exception)
        {
            log.info("{}", exception.getMessage());
        }
    }

    //get all records from the table................................
    public List<Cart> getAllRecord() {
        return (List<Cart>)cartRepository.findAll();
    }
    
}
