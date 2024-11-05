package com.meva.calificacion.micro.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CalificacionMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalificacionMicroserviceApplication.class, args);
    }

}
