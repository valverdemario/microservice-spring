package com.meva.calificacion.micro.service.service;

import com.meva.calificacion.micro.service.models.entity.Calificacion;

import java.util.List;

public interface ICalificacionService {
    Calificacion save(Calificacion calificacion);

    List<Calificacion> findAll();

    List<Calificacion> findByHotelId(String hotelId);

    List<Calificacion> findByUsuarioId(String usuarioId);
}
