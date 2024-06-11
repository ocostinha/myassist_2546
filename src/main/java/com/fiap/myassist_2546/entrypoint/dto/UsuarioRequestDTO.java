package com.fiap.myassist_2546.entrypoint.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioRequestDTO {
    @NotBlank
    @Size(min = 5, max = 15)
    private String usuario;

    @NotBlank
    @Size(min = 8, max = 20)
    private String senha;
}
