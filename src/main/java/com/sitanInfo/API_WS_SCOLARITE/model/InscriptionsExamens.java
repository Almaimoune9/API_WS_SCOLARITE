package com.sitanInfo.API_WS_SCOLARITE.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class InscriptionsExamens extends AbstractEntity{

    private Long module;
    private Long matiere;
    private String nom;
    private String prenom;
    private String place;
    private String code;
    private String anonymat;
    private Integer rang;
    private Integer absence;
    private Double note;
    private Double noteDefinifive;
    private Integer validite;
    private Boolean etatSaisie;
    private boolean selected;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "inscriptionAdministrative")
    private InscriptionAdministrative inscriptionAdministrative;
}
