package com.sitanInfo.API_WS_SCOLARITE.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class InscriptionsSemestre extends AbstractEntity{

    private Long parcours;
    private Integer niveau;
    private Integer ordre;
    private Integer dispense;
    private Boolean etat;
    private Double credit1;
    private Double credit2;
    private Double credit;
    private Integer absence1;
    private Integer absence2;
    private String mention1;
    private String mention2;
    private String mention;
    private Double session1;
    private Double session2;
    private Double session;
    private Integer rang1;
    private Integer rang2;
    private Integer rang;
    private Double noteBase;
    private Double ponderation;
    private Double creditParcours;
    private Double creditJury;
    private Double obtention;
    private Integer blocage;
    private Integer etatCalcul;
    private Integer rattrapage;
    private Long nombreHeureAbsence;
    private boolean selected;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "semestre")
    private Semestre semestre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parcoursSemestres")
    private ParcoursSemestres parcoursSemestres;
}
