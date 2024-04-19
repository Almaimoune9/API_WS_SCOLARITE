package com.sitanInfo.API_WS_SCOLARITE.services;

import com.sitanInfo.API_WS_SCOLARITE.model.InscriptionsDossiers;
import com.sitanInfo.API_WS_SCOLARITE.model.StatutEtudiant;

import java.util.List;
import java.util.Optional;

public interface InscriptionsDossierService {
    //Methode pour créer une InscriptionsDossier
    String creer(InscriptionsDossiers inscriptionsDossiers);

    //La liste des InscriptionsDossier
    List<InscriptionsDossiers> lire();

    //Afficher une InscriptionsDossier
    Optional<InscriptionsDossiers> findById(Integer id);

    //Modifier une InscriptionsDossier
    String modifier(Integer id, InscriptionsDossiers inscriptionsDossiers);

    //Supprimer un InscriptionsDossier
    String supprimer(Integer id);
}
