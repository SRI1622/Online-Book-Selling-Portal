package com.example.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CUSTOMER")
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMER_ID")
    private Integer customerId;
    @Column(name = "CUSTOMER_NAME")
    private String customerName;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
    @Column(name = "EMAIL_ID")
    private String emailId;
    @Column(name = "PASSWORD")
    private String password;

    
}
