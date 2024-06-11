package com.fiap.myassist_2546.core.domain;

import com.fiap.myassist_2546.entrypoint.dto.UsuarioRequestDTO;
import com.fiap.myassist_2546.resources.repository.entity.UsuarioEntity;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    private String usuario;
    private String senha;

    public Usuario(UsuarioRequestDTO request) {
        this.usuario = request.getUsuario();
        this.senha = request.getSenha();
    }

    public Usuario(UsuarioEntity entity) {
        if (entity == null) {
            return;
        }

        this.usuario = entity.getUsuario();
        this.senha = entity.getSenha();
    }
}
