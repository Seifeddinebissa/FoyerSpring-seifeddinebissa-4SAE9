package com.example.foyer_springboot.services;

import com.example.foyer_springboot.entities.Bloc;
import com.example.foyer_springboot.entities.Chambre;
import com.example.foyer_springboot.enums.TypeChambre;

import java.util.List;

public interface IChambreService {
    Chambre addChambre(Chambre chambre);
    List<Chambre> getAllChambre();
    void deleteChambre(Long id);
    Chambre updateChambre(Chambre chambre);
    List<Chambre> findAllByTypeC(TypeChambre tc);
    Chambre findByNumeroChambre(Long numeroChambre);
    List<Chambre> getChambresByBlocAndTypeC(Bloc bloc, TypeChambre typeChambre);

}
