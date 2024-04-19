package com.sitanInfo.API_WS_SCOLARITE.repository;

import com.sitanInfo.API_WS_SCOLARITE.model.Semestre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemestreRepository extends JpaRepository<Semestre, Integer> {
}
