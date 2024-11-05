package com.meva.usuario.micro.service.service;

import com.meva.usuario.micro.service.models.entity.Usuario;

import java.util.List;

public interface IUsuarioService {

    Usuario save(Usuario usuario);

    List<Usuario> findAll();

    Usuario findById(String id);
}
