package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.handler.BillRequest;
import com.example.demo.model.handler.BillResponse;
import com.example.demo.service.BillService;

@RestController
public class BillController {
    
    @Autowired
    private BillService billService;

    // @Autowired
    // private BillResponse billResponse;

   
    public BillResponse makeABill(@RequestBody BillRequest billRequest){
      /*
        Input: Customer Id, 
        Book Id - List
      */
      return billService.makeABill(billRequest);
    }
}
