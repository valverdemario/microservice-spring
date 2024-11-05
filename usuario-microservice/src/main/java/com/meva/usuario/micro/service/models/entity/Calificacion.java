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
public class Calificacion implements Serializable {

    private String idCalificacion;
    private String usuarioId;
    private String hotelId;
    private Integer calificacion;
    private String observaciones;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaActualizacion;
    private Hotel hotel;

}
