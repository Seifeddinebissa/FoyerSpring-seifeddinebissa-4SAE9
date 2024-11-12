package com.example.foyer_springboot.controller;

import com.example.foyer_springboot.entities.Bloc;
import com.example.foyer_springboot.entities.Chambre;
import com.example.foyer_springboot.enums.TypeChambre;
import com.example.foyer_springboot.services.ChambreServiceImpl;
import com.example.foyer_springboot.services.IChambreService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/chambre")
@AllArgsConstructor
@Tag(name="gestion universite")
public class chambreController {
    IChambreService service;
    ChambreServiceImpl serviceImp;

    @PostMapping("/add")
    public Chambre addChambre(@RequestBody Chambre c){
        return service.addChambre(c);
    }
    @PutMapping("/update")
    public Chambre updateChambre(@RequestBody Chambre c){
        return  service.updateChambre(c);
    }
    @GetMapping("/get-all")
    @JsonIgnore
    public List<Chambre> getAllChambres(){
        return service.getAllChambre();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteChambre(@PathVariable("id") Long id){
        service.deleteChambre(id);
    }
    @GetMapping("/get-type-chambre")
    public List<Chambre> findByTypeChambre(@RequestParam("type") TypeChambre type){
        return  service.findAllByTypeC(type);
    }
    @GetMapping("/get-numero-chambre")
    public Chambre findByNumChambre(@RequestParam("numero") Long numero){
        return service.findByNumeroChambre(numero);
    }
    @GetMapping("/get-bloc-type")
    public List<Chambre> getByBlocAndType(@RequestBody Bloc bloc, @RequestParam("type") TypeChambre type){
        return  service.getChambresByBlocAndTypeC(bloc,type);
    }
    @GetMapping("/get-nom-bloc")
    public List<Chambre> getByBlocName(@RequestParam("nombloc") String nomBloc){
        return serviceImp.getChambresByBloc_nomBloc(nomBloc);
    }
    @GetMapping("/get-annee-reservation-between")
    public List<Chambre> getByAnneeReservationBetween(@RequestParam("date1") @DateTimeFormat(pattern = "yyyy-mm-dd") Date d1, @RequestParam("date2") @DateTimeFormat(pattern = "yyyy-mm-dd") Date d2){
        return serviceImp.findByAnneeReservationQuery(d1,d2);
    }
    @GetMapping("/get-nom-bloc-query")
    public List<Chambre> findByBlocNameQuery(@RequestParam("nom-bloc") String nom){
        return serviceImp.findByBlocNameQuery(nom);
    }

}
