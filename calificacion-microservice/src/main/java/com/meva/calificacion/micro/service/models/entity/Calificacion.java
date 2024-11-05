package com.meva.calificacion.micro.service.models.entity;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;

@Document("calificaciones")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Calificacion implements Serializable {

    @Id
    private String idCalificacion;
    private String usuarioId;
    private String hotelId;
    private Integer calificacion;
    private String observaciones;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaActualizacion;

}
