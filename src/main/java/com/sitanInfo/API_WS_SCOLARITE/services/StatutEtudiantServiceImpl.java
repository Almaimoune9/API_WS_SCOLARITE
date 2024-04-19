package com.sitanInfo.API_WS_SCOLARITE.services;

import com.sitanInfo.API_WS_SCOLARITE.model.StatutEtudiant;
import com.sitanInfo.API_WS_SCOLARITE.repository.StatutEtudiantRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
public class StatutEtudiantServiceImpl implements StatutEtudiantService{

    @Autowired
    private StatutEtudiantRepository statutEtudiantRepository;

    @Override
    public String creer(StatutEtudiant statutEtudiant) {
        try {
            StatutEtudiant statutEtudiantExiste = statutEtudiantRepository.getByCode(statutEtudiant.getCode());
            if (statutEtudiantExiste != null){
                return "Cet statut existe deja";
            } else {
                statutEtudiantRepository.save(statutEtudiant);
                return "Statut créer";
            }
        } catch (Exception e){
            e.printStackTrace();
            return "Une erreur s'est produite lors de la création du statut";
        }
    }

    @Override
    public List<StatutEtudiant> lire() {
        return statutEtudiantRepository.findAll();
    }

    @Override
    public Optional<StatutEtudiant> findById(Integer id) {
        return statutEtudiantRepository.findById(id);
    }

    @Override
    public String modifier(Integer id, StatutEtudiant statutEtudiant) {
        try {
            //Rechercher le statut par son id
            StatutEtudiant statutEtudiantModifier = statutEtudiantRepository.findById(id).orElse(null);
            if (statutEtudiantModifier == null){
                return "Statut non trouvé";
            }
            //Mettre à jour les données
            statutEtudiantModifier.setCode(statutEtudiant.getCode());
            statutEtudiantModifier.setDescription(statutEtudiant.getDescription());
            statutEtudiantModifier.setLibelle(statutEtudiant.getLibelle());

            //Enregistrer les modifications
            statutEtudiantRepository.save(statutEtudiantModifier);
            return "Statut modifié avec succés";
        } catch (Exception e){
            e.printStackTrace();
            return "Une erreur s'est produite lors de la modification du statut";
        }
    }

    @Override
    public String supprimer(Integer id) {
        if (statutEtudiantRepository.existsById(id)){
            statutEtudiantRepository.deleteById(id);
            return "Statut supprimer";
        } else {
            return "Ce statut n'existe pas";
        }
    }
}
