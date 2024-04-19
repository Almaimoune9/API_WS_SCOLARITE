package com.sitanInfo.API_WS_SCOLARITE.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class InscriptionsCompensations extends AbstractEntity{

    private Boolean etat;
    private Integer mention1;
    private Integer mention2;
    private Double session1;
    private Double session2;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "compensations")
    private Compensations compensations;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "inscriptionAdministrative")
    private InscriptionAdministrative inscriptionAdministrative;
}
