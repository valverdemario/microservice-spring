package com.meva.calificacion.micro.service.repository;

import com.meva.calificacion.micro.service.models.entity.Calificacion;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ICalificacionRepository extends MongoRepository<Calificacion, String> {
    List<Calificacion> findByHotelId(String hotelId);
    List<Calificacion> findByUsuarioId(String usuarioId);
}
