package com.sitanInfo.API_WS_SCOLARITE.controllers;

import com.sitanInfo.API_WS_SCOLARITE.model.InscriptionAdministrative;
import com.sitanInfo.API_WS_SCOLARITE.model.Paiement;
import com.sitanInfo.API_WS_SCOLARITE.services.InscriptionAdministrativeService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
public class InscriptionAdministrativeController {

    @Autowired
    private InscriptionAdministrativeService inscriptionAdministrativeService;

    @Operation(summary = "Créer une inscriptionAdministrative")
    @PostMapping("/inscriptionAdministrative")
    public String create(@RequestBody InscriptionAdministrative inscriptionAdministrative){
        return inscriptionAdministrativeService.creer(inscriptionAdministrative);
    }

    @Operation(summary = "La liste des inscriptionAdministrative")
    @GetMapping("/inscriptionAdministrative")
    public List<InscriptionAdministrative> read(){
        return inscriptionAdministrativeService.lire();
    }

    @Operation(summary = "Afficher une inscriptionAdministrative")
    @GetMapping("//inscriptionAdministrative/{id}")
    public Optional<InscriptionAdministrative> inscriptionAdministrative(@PathVariable int id){
        return inscriptionAdministrativeService.findById(id);
    }

    @Operation(summary = "Supprimer une inscriptionAdministrative")
    @DeleteMapping("/inscriptionAdministrative/{id}")
    public String delete(@PathVariable int id){
        return inscriptionAdministrativeService.supprimer(id);
    }
}
