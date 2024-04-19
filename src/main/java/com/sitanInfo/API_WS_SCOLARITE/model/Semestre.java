package com.sitanInfo.API_WS_SCOLARITE.model;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Semestre extends AbstractEntity{

    private Integer ordre;
    private Integer vh;
    private Double credit;
    private Double creditContrainte;
    private Double noteBase;
    private Double noteObtention;
    private Double noteElemination;
    private Date dateDebut;
    private Date dateFin;
    private Integer session1;
    private Integer session2;
}
