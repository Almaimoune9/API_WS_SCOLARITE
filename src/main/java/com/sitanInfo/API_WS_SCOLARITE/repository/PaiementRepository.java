package com.sitanInfo.API_WS_SCOLARITE.repository;

import com.sitanInfo.API_WS_SCOLARITE.model.Paiement;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;

@Registered
public interface PaiementRepository extends JpaRepository<Paiement, Integer> {
}
