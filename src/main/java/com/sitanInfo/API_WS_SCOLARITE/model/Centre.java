package com.sitanInfo.API_WS_SCOLARITE.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Centre extends AbstractEntity{

    private String code;
    private String nom;
    private String adresse;
    private String telephone;
}
