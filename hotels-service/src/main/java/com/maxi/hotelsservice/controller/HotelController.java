package com.maxi.hotelsservice.controller;

import com.maxi.hotelsservice.model.Hotel;
import com.maxi.hotelsservice.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private IHotelService hotelService;


    @GetMapping("/{city_id}")
    public List<Hotel> findHotelsByCity(@PathVariable("city_id") Long id){
        return hotelService.getHotelsByCityId(id);
    }

}
