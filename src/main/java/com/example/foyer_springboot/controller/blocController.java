package com.example.foyer_springboot.controller;

import com.example.foyer_springboot.entities.Bloc;
import com.example.foyer_springboot.entities.Chambre;
import com.example.foyer_springboot.services.BlocServiceImpl;
import com.example.foyer_springboot.services.IBlocService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name="gestion universite")
@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class blocController {
    IBlocService service;
    BlocServiceImpl serviceImpl;

    @PostMapping("/add")
    public Bloc addBloc(@RequestBody Bloc b){
        return service.addBloc(b);
    }
    @PutMapping("/update")
    public Bloc updateBloc(@RequestBody Bloc b){
        return  service.updateBloc(b);
    }
    @GetMapping("/get-all")
    @JsonIgnore
    public List<Bloc> getAllBloc(){
        return service.getAllBloc();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteBloc(@PathVariable("id") Long id){
        service.deleteBloc(id);
    }
    @GetMapping("/get/{id}")
    public Bloc getBlocById(@PathVariable("id") Long id){
        return service.getBlocById(id);
    }
    @GetMapping("/get-capacite-greater")
    public Integer getByCapaciteBlocGreaterThan(@RequestParam("capacite") Long capacite){
        return serviceImpl.countByCapaciteBlocGreaterThan(capacite);
    }
}
