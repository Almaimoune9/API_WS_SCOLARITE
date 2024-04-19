package com.sitanInfo.API_WS_SCOLARITE.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class GroupesCollections extends AbstractEntity{

    private String libelle;
    private Date dateDebut;
    private Date dateFin;
    private Integer niveau;
    private Boolean commun;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "semestre")
    private Semestre semestre;
}
