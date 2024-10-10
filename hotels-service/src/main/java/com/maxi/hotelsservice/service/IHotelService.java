package com.maxi.hotelsservice.service;

import com.maxi.hotelsservice.model.Hotel;

import java.util.List;

public interface IHotelService {

    public List<Hotel> getHotelsByCityId(Long city_id);
}
