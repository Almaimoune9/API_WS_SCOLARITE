package com.sitanInfo.API_WS_SCOLARITE.model;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class HistoriquesNotes extends AbstractEntity{

    private Long note;
    private Date date;
    private String commentaire;
    private Integer session;

}
