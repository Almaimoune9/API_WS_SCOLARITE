package com.sitanInfo.API_WS_SCOLARITE.services;

import com.sitanInfo.API_WS_SCOLARITE.model.InscriptionsDossiers;
import com.sitanInfo.API_WS_SCOLARITE.repository.InscriptionsDossierRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
public class InscriptionsDossierServiceImpl implements InscriptionsDossierService{

    @Autowired
    private InscriptionsDossierRepository inscriptionsDossierRepository;
    @Override
    public String creer(InscriptionsDossiers inscriptionsDossiers) {
        try {
            InscriptionsDossiers inscriptionDossierExiste = inscriptionsDossierRepository.getByNumero(inscriptionsDossiers.getNumero());
            if (inscriptionDossierExiste != null){
                return "Ce dossier existe deja";
            } else {
                inscriptionsDossierRepository.save(inscriptionsDossiers);
                return "Dossier créer";
            }
        } catch (Exception e){
            e.printStackTrace();
            return "Une erreur s'est produite lors de la création du dossier";
        }
    }

    @Override
    public List<InscriptionsDossiers> lire() {
        return null;
    }

    @Override
    public Optional<InscriptionsDossiers> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public String modifier(Integer id, InscriptionsDossiers inscriptionsDossiers) {
        return null;
    }

    @Override
    public String supprimer(Integer id) {
        return null;
    }
}
