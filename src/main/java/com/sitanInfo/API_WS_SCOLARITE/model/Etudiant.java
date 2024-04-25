package com.sitanInfo.API_WS_SCOLARITE.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Etudiant extends AbstractEntity{

    private String matricule;
    private String dateInscription;
    private String nom;
    private String prenom;
    private String sexe;
    private Date dateNaissance;
    private String lieuNaissance;
    private String tel1;
    private String tel2;
    private String serieBac;
    private String statut;
    private String ancienMatricule;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "centre")
    private Centre centre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "civilite")
    private Civilite civilite;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "statutEtudiant")
    private StatutEtudiant statutEtudiant;


}
