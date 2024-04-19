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
public class InscriptionAdministrativeServiceImpl implements InscriptionAdministrativeService{
    @Autowired
    private InscriptionAdministrativeRepository inscriptionAdministrativeRepository;

    @Override
    public String creer(InscriptionAdministrative inscriptionAdministrative) {
        inscriptionAdministrativeRepository.save(inscriptionAdministrative);
        return "InscriptionAdministrative créer";
    }

    @Override
    public List<InscriptionAdministrative> lire() {
        return inscriptionAdministrativeRepository.findAll();
    }

    @Override
    public Optional<InscriptionAdministrative> findById(Integer id) {
        return inscriptionAdministrativeRepository.findById(id);
    }

    @Override
    public String supprimer(Integer id) {
        if (inscriptionAdministrativeRepository.existsById(id)){
            inscriptionAdministrativeRepository.deleteById(id);
            return "inscriptionAdministrative";
        }else {
            return "inscriptionAdministrative non trouvée";
        }
    }
}
