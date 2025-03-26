package com.seuprojeto.miniprojeto.Model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "tb_Editor")
public class Editor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int idade;
    private String nacionalidade;

    @ManyToMany(mappedBy = "editores")
    private List<Usuario> editores;
}