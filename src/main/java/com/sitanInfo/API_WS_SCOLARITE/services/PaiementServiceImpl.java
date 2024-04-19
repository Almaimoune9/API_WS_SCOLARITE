package com.sitanInfo.API_WS_SCOLARITE.services;

import com.sitanInfo.API_WS_SCOLARITE.model.Paiement;
import com.sitanInfo.API_WS_SCOLARITE.repository.PaiementRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
public class PaiementServiceImpl implements PaiementService{

    @Autowired
    private PaiementRepository paiementRepository;

    @Override
    public String creer(Paiement paiement) {
         paiementRepository.save(paiement);
         return "Paiement créer";
    }

    @Override
    public List<Paiement> lire() {
        return paiementRepository.findAll();
    }

    @Override
    public Optional<Paiement> findById(Integer id) {
        return paiementRepository.findById(id);
    }

    @Override
    public String supprimer(Integer id) {
        if (paiementRepository.existsById(id)){
            paiementRepository.deleteById(id);
            return "Paiement supprimer";
        } else{
            return "Paiement non trouvé";
        }
    }
}
