package com.sitanInfo.API_WS_SCOLARITE.services;

import com.sitanInfo.API_WS_SCOLARITE.model.Etudiant;
import com.sitanInfo.API_WS_SCOLARITE.repository.EtudiantRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
public class EtudiantService{

    @Autowired
    private EtudiantRepository etudiantRepository;


    public String creer(Etudiant etudiant) {
        try {
            Etudiant etudiantExiste = etudiantRepository.getByMatricule(etudiant.getMatricule());
            if (etudiantExiste != null){
                return "Cet etudiant existe deja";
            } else {
                etudiantRepository.save(etudiant);
                return "Etudiant enregistrer";
            }
        } catch (Exception e){
            e.printStackTrace();
            return "Une erreur s'est produite lors de la creation de l'etudiant";
        }
    }

    public List<Etudiant> lire() {
        return etudiantRepository.findAll();
    }

    public Optional<Etudiant> findById(Integer id) {
        return etudiantRepository.findById(id);
    }

    public String modifier(Integer id, Etudiant etudiant) {
        try {
            //Rechercher l'etudiant par son id
            Etudiant etudiantModofier = etudiantRepository.findById(id).orElse(null);
            if (etudiantModofier == null){
                return "Etudiant non trouvé";
            }
            //Mettre à jour les données
            etudiantModofier.setNom(etudiant.getNom());
            etudiantModofier.setMatricule(etudiant.getMatricule());
            etudiantModofier.setPrenom(etudiant.getPrenom());
            etudiantModofier.setSexe(etudiant.getSexe());
            etudiantModofier.setStatut(etudiant.getStatut());
            etudiantModofier.setAncienMatricule(etudiant.getAncienMatricule());
            etudiantModofier.setTel1(etudiant.getTel1());
            etudiantModofier.setLieuNaissance(etudiant.getLieuNaissance());
            etudiantModofier.setSerieBac(etudiant.getSerieBac());
            etudiantModofier.setTel2(etudiant.getTel2());
            etudiantModofier.setDateNaissance(etudiant.getDateNaissance());

            //Enregistrer les modifications
            etudiantRepository.save(etudiantModofier);
            return "Etudiant modifié avec succés";
        } catch (Exception e){
            e.printStackTrace();
            return "Une erreur s'est produite lors de la modification del'etudiant";
        }
    }

    public String supprimer(Integer id) {
        if (etudiantRepository.existsById(id)){
            etudiantRepository.deleteById(id);
            return "Etudiant supprimé";
        } else {
            return "Cet etudiant n'existe pas";
        }
    }
}
