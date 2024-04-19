package com.sitanInfo.API_WS_SCOLARITE.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class GroupesGroupes extends AbstractEntity{

    private Integer capacite;
    private Integer capaciteIntermediaire;
    private String code;
    private String libelle;
    private String temoin;
    private boolean selected;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "groupesCollections")
    private GroupesCollections groupesCollections;
}
