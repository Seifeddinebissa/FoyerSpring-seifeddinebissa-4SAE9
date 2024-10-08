package com.example.foyer_springboot.controller;

import com.example.foyer_springboot.entities.Chambre;
import com.example.foyer_springboot.services.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chambre")
@AllArgsConstructor
public class chambreController {
    IChambreService service;

    @PostMapping("/add")
    public Chambre addChambre(@RequestBody Chambre c){
        return service.addChambre(c);
    }
    @PutMapping("/update")
    public Chambre updateChambre(@RequestBody Chambre c){
        return  service.updateChambre(c);
    }
    @GetMapping("/get-all")
    public List<Chambre> getAllChambres(){
        return service.getAllChambre();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteChambre(@PathVariable("id") Long id){
        service.deleteChambre(id);
    }
}
