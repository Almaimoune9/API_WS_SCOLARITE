package com.sitanInfo.API_WS_SCOLARITE.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class DiplomeDelivre extends AbstractEntity {

    private String commentaire;
    private Integer numero;
    private String numeroDelivranceEtablissement;
    private String numeroDelivranceRectorat;
    private Date dateEmission;
    private Date dateValidation;
    private Integer etat;
    private Date dateModification;
    private boolean selected;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "titreGrade")
    private  TitreGrade titreGrade;
}
