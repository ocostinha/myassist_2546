package com.fiap.myassist_2546.resources.repository.entity;

import com.fiap.myassist_2546.core.domain.Os;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String proprietario;

    @Column
    private String tipoEquipamento;

    @Column
    private LocalDate entradaLab;

    @Column
    private String defeito;

    @Column
    private LocalDate previsaoEntrega;

    @Column
    private String statusConcerto;

    @Column
    private String observacoes;

    public OsEntity(Os os) {
        this.proprietario = os.getProprietario();
        this.tipoEquipamento = os.getTipoEquipamento();
        this.entradaLab = os.getEntradaLab();
        this.defeito = os.getDefeito();
        this.previsaoEntrega = os.getPrevisaoEntrega();
        this.statusConcerto = os.getStatusConcerto();
        this.observacoes = os.getObservacoes();
    }
}
