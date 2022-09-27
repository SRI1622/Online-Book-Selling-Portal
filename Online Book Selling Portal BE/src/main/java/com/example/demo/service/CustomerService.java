package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;


@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    

    public Customer insertCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> getDetails() {
        return (List<Customer>)customerRepository.findAll();
    }

    public Customer updateDetail(Customer customer) {
        Optional<Customer> optionalDetail = customerRepository.findById(customer.getCustomerId());
        if(optionalDetail.isPresent()){
             return customerRepository.save(customer);
        }
        else{
            return null;
        }
    }

    public void deleteDetail(Integer customerId) {
        customerRepository.deleteById(customerId);
    }
    
}
