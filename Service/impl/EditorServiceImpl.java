package com.seuprojeto.miniprojeto.Service.impl;

import com.seuprojeto.miniprojeto.Model.Editor;
import com.seuprojeto.miniprojeto.Repository.EditorRepository;
import com.seuprojeto.miniprojeto.Servico.EditorService;
import java.util.List;

public class EditorServiceImpl implements EditorService {

    private EditorRepository EditorRepository;

    @Override
    public Editor salvar(Editor editor) {
        return null;
    }

    @Override
    public List<Editor> listarTodos() {
        return null;
    }

    @Override
    public Editor buscarPorId(Long id) {
        return null;
    }

    @Override
    public Editor atualizar(Long id, Editor editor) {
        return null;
    }

    @Override
    public void deletar(Long id) {
    }
}