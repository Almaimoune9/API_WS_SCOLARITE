package com.sitanInfo.API_WS_SCOLARITE.services;

import com.sitanInfo.API_WS_SCOLARITE.model.Etudiant;
import com.sitanInfo.API_WS_SCOLARITE.model.StatutEtudiant;

import java.util.List;
import java.util.Optional;

public interface StatutEtudiantService {

    //Methode pour créer un StatutEtudiant
    String creer(StatutEtudiant statutEtudiant);

    //La liste des StatutEtudiant
    List<StatutEtudiant> lire();

    //Afficher un StatutEtudiant
    Optional<StatutEtudiant> findById(Integer id);

    //Modifier un StatutEtudiant
    String modifier(Integer id, StatutEtudiant statutEtudiant);

    //Supprimer un StatutEtudiant
    String supprimer(Integer id);
}
