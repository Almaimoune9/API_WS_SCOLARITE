package com.sitanInfo.API_WS_SCOLARITE.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Echeanciers extends AbstractEntity{

    private Integer annee;
    private String estSolde;


    private double montant;
    private double total;
    private double paye;
    private double reste;

    @ManyToOne
    @JoinColumn(name = "inscriptionAdministrative")
    private InscriptionAdministrative inscriptionAdministrative;

    @ManyToOne
    @JoinColumn(name = "inscriptionAdministrative")
    private DetailsPaiements detailsPaiements;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "paiement")
    private Paiement paiement;
}
