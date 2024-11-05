package com.meva.hotel.micro.service.repository;

import com.meva.hotel.micro.service.models.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHotelRepository extends JpaRepository<Hotel, String> {
}
