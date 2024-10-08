package com.example.foyer_springboot.controller;

import com.example.foyer_springboot.entities.Chambre;
import com.example.foyer_springboot.entities.Foyer;
import com.example.foyer_springboot.services.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RequestMapping("/Foyer")
@RestController
public class FoyerController {
    IFoyerService service;
    @PostMapping("/add")
    public Foyer addFoyer(@RequestBody Foyer f){
        return service.addFoyer(f);
    }
    @PutMapping("/update")
    public Foyer updateFoyer(@RequestBody Foyer f){
        return  service.updateFoyer(f);
    }
    @GetMapping("/get-all")
    public List<Foyer> getAllFoyers(){
        return service.getAllFoyer();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteChambre(@PathVariable("id") Long id){
        service.deleteFoyer(id);
    }
}
