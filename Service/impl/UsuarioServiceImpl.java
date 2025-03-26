package com.seuprojeto.miniprojeto.Service.impl;

import com.seuprojeto.miniprojeto.Model.Usuario;
import com.seuprojeto.miniprojeto.Repository.UsuarioRepository;
import com.seuprojeto.miniprojeto.Servico.UsuarioService;
import java.util.List;

public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario salvar(Usuario usuario) {
        return null;
    }

    @Override
    public List<Usuario> listarTodos() {
        return null;
    }

    @Override
    public Usuario buscarPorId(Long id) {
        return null;
    }

    @Override
    public Usuario atualizar(Long id, Usuario usuario) {
        return null;
    }

    @Override
    public void deletar(Long id) {
    }
}
