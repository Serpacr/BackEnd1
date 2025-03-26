package com.seuprojeto.miniprojeto.controller;

import java.util.List;

import com.seuprojeto.miniprojeto.Model.Filme;
import com.seuprojeto.miniprojeto.Model.Usuario;
import com.seuprojeto.miniprojeto.Repository.UsuarioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")

public class UsuarioController {

    private UsuarioController service;

    @GetMapping
    public List<Usuario> listar(){
        return UsuarioRepository.findAll();
    }

    @PutMapping

    public ResponseEntity<Usuario> alterar(@RequestBody Filme usuario){
        return service.alterar(usuario);
    }
    @PostMapping
    public ResponseEntity<Usuario> inserir(@RequestBody Usuario usuario){
        return UsuarioRepository.save(usuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Usuario> deletar(@PathVariable Integer id){
        service.deletar(id);
        return ResponseEntity.ok().build();
    }
}