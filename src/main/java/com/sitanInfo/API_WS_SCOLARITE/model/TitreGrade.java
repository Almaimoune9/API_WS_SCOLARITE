package com.sitanInfo.API_WS_SCOLARITE.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class TitreGrade extends AbstractEntity{

    private Integer typeCalcul;
    private Double moyenne;
    private Integer resutat;
    private Integer validation;
    private String moyenneSemestre;
    private Date dateValidation;
    private String sessionMois;
    private String sessionAnnee;
    private Date dateEmissionAttestation;
    private Date dateEmissionDiplome;
    private String numeroAttestation;
    private String numeroDiplome;
    private Date dateModificationAttestation;
    private Date dateModificationDiplome;
    private Boolean estImporte;
    private Integer etatAttestation;
    private Integer etatDiplome;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etudiant")
    private Etudiant etudiant;
}
