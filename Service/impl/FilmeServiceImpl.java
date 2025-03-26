package com.seuprojeto.miniprojeto.Service.impl;

import com.seuprojeto.miniprojeto.Model.Filme;
import com.seuprojeto.miniprojeto.Repository.FilmeRepository;
import com.seuprojeto.miniprojeto.Servico.FilmeService;
import java.util.List;

public class FilmeServiceImpl implements FilmeService {

    private FilmeRepository filmeRepository;

    @Override
    public Filme salvar(Filme filme) {
        return null;
    }

    @Override
    public List<Filme> listarTodos() {
        return null;
    }

    @Override
    public Filme buscarPorId(Long id) {
        return null;
    }

    @Override
    public Filme atualizar(Long id, Filme filme) {
        return null;
    }

    @Override
    public void deletar(Long id) {
    }
}
