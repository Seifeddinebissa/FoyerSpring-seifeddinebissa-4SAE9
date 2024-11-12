package com.example.foyer_springboot.controller;

import com.example.foyer_springboot.entities.Chambre;
import com.example.foyer_springboot.entities.Etudiant;
import com.example.foyer_springboot.services.IEtudiantService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/etudiant")
@Tag(name="gestion universite")
public class EtudiantController {
    IEtudiantService service;
    @PostMapping("/add")
    public Etudiant addEtudiant(@RequestBody Etudiant e){
        return service.addEtudiant(e);
    }
    @PutMapping("/update")
    public Etudiant updateEtudiant(@RequestBody Etudiant e){
        return  service.updateEtudiant(e);
    }
    @GetMapping("/get-all")
    public List<Etudiant> getAllEtudiant(){
        return service.getAllEtudiant();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteChambre(@PathVariable("id") Long id){
        service.deleteEtudiant(id);
    }
}
