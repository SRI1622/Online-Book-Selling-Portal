package com.example.demo.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class CartId implements Serializable {

    private Integer bookId;
    private Integer customerId;

    public CartId(){

    }
    
}
