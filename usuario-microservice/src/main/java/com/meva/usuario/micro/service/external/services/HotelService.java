package com.meva.usuario.micro.service.external.services;

import com.meva.usuario.micro.service.models.entity.Hotel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "HOTEL-MICROSERVICE")
public interface HotelService {

    @GetMapping("/api/hoteles/{hotelId}")
    Hotel getHotel(@PathVariable String hotelId);


}
