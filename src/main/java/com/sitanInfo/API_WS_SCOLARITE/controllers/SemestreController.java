package com.sitanInfo.API_WS_SCOLARITE.controllers;

import com.sitanInfo.API_WS_SCOLARITE.model.Semestre;
import com.sitanInfo.API_WS_SCOLARITE.services.SemestreService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
public class SemestreController {

    @Autowired
    private SemestreService semestreService;

    @Operation(summary = "Creer un semestre")
    @PostMapping("/semestre")
    public String create(@RequestBody Semestre semestre){
        return semestreService.creer(semestre);
    }

    @Operation(summary = "La liste des semestre")
    @GetMapping("/semestre")
    public List<Semestre> read(){
        return semestreService.lire();
    }

    @Operation(summary = "Afficher un semestre")
    @GetMapping("/semestre/{id}")
    public Optional<Semestre> semestre(@PathVariable int id){
        return semestreService.findById(id);
    }

    @Operation(summary = "Supprimer un semestre")
    @DeleteMapping("/semestre/{id}")
    public String delete(@PathVariable int id){
        return semestreService.supprimer(id);
    }
}
