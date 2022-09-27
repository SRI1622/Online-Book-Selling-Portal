package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;


@RestController
public class CustomerController {
    


    @Autowired
    private CustomerService customerService;


    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.insertCustomer(customer);
    }

    @GetMapping("/getAllDetails")
    public List<Customer> getAllDetail(){
      return customerService.getDetails();
    }

    @PutMapping("/updateDetails")
    public Customer updateDetail(@RequestBody Customer customer){
       return customerService.updateDetail(customer);
    }

    @DeleteMapping("/deleteRecords/{customerId}")
    public void deleteRecords(@PathVariable("customerId") Integer customerId){
       customerService.deleteDetail(customerId);
    }
    



}
