package com.example.foyer_springboot.controller;

import com.example.foyer_springboot.entities.Bloc;
import com.example.foyer_springboot.entities.Chambre;
import com.example.foyer_springboot.services.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class blocController {
    IBlocService service;

    @PostMapping("/add")
    public Bloc addBloc(@RequestBody Bloc b){
        return service.addBloc(b);
    }
    @PutMapping("/update")
    public Bloc updateBloc(@RequestBody Bloc b){
        return  service.updateBloc(b);
    }
    @GetMapping("/get-all")
    public List<Bloc> getAllBloc(){
        return service.getAllBloc();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteBloc(@PathVariable("id") Long id){
        service.deleteBloc(id);
    }
}
