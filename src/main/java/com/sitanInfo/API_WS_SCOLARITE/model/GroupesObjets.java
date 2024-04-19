package com.sitanInfo.API_WS_SCOLARITE.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class GroupesObjets extends AbstractEntity{

    private String typeObjet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "semestre")
    private Semestre semestre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "groupesGroupes")
    private GroupesGroupes groupesGroupes;
}
