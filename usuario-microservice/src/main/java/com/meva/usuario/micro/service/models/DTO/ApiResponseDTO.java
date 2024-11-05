package com.meva.usuario.micro.service.models.DTO;

import lombok.*;
import org.springframework.http.HttpStatus;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class ApiResponseDTO {

    private String message;
    private boolean success;
    private HttpStatus status;
}
