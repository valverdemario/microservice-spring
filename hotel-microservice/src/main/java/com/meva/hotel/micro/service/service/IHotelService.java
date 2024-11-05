package com.meva.hotel.micro.service.service;

import com.meva.hotel.micro.service.models.entity.Hotel;

import java.util.List;

public interface IHotelService {

    Hotel save(Hotel hotel);

    List<Hotel> findAll();

    Hotel findById(String id);
}
