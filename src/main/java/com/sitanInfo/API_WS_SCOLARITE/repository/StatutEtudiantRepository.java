package com.sitanInfo.API_WS_SCOLARITE.repository;

import com.sitanInfo.API_WS_SCOLARITE.model.StatutEtudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatutEtudiantRepository extends JpaRepository<StatutEtudiant, Integer> {
    StatutEtudiant getByCode(String code);
}
