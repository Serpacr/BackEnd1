package com.seuprojeto.miniprojeto.Servico;

import java.util.List;
import com.seuprojeto.miniprojeto.Model.Usuario;

public interface UsuarioService {
    Usuario salvar(Usuario usuario);
    List<Usuario> listarTodos();
    Usuario buscarPorId(Long id);
    Usuario atualizar(Long id, Usuario usuario);
    void deletar(Long id);

}
