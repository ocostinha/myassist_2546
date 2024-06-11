package com.fiap.myassist_2546.core.domain;

import com.fiap.myassist_2546.entrypoint.dto.OsRequestDTO;
import com.fiap.myassist_2546.resources.repository.entity.OsEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Os {
    private Long id;
    private String proprietario;
    private String tipoEquipamento;
    private LocalDate entradaLab;
    private String defeito;
    private LocalDate previsaoEntrega;
    private String statusConcerto;
    private String observacoes;

    public Os(OsEntity entity) {
        this.id = entity.getId();
        this.proprietario = entity.getProprietario();
        this.tipoEquipamento = entity.getTipoEquipamento();
        this.entradaLab = entity.getEntradaLab();
        this.defeito = entity.getDefeito();
        this.previsaoEntrega = entity.getPrevisaoEntrega();
        this.statusConcerto = entity.getStatusConcerto();
        this.observacoes = entity.getObservacoes();
    }

    public Os(OsRequestDTO request) {
        this.proprietario = request.getProprietario();
        this.tipoEquipamento = request.getTipoEquipamento();
        this.entradaLab = request.getEntradaLab();
        this.defeito = request.getDefeito();
        this.previsaoEntrega = request.getPrevisaoEntrega();
        this.statusConcerto = request.getStatusConcerto();
        this.observacoes = request.getObservacoes();
    }
}
