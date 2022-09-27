package com.example.demo.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CityDetailsId implements Serializable {


    private Integer cityId;
    private Integer bookId;
    

    public CityDetailsId(){

    }
    
}
