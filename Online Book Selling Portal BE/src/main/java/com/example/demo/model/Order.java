package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "ORDER_DETAIL")
@Data
public class Order {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ORDER_ID")
  private Integer id;
  @Column(name = "BILL_ID")
  private Integer billId;
  @Column(name = "QUANTITY")
  private Integer quantity;
  @Column(name = "BOOK_ID")
  private Integer bookId;

  public Order(){}

  public Order(Integer billId, Integer bookId){
    this.billId = billId;
    this.bookId = bookId;
  }

}
