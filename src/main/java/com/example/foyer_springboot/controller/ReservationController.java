package com.example.foyer_springboot.controller;

import com.example.foyer_springboot.entities.Foyer;
import com.example.foyer_springboot.entities.Reservation;
import com.example.foyer_springboot.services.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RequestMapping("/reservation")
@RestController
public class ReservationController {
    IReservationService service;

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
}
