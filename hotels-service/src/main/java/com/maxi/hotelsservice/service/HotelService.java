package com.maxi.hotelsservice.service;

import com.maxi.hotelsservice.model.Hotel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HotelService implements IHotelService {

    List<Hotel> hotelsList = new ArrayList<>();


    @Override
    public List<Hotel> getHotelsByCityId(Long city_id) {
        List<Hotel> hotelCityList = new ArrayList<>();

        //CARGA LA BD LOGICA
        this.loadHotels();
        //busca si conincide la id
//        for(Hotel hotel : hotelsList) {
//            if(hotel.getCity_id()==city_id) {
//                hotelCityList.add(hotel);
//            }
//        }
        hotelCityList = hotelsList.stream()
                                  .filter(hotel -> hotel.getCity_id() == city_id)
                                  .collect(Collectors.toList());
        return hotelCityList;
    }

    public void loadHotels() {
        this.hotelsList.add(new Hotel(1L, "Paradise",5, 1L));
        this.hotelsList.add(new Hotel(2L, "Sunset View",4, 2L));
        this.hotelsList.add(new Hotel(3L, "Ocean Breeze",3, 3L));
        this.hotelsList.add(new Hotel(4L, "Mountain Retreat",4, 1L));
        this.hotelsList.add(new Hotel(5L, "City Lights Inn",3, 2L));
        this.hotelsList.add(new Hotel(6L, "Riverside Lodge",4, 3L));
        this.hotelsList.add(new Hotel(7L, "Cozy Cabin Resort",2, 1L));
        this.hotelsList.add(new Hotel(8L, "Luxury Haven",5, 2L));
        this.hotelsList.add(new Hotel(9L, "Historic Grand Hotel",4, 3L));
        this.hotelsList.add(new Hotel(10L, "Tranquil Gardens",3, 1L));

    }



}
