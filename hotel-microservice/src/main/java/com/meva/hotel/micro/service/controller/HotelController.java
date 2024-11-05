package com.meva.hotel.micro.service.controller;

import com.meva.hotel.micro.service.models.entity.Hotel;
import com.meva.hotel.micro.service.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hoteles")
public class HotelController {

    @Autowired
    private IHotelService hotelService;

    @PostMapping
    public ResponseEntity<Hotel> save(@RequestBody Hotel hotel) {
        return ResponseEntity.ok(this.hotelService.save(hotel));
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> findAll() {
        return ResponseEntity.ok(this.hotelService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hotel> findById(@PathVariable String id) {
        return ResponseEntity.ok(this.hotelService.findById(id));
    }

}
