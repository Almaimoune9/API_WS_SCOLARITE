package com.sitanInfo.API_WS_SCOLARITE.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Compensations extends AbstractEntity{

    private Integer ordre;
    private Integer niveau;
    private String code;
    private String formule;
    private Integer comptabilisable;
    private Integer imprimable;
    private Integer calculFinal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "semestre")
    private Semestre semestre;
}
