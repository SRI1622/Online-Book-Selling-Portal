package com.example.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="BOOK")
@Data
public class Book {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOOK_ID")
    private Integer bookId;               
    @Column(name = "BOOK_NAME")
    private String name;
    @Column(name = "AUTHOR_NAME")
    private String authorName;
    @Column(name = "BOOK_TYPE")
    private String type;
    @Column(name = "BOOK_PRICE")
    private Integer price;



}
