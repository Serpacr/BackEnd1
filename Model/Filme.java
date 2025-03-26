package com.seuprojeto.miniprojeto.Model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.web.bind.annotation.Mapping;

import static jakarta.persistence.GenerationType.*;
@Data
@Entity
@Table(name = "tb_filme")
public class Filme {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;
    private String titulo;
    private String autor;

}