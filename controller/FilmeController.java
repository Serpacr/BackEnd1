package com.seuprojeto.miniprojeto.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.seuprojeto.miniprojeto.Repository.FilmeRepository;
import java.util.List;
import com.seuprojeto.miniprojeto.Model.Filme;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    private FilmeController service;

    @GetMapping
    public List<Filme> listar(){
        return FilmeRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Filme> inserir(@RequestBody Filme filme){
        return FilmeRepository.save(filme);
    }

    @PutMapping
    public ResponseEntity<Filme> alterar(@RequestBody Filme filme){
        return service.alterar(filme);
    }
    @DeleteMapping("/{id}")

    public ResponseEntity<Filme> deletar(@PathVariable Integer id){
        service.deletar(id);
        return ResponseEntity.ok().build();
    }
}
