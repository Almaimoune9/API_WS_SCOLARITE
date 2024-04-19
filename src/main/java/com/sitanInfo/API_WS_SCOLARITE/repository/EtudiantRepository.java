package com.sitanInfo.API_WS_SCOLARITE.repository;

import com.sitanInfo.API_WS_SCOLARITE.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {

    Etudiant getByMatricule(String matricule);
}
