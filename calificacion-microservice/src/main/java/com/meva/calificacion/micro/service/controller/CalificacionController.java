package com.meva.calificacion.micro.service.controller;

import com.meva.calificacion.micro.service.models.entity.Calificacion;
import com.meva.calificacion.micro.service.service.ICalificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/calificaciones")
public class CalificacionController {
    @Autowired
    private ICalificacionService calificacionService;

    @PostMapping
    public ResponseEntity<Calificacion> save(@RequestBody Calificacion calificacion){
        return ResponseEntity.ok(calificacionService.save(calificacion));
    }

    @GetMapping
    public ResponseEntity<List<Calificacion>> findAll(){
        return ResponseEntity.ok(calificacionService.findAll());
    }

    @GetMapping("/hotel/{hotelId}")
    public ResponseEntity<List<Calificacion>> findByHotelId(@PathVariable String hotelId){
        return ResponseEntity.ok(calificacionService.findByHotelId(hotelId));
    }

    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<List<Calificacion>> findByUsuarioId(@PathVariable String usuarioId){
        return ResponseEntity.ok(calificacionService.findByUsuarioId(usuarioId));
    }

}
