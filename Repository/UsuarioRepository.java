package com.seuprojeto.miniprojeto.Repository;

import com.seuprojeto.miniprojeto.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
