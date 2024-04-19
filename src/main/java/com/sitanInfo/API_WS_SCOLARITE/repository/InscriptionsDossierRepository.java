package com.sitanInfo.API_WS_SCOLARITE.repository;

import com.sitanInfo.API_WS_SCOLARITE.model.InscriptionsDossiers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscriptionsDossierRepository extends JpaRepository<InscriptionsDossiers, Integer> {
    InscriptionsDossiers getByNumero(String numero);
}
