package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Cart;
import com.example.demo.model.CartId;
import com.example.demo.service.CartService;

@RestController
public class CartController {
    
    @Autowired
    private CartService cartService;


    @PostMapping("/addToCart")
    public Cart addToCart(@RequestBody Cart cart){
        return cartService.insertIntoCart(cart);
    }

    @GetMapping("/getAllRecords")
    public List<Cart> getAllRecord(){
      return cartService.getAllRecord();
    }


    @DeleteMapping("/removeRecord")
    public void removeRecords(@RequestBody CartId cart){
       cartService.removeCart(cart);
    }

}
