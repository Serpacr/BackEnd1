package com.seuprojeto.miniprojeto.Repository;

import com.seuprojeto.miniprojeto.Model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
}
