package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CityDetails;
//import com.example.demo.model.CityDetailsId;
import com.example.demo.repository.CityDetailsRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CityDetailsService {

    @Autowired
    private CityDetailsRepository cityDetailRepository;

    
    public CityDetails insertCityDetails(CityDetails cityDetails){
        log.info("{}", cityDetails);
        try{
            return cityDetailRepository.save(cityDetails);
        
        }
        catch(Exception exception)
        {
            log.info("{}", exception.getMessage());
        }
        return null;
        
    }



    public List<CityDetails> getDetail() {
        return (List<CityDetails>)cityDetailRepository.findAll();
    }


    
    
}
