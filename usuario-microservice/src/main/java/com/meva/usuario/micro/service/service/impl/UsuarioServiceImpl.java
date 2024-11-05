package com.meva.usuario.micro.service.service.impl;

import com.meva.usuario.micro.service.exception.ResourceNotFoundException;
import com.meva.usuario.micro.service.external.services.HotelService;
import com.meva.usuario.micro.service.external.services.ICalificacionService;
import com.meva.usuario.micro.service.models.entity.Calificacion;
import com.meva.usuario.micro.service.models.entity.Hotel;
import com.meva.usuario.micro.service.models.entity.Usuario;
import com.meva.usuario.micro.service.repository.IUsuarioRepository;
import com.meva.usuario.micro.service.service.IUsuarioService;
import org.apache.coyote.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    private Logger logger = LoggerFactory.getLogger(UsuarioServiceImpl.class);

    @Autowired
    private IUsuarioRepository usuarioRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HotelService hotelService;

    @Autowired
    private ICalificacionService iCalificacionService;


    @Override
    public Usuario save(Usuario usuario) {
        String id = UUID.randomUUID().toString();
        usuario.setIdUsuario(id);
        usuario.setFechaCreacion(LocalDateTime.now());
        usuario.setFechaActualizacion(LocalDateTime.now());
        return this.usuarioRepository.save(usuario);

    }

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario findById(String id) {
        Usuario usuario = usuarioRepository.findById(id).orElse(null);
        List<Calificacion> calificacions = iCalificacionService.getCalificaciones(id);

        List<Calificacion> calificacionList = calificacions.stream().map(calificacion -> {

            Hotel hotel = hotelService.getHotel(calificacion.getHotelId());
            calificacion.setHotel(hotel);
            logger.info("Hotel: " + hotel);
            return calificacion;
        }).toList();
        usuario.setCalificaciones(calificacionList);
        logger.info("Calificaciones: " + calificacions);
        return usuario;
    }
}
