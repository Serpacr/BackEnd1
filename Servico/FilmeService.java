package com.seuprojeto.miniprojeto.Servico;

import org.springframework.stereotype.Service;
import com.seuprojeto.miniprojeto.Model.Filme;

import java.util.List;

@Service
public interface FilmeService {
    Filme salvar(Filme filme);
    List<Filme> listarTodos();
    Filme buscarPorId(Long id);
    Filme atualizar(Long id, Filme filme);
    void deletar(Long id);

}
