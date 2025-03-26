package com.seuprojeto.miniprojeto.Servico;

import com.seuprojeto.miniprojeto.Model.Editor;

import java.util.List;

public interface EditorService {
    Editor salvar(Editor editor);

    List<Editor> listarTodos();

    Editor buscarPorId(Long id);

    Editor atualizar(Long id, Editor editor);

    void deletar(Long id);
}
