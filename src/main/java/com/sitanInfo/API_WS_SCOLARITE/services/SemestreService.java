package com.sitanInfo.API_WS_SCOLARITE.services;

import com.sitanInfo.API_WS_SCOLARITE.model.Semestre;

import java.util.List;
import java.util.Optional;

public interface SemestreService {

    //Créer un semestre
    String creer(Semestre semestre);

    //Affciher la liste
    List<Semestre> lire();

    //Afficher un semestre
    Optional<Semestre> findById(Integer id);

    //Supprimer un semestre
    String supprimer(Integer id);

}
