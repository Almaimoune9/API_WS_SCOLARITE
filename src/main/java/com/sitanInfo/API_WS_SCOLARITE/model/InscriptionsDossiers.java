package com.sitanInfo.API_WS_SCOLARITE.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class InscriptionsDossiers extends AbstractEntity{

    private String numero;
    private String emplacement;
    private Date dateSignature;
    private String objet;
    private String motsCles;
    private Integer nombrePages;
    private String document;
    private String type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "inscriptionAdministrative")
    private InscriptionAdministrative inscriptionAdministrative;
}
