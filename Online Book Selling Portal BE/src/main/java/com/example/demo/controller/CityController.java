package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.City;
import com.example.demo.service.CityService;


@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @PostMapping("/addToCity")
    public City addCity(@RequestBody City city){
        return cityService.addNewCity(city);
    }

    @GetMapping("/getAllCity")
    public List<City> getAllCity(){
        return cityService.getallCity();
    }

    @DeleteMapping("/deleteCity/{cityId}")
    public void deleteCity(@PathVariable("cityId") Integer Cityid){
       cityService.deleteCityRecord(Cityid);
    }

    @GetMapping("/getCity/{cityid}")  
    private City getCitys(@PathVariable("cityid") int cityid){  
      return cityService.getCitysById(cityid);  
    }

    

}
