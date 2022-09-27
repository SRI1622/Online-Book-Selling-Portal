package com.example.demo.model;


import javax.persistence.*;

import lombok.Data;


@Entity
@Table(name = "CITY_DETAILS" )
@IdClass(CityDetailsId.class)
@Data
public class CityDetails {
    

    
    @Id
    @Column(name = "BOOK_ID")
    private Integer bookId;

    @Id
    @Column(name = "CITY_ID")
    private Integer cityId;

    
}
