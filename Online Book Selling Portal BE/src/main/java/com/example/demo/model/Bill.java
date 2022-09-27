package com.example.demo.model;

import java.sql.Timestamp;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
// import javax.persistence.JoinColumn;
// import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.*;

@Entity
@Table(name="Bill")
@Data
@AllArgsConstructor
public class Bill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BILL_ID")
    private Integer billId;
    @Column(name = "AMOUNT")
    private Integer amount;
    @Column(name = "PAYMENT_METHOD")
    private String paymentMethod;
    @Column(name = "BILL_DATE")
    private Timestamp billDate;
    @Column(name = "CUSTOMER_ID")
    private Integer customerId;

    public Bill(){}

    public Bill(Integer customerId){
        this.customerId = customerId;
    }
    
    //customer id is pending.......................................
    // @ManyToOne(cascade= CascadeType.ALL)
    // @JoinColumn(name = "CUSTOMER_ID")
    // private Customer customer;



}
