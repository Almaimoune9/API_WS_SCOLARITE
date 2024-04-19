package com.sitanInfo.API_WS_SCOLARITE.controllers;

import com.sitanInfo.API_WS_SCOLARITE.model.Etudiant;
import com.sitanInfo.API_WS_SCOLARITE.services.EtudiantService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
public class EtudiantController {

    @Autowired
    private EtudiantService etudiantService;

    @Operation(summary = "Creer un etudiant")
    @PostMapping("/etudiant")
    public String create(@RequestBody Etudiant etudiant){
        return etudiantService.creer(etudiant);
    }

    @Operation(summary = "La liste des etudiants")
    @GetMapping("/etudiant")
    public List<Etudiant> read(){
        return etudiantService.lire();
    }

    @Operation(summary = "Afficher un etudiant")
    @GetMapping("/etudiant/{id}")
    public Optional<Etudiant> etudiant(@PathVariable int id){
        return etudiantService.findById(id);
    }

    @Operation(summary = "Supprimer un etudiant")
    @DeleteMapping("/etudiant/{id}")
    public String delete(@PathVariable int id){
        return etudiantService.supprimer(id);
    }

}
