package com.fiap.myassist_2546.entrypoint.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class OsRequestDTO {
    @NotBlank
    private String proprietario;

    @NotBlank
    private String tipoEquipamento;

    @NotNull
    private LocalDate entradaLab;

    @NotBlank
    private String defeito;

    private LocalDate previsaoEntrega;

    @NotBlank
    private String statusConcerto;

    private String observacoes;
}
