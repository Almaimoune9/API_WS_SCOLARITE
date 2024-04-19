package com.sitanInfo.API_WS_SCOLARITE.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class InscriptionsGroupes extends AbstractEntity{

    private String temoin;
    private boolean selected;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "inscriptionAdministrative")
    private InscriptionAdministrative inscriptionAdministrative;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "groupesGroupes")
    private GroupesGroupes groupesGroupes;
}
