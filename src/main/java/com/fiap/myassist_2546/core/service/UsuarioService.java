package com.fiap.myassist_2546.core.service;

import com.fiap.myassist_2546.core.domain.Usuario;

public interface UsuarioService {
    Usuario criarUsuario(Usuario usuario);
    Usuario obterUsuarioPorUsuarioESenha(String usuario, String senha);
    void deletar(Long id);
}
