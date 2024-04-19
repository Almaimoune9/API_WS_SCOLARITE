package com.sitanInfo.API_WS_SCOLARITE.services;

import com.sitanInfo.API_WS_SCOLARITE.model.Paiement;

import java.util.List;
import java.util.Optional;

public interface PaiementService {

    //Creer
    String creer(Paiement paiement);

    //Afficher la liste
    List<Paiement> lire();

    //Afficher un paiement
    Optional<Paiement> findById(Integer id);

    //Supprimer un paiement
    String supprimer(Integer id);


}
