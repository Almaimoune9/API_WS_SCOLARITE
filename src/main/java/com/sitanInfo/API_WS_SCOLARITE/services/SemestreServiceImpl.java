package com.sitanInfo.API_WS_SCOLARITE.services;

import com.sitanInfo.API_WS_SCOLARITE.model.Semestre;
import com.sitanInfo.API_WS_SCOLARITE.repository.SemestreRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
public class SemestreServiceImpl implements SemestreService{

    @Autowired
    private SemestreRepository semestreRepository;
    @Override
    public String creer(Semestre semestre) {
        semestreRepository.save(semestre);
        return "Semestre créer";
    }

    @Override
    public List<Semestre> lire() {
        semestreRepository.findAll();
    }

    @Override
    public Optional<Semestre> findById(Integer id) {
        return semestreRepository.findById(id);
    }

    @Override
    public String supprimer(Integer id) {
        if (semestreRepository.existsById(id)){
            semestreRepository.deleteById(id);
            return "Semestre supprimé";
        } else {
            return "Semestre non trouvé";
        }
    }
}
