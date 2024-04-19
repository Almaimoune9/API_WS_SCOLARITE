package com.sitanInfo.API_WS_SCOLARITE.services;

import com.sitanInfo.API_WS_SCOLARITE.model.Etudiant;
import com.sitanInfo.API_WS_SCOLARITE.model.InscriptionAdministrative;

import java.util.List;
import java.util.Optional;

public interface InscriptionAdministrativeService {

    //Methode pour une inscription
    String creer(InscriptionAdministrative inscriptionAdministrative);

    //La liste des inscriptions
    List<InscriptionAdministrative> lire();

    //Afficher une inscription
    Optional<InscriptionAdministrative> findById(Integer id);

    //Supprimer une inscription
    String supprimer(Integer id);
}
