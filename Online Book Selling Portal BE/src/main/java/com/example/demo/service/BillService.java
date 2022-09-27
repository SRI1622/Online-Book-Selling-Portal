package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bill;
import com.example.demo.model.CartId;
import com.example.demo.model.Order;
import com.example.demo.model.handler.BillRequest;
import com.example.demo.model.handler.BillResponse;
import com.example.demo.repository.BillRepository;
import com.example.demo.repository.CartRepository;
import com.example.demo.repository.OrderRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BillService {

  @Autowired
  private CartRepository cartRepository;

  @Autowired
  private BillRepository billRepository;

  @Autowired
  private OrderRepository orderRepository;
    
  public BillResponse makeABill(BillRequest billRequest){
    try{
      List<CartId> cartIds = billRequest.getBookIds().stream().map(e -> new CartId(e, billRequest.getCustomerId())).collect(Collectors.toList());
      cartRepository.deleteAllById(cartIds);
      Bill tempBill = new Bill(billRequest.getCustomerId());
      Bill billId = billRepository.save(tempBill);
      List<Order> orders = billRequest.getBookIds().stream().map(e -> new Order(billId.getBillId(), e)).collect(Collectors.toList());
      orderRepository.saveAll(orders);
      return new BillResponse(billId.getBillId(), billRequest.getCustomerId());
    }
    catch(Exception exception){
      log.info("Error occured :: {}", exception.getMessage());
    }
    return new BillResponse();
  }

  public void updateBillAmount(Integer billId){
    // Join Bill & Order,  Find All Books, Calculate Total AMount and save in Bill table
  }
}
