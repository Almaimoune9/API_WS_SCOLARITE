package com.sitanInfo.API_WS_SCOLARITE.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Entity
@Data
public class InscriptionsExamensElements extends AbstractEntity{

    private Long parcours;
    private Long module;
    private Long matiere;
    private Long element;
    private Boolean etat;
    private Integer dispense;
    private Integer absence;
    private Double moyenne;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "semestre")
    private Semestre semestre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "inscriptionAdministrative")
    private InscriptionAdministrative inscriptionAdministrative;
}
