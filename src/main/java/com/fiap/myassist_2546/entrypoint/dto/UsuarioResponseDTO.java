package com.fiap.myassist_2546.entrypoint.dto;

import com.fiap.myassist_2546.core.domain.Usuario;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioResponseDTO {
    private String usuario;
    private String senha;

    public UsuarioResponseDTO(Usuario usuario) {
        this.senha = usuario.getSenha();
        this.usuario = usuario.getUsuario();
    }
}
