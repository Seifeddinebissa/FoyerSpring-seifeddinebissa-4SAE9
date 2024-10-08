package com.example.foyer_springboot.services;

import com.example.foyer_springboot.entities.Bloc;
import com.example.foyer_springboot.entities.Etudiant;
import com.example.foyer_springboot.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer addFoyer(Foyer foyer);
    List<Foyer> getAllFoyer();
    void deleteFoyer(Long id);
    Foyer updateFoyer(Foyer foyer);
}
