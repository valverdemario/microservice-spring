package com.meva.usuario.micro.service.models.entity;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.cglib.core.Local;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "usuarios")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Usuario implements Serializable {

    @Id
    @Column(name = "id_usuario")
    private String idUsuario;
    @Column(name = "nombre", length = 50)
    private String nombre;
    private String email;
    private String informacion;
    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;
    @Column(name = "fecha_actualizacion")
    private LocalDateTime fechaActualizacion;

    @Transient
    private List<Calificacion> calificaciones;



}
