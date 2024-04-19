package com.sitanInfo.API_WS_SCOLARITE.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Historique extends AbstractEntity{

    private Integer annee;
    private Integer dipAnnee;
    private String dipLieu;
    private String dipLibelle;
    private String etabLibelle;
    private String etabAnne;
    private String etabFormation;
    private String brsType;
    private String brsNumero;
    private String brsLibelle;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etudiant")
    private Etudiant etudiant;
}
