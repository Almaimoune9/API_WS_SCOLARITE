package com.sitanInfo.API_WS_SCOLARITE.controllers;

import com.sitanInfo.API_WS_SCOLARITE.model.StatutEtudiant;
import com.sitanInfo.API_WS_SCOLARITE.services.StatutEtudiantService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StatutEtudiantController {

    @Autowired
    private StatutEtudiantService statutEtudiantService;

    @Operation(summary = "Creer un statutEtudiant")
    @PostMapping("/statutEtudiant")
    public String create(@RequestBody StatutEtudiant statutEtudiant){
        return statutEtudiantService.creer(statutEtudiant);
    }

    @Operation(summary = "La liste des statutEtudiant")
    @GetMapping("/statutEtudiant")
    public List<StatutEtudiant> read(){
        return statutEtudiantService.lire();
    }

    @Operation(summary = "Afficher un statutEtudiant")
    @GetMapping("/statutEtudiant/{id}")
    public Optional<StatutEtudiant> statutEtudiant(@PathVariable int id){
        return statutEtudiantService.findById(id);
    }

    @Operation(summary = "Supprimer un statutEtudiant")
    @DeleteMapping("/statutEtudiant/{id}")
    public String delete(@PathVariable int id){
        return statutEtudiantService.supprimer(id);
    }
}
