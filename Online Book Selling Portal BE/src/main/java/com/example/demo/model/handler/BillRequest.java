package com.example.demo.model.handler;

import java.util.List;

import lombok.Data;

@Data
public class BillRequest{
  private Integer customerId;
  private List<Integer> bookIds;
}