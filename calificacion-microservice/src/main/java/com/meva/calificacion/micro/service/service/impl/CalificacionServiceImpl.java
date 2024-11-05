package com.meva.calificacion.micro.service.service.impl;


import com.meva.calificacion.micro.service.models.entity.Calificacion;
import com.meva.calificacion.micro.service.repository.ICalificacionRepository;
import com.meva.calificacion.micro.service.service.ICalificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class CalificacionServiceImpl implements ICalificacionService {

    @Autowired
    private ICalificacionRepository calificacionRepository;


    @Override
    public Calificacion save(Calificacion calificacion) {
        calificacion.setIdCalificacion(UUID.randomUUID().toString());
        calificacion.setFechaCreacion(LocalDateTime.now());
        calificacion.setFechaActualizacion(LocalDateTime.now());
        return calificacionRepository.save(calificacion);
    }

    @Override
    public List<Calificacion> findAll() {
        return calificacionRepository.findAll();
    }

    @Override
    public List<Calificacion> findByHotelId(String hotelId) {
        return calificacionRepository.findByHotelId(hotelId);
    }

    @Override
    public List<Calificacion> findByUsuarioId(String usuarioId) {
        return calificacionRepository.findByUsuarioId(usuarioId);
    }
}

