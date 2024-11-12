package com.example.foyer_springboot.controller;

import com.example.foyer_springboot.entities.Foyer;
import com.example.foyer_springboot.entities.Reservation;
import com.example.foyer_springboot.services.IReservationService;
import com.example.foyer_springboot.services.ReservationServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@RequestMapping("/reservation")
@RestController
@Tag(name="gestion universite")
public class ReservationController {
    IReservationService service;
    ReservationServiceImpl serviceImpl;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    @PostMapping("/add")
    public Reservation addReservation(@RequestBody Reservation r){
        return service.addReservation(r);
    }
    @PutMapping("/update")
    public Reservation updateReservation(@RequestBody Reservation r){
        return  service.updateReservation(r);
    }
    @GetMapping("/get-all")
    public List<Reservation> getAllReservations(){
        return service.getAllReservation();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteReservation(@PathVariable("id") String id){
        service.deleteReservation(id);
    }
    @GetMapping("/get-annee-universitaire-between")
    public List<Reservation> findByanneeUniversitaireBetween(@RequestParam("d1") @DateTimeFormat(pattern = "yyyy-mm-dd") Date d1, @RequestParam("d2") @DateTimeFormat(pattern = "yyyy-mm-dd") Date d2){

        return serviceImpl.findByAnneeUniversitaireBetween(d1,d2);
    }
}
