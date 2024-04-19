package com.sitanInfo.API_WS_SCOLARITE.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Echeance extends AbstractEntity{

    private Date date;
    private Double montant;
    private Double total;
    private Double montantPaye;
    private Double remise;
    private Double tva;
    private Double totalTva;
    private Double net;
    private Date dateReglement;
    private Integer ordre;
    private String estSolde;
    private String recu;
    private boolean selected;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "echeanciers")
    private Echeanciers echeanciers;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "paiement")
    private Paiement paiement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "inscriptionAdministrative")
    private InscriptionAdministrative inscriptionAdministrative;

}
