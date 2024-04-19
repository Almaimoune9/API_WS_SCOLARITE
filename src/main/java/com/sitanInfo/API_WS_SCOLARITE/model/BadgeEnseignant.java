package com.sitanInfo.API_WS_SCOLARITE.model;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class BadgeEnseignant extends AbstractEntity{

    private Integer numero;
    private Date dateEmission;
    private Date dateValidation;
    private Integer etat;
    private String commentaire;
    private Date dateModification;
}
