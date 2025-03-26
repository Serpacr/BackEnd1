package com.seuprojeto.miniprojeto.controller;

import com.seuprojeto.miniprojeto.Model.EntidadeBase;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/base")
public class ControllerBase {

    @GetMapping
    public EntidadeBase exemploMetodoGET() {
        return EntidadeBase
                .builder()
                .nome("Aula BackEnd")
                .ano(2025)
                .build();
    }


    @PostMapping
    public EntidadeBase exemploMetodoPost(@RequestBody EntidadeBase entidadeBase) {
        return entidadeBase;
    }
}