package com.meva.usuario.micro.service.controller;

import com.meva.usuario.micro.service.models.DTO.ApiResponseDTO;
import com.meva.usuario.micro.service.models.entity.Usuario;
import com.meva.usuario.micro.service.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> save(@RequestBody Usuario usuario) {
        return ResponseEntity.ok(this.usuarioService.save(usuario));
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> findAll() {
        return ResponseEntity.ok(this.usuarioService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable String id) {
        return ResponseEntity.ok(this.usuarioService.findById(id));
    }

}
