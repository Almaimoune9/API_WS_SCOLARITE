package com.sitanInfo.API_WS_SCOLARITE.services;

import com.sitanInfo.API_WS_SCOLARITE.model.Etudiant;

import java.util.List;
import java.util.Optional;

public interface EtudiantService {

    //Methode pour créer un etudiant
    String creer(Etudiant etudiant);

    //La liste des etudiants
    List<Etudiant> lire();

    //Afficher un etudiant
    Optional<Etudiant> findById(Integer id);

    //Modifier un etudiant
    String modifier(Integer id, Etudiant etudiant);

    //Supprimer un etudiant
    String supprimer(Integer id);
}
