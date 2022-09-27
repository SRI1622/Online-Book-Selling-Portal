package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.CityDetails;
import com.example.demo.model.CityDetailsId;

public interface CityDetailsRepository extends CrudRepository<CityDetails,CityDetailsId> {
    
}
