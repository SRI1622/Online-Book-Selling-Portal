package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.City;
//import com.example.demo.repository.CityDetailsRepository;
import com.example.demo.repository.CityRepository;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    // @Autowired
    // private CityDetailsRepository cityDetailRepository;


    public List<City> getallCity() {
        return (List<City>) cityRepository.findAll();
    }


    public City addNewCity(City city) {
        return cityRepository.save(city);
    }


    public void deleteCityRecord(Integer cityid) {
        cityRepository.deleteById(cityid);
    }


    public City getCitysById(int cityid) {
        return cityRepository.findById(cityid).get();
    }


    
}
