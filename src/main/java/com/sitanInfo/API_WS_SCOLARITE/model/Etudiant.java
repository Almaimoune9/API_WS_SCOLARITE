package com.sitanInfo.API_WS_SCOLARITE.model;

import jakarta.persistence.Entity;
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


}
