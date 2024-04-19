package com.sitanInfo.API_WS_SCOLARITE.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class ParcoursSemestres extends AbstractEntity{

    private Double credit;
    private Double noteObtention;
    private Double noteBase;
    private Double noteElimination;
    private Integer bonifiable;
    private Integer etatCalcul;
    private Integer etatReleve;
    private String typeCalcul;
    private boolean compensation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "semestre")
    private Semestre semestre;
}
