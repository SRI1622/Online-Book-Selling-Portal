package com.example.demo.model;


import java.sql.Timestamp;
import javax.persistence.*;
import lombok.Data;


@Entity
@Table(name  = "Cart")
@IdClass(CartId.class)
@Data
public class Cart {

    @Column(name = "BOOK_DATE")
    private Timestamp date;
    
    @Id
    @Column(name = "BOOK_ID")
    private Integer bookId;

    @Id
    @Column(name = "CUSTOMER_ID")
    private Integer customerId;
    
    
}
