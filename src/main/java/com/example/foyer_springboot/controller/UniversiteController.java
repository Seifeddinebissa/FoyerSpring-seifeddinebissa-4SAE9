package com.example.foyer_springboot.controller;

import com.example.foyer_springboot.entities.Universite;
import com.example.foyer_springboot.services.IUniversiteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name="gestion universite")
@RequestMapping("/universite")
@RestController
@AllArgsConstructor
public class UniversiteController {
    IUniversiteService service;

    @Operation(description = "Ajouter une nouvelle université")
    @PostMapping("/add")
    public Universite addUniversite(@RequestBody Universite u){
        return service.addUniversite(u);
    }
    @PutMapping("/update")
    public Universite updateUniversite(@RequestBody Universite u){
        return  service.updateUniversite(u);
    }
    @GetMapping("/get-all")
    public List<Universite> getAllUniversite(){
        return service.getAllUniversite();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteUniversite(@PathVariable("id") Long id){
        service.deleteUniversite(id);
    }
}
