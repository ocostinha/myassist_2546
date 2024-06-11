package com.fiap.myassist_2546.resources.repository.entity;

import com.fiap.myassist_2546.core.domain.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "USUARIO")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String usuario;

    @Column
    private String senha;

    public UsuarioEntity(Usuario usuario) {
        this.senha = usuario.getSenha();
        this.usuario = usuario.getUsuario();
    }
}
