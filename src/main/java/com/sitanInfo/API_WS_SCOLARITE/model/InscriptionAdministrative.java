package com.sitanInfo.API_WS_SCOLARITE.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class InscriptionAdministrative extends AbstractEntity{

    private Date dateInsc;
    private Integer niveau;
    private Double note;
    private Integer progression;
    private Boolean passageConditionnel;
    private Boolean redoublement;
    private Boolean reorientation;
    private Integer semestre;
    private Boolean statut;
    private String mention;
    private Integer session;
    private String type;
    private Long groupe;

    private boolean selected;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etudiant")
    private Etudiant etudiant;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "resultat")
    private Resultat resultat;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "historique")
    private Historique historique;


}
