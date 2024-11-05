package com.meva.usuario.micro.service.repository;

import com.meva.usuario.micro.service.models.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario,String> {
}
