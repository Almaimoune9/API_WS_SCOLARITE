package com.sitanInfo.API_WS_SCOLARITE.controllers;

import com.sitanInfo.API_WS_SCOLARITE.model.InscriptionsDossiers;
import com.sitanInfo.API_WS_SCOLARITE.model.StatutEtudiant;
import com.sitanInfo.API_WS_SCOLARITE.services.InscriptionsDossierService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
public class InscriptionDossierController {

    @Autowired
    private InscriptionsDossierService inscriptionsDossierService;

    @Operation(summary = "Creer un dossier")
    @PostMapping("/inscriptionsDossier")
    public String create(@RequestBody InscriptionsDossiers inscriptionsDossiers){
        return inscriptionsDossierService.creer(inscriptionsDossiers);
    }

    @Operation(summary = "La liste des dossiers")
    @GetMapping("/inscriptionsDossier")
    public List<InscriptionsDossiers> read(){
        return inscriptionsDossierService.lire();
    }

    @Operation(summary = "Afficher un dossier")
    @GetMapping("/inscriptionsDossier/{id}")
    public Optional<InscriptionsDossiers> inscriptionsDossier(@PathVariable int id){
        return inscriptionsDossierService.findById(id);
    }

    @Operation(summary = "Supprimer un dossier")
    @DeleteMapping("/inscriptionsDossier/{id}")
    public String delete(@PathVariable int id){
        return inscriptionsDossierService.supprimer(id);
    }
}
