package com.fiap.myassist_2546.core.business;

import com.fiap.myassist_2546.core.domain.Usuario;

public interface UsuarioBusiness {
    Usuario criarUsuario(Usuario usuario);
    void login(String usuario, String senha);
    void deletar(Long id);
}
