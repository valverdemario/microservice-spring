package com.meva.hotel.micro.service.service.impl;

import com.meva.hotel.micro.service.exception.ResourceNotFoundException;
import com.meva.hotel.micro.service.models.entity.Hotel;
import com.meva.hotel.micro.service.repository.IHotelRepository;
import com.meva.hotel.micro.service.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements IHotelService {

    @Autowired
    private IHotelRepository hotelRepository;

    @Override
    public Hotel save(Hotel hotel) {
        hotel.setIdHotel( UUID.randomUUID().toString());
        hotel.setFechaCreacion( LocalDateTime.now() );
        hotel.setFechaActualizacion( LocalDateTime.now() );
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> findAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel findById(String id) {
        return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Resource not found"));
    }
}
