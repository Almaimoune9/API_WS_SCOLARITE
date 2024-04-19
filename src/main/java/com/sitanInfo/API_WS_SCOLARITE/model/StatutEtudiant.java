package com.sitanInfo.API_WS_SCOLARITE.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class StatutEtudiant extends AbstractEntity{

    private String code;
    private String libelle;

    private String description;
    private boolean selected;
}
