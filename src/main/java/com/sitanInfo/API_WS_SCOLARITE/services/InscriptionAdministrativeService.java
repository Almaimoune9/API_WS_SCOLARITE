package com.sitanInfo.API_WS_SCOLARITE.services;

import com.sitanInfo.API_WS_SCOLARITE.model.InscriptionAdministrative;
import com.sitanInfo.API_WS_SCOLARITE.repository.InscriptionAdministrativeRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
public class InscriptionAdministrativeService{
    @Autowired
    private InscriptionAdministrativeRepository inscriptionAdministrativeRepository;

    public String creer(InscriptionAdministrative inscriptionAdministrative) {
        inscriptionAdministrativeRepository.save(inscriptionAdministrative);
        return "InscriptionAdministrative créer";
    }

    public List<InscriptionAdministrative> lire() {
        return inscriptionAdministrativeRepository.findAll();
    }

    public Optional<InscriptionAdministrative> findById(Integer id) {
        return inscriptionAdministrativeRepository.findById(id);
    }

    public String supprimer(Integer id) {
        if (inscriptionAdministrativeRepository.existsById(id)){
            inscriptionAdministrativeRepository.deleteById(id);
            return "inscriptionAdministrative";
        }else {
            return "inscriptionAdministrative non trouvée";
        }
    }
}
