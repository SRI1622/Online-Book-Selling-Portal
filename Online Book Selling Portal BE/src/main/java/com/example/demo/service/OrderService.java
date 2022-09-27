package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

  @Autowired
  private BillService billService;

  public void updateOrderQuantity(){
    // Input
    // Bill Id
    // BookId :: 1- 3, 10 - 1, 15 - 3
    billService.updateBillAmount(1);
  }
}
