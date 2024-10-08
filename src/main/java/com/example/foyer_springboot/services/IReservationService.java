package com.example.foyer_springboot.services;

import com.example.foyer_springboot.entities.Foyer;
import com.example.foyer_springboot.entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation reservation);
    List<Reservation> getAllReservation();
    void deleteReservation(String id);
    Reservation updateReservation(Reservation reservation);
}
