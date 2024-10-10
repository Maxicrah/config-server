package com.maxi.citiesservice.service;

import com.maxi.citiesservice.dto.CityDTO;

public interface ICityService {
    public CityDTO getCitiesHotels(String name, String country);
}
