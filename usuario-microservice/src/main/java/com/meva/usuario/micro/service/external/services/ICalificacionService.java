package com.meva.usuario.micro.service.external.services;

import com.meva.usuario.micro.service.models.entity.Calificacion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="CALIFICACION-MICROSERVICE")
public interface ICalificacionService {

    @GetMapping("/api/calificaciones/usuario/{id}")
    List<Calificacion> getCalificaciones(@PathVariable String id);
}
