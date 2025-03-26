package com.seuprojeto.miniprojeto.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.seuprojeto.miniprojeto.Repository.EditorRepository;
import java.util.List;
import com.seuprojeto.miniprojeto.Model.Editor;

@RestController
@RequestMapping("/edição")
public class EditorController {

    private EditorController service;

    @GetMapping
    public List<Editor> listar(){
        return EditorRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Editor> inserir(@RequestBody Editor editor){
        return EditorRepository.save(editor);
    }

    @PutMapping
    public ResponseEntity<Editor> alterar(@RequestBody Editor editor){
        return service.alterar(editor);
    }
    @DeleteMapping("/{id}")

    public ResponseEntity<Editor> deletar(@PathVariable Integer id){
        service.deletar(id);
        return ResponseEntity.ok().build();
    }
}

