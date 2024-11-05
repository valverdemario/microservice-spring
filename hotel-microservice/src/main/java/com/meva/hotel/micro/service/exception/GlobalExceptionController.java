package com.meva.hotel.micro.service.exception;


import com.meva.hotel.micro.service.models.DTO.ApiResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionController {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponseDTO> handlerResourceNotFoundException(ResourceNotFoundException ex) {
        String mensaje = ex.getMessage();
        ApiResponseDTO apiResponseDTO = new ApiResponseDTO(mensaje, false, HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(apiResponseDTO, HttpStatus.NOT_FOUND);
    }

}
