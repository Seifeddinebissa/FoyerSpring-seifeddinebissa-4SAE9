package com.example.foyer_springboot.services;

import com.example.foyer_springboot.entities.Reservation;
import com.example.foyer_springboot.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite universite);
    List<Universite> getAllUniversite();
    void deleteUniversite(Long id);
    Universite updateUniversite(Universite universite);
}
