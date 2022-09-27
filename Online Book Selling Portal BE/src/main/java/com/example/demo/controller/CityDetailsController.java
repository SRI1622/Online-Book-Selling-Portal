package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CityDetails;
import com.example.demo.service.CityDetailsService;
import java.util.*;


@RestController
public class CityDetailsController {
    

    @Autowired
    private CityDetailsService cityDetailsService;


    @PostMapping("/addCitydetails")
    public CityDetails addCityDetail(@RequestBody CityDetails cityDetails){
        return cityDetailsService.insertCityDetails(cityDetails);
    }

    @GetMapping("/getDetails")
    public List<CityDetails> getAllDetail(){
      return cityDetailsService.getDetail();
    }

    

}
