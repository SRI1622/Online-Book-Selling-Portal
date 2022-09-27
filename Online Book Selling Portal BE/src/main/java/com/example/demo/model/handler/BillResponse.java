package com.example.demo.model.handler;

import lombok.*;

@Data
@AllArgsConstructor
public class BillResponse{
  private Integer billId;
  private Integer customerId;

  public BillResponse() {}
}