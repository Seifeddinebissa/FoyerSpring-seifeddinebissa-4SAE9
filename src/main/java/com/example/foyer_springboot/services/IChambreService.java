package com.example.foyer_springboot.services;

import com.example.foyer_springboot.entities.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre addChambre(Chambre chambre);
    List<Chambre> getAllChambre();
    void deleteChambre(Long id);
    Chambre updateChambre(Chambre chambre);

}
