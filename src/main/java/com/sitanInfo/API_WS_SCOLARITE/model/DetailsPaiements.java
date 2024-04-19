package com.sitanInfo.API_WS_SCOLARITE.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class DetailsPaiements extends AbstractEntity{

    private Double montant;
    private Double total;
    private Double remise;
    private Double tva;
    private Double totalTva;
    private Double net;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "paiement")
    private Paiement paiement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "paiement")
    private InscriptionAdministrative inscriptionAdministrative;
}
