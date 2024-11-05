package com.meva.usuario.micro.service.models.entity;


import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Hotel implements Serializable {

    private String idHotel;
    private String nombre;
    private String ubicacion;
    private String informacion;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaActualizacion;

}
