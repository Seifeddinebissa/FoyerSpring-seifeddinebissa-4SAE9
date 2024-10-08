package com.example.foyer_springboot.services;

import com.example.foyer_springboot.entities.Bloc;
import com.example.foyer_springboot.entities.Chambre;

import java.util.List;

public interface IBlocService {
    Bloc addBloc(Bloc bloc);
    List<Bloc> getAllBloc();
    void deleteBloc(Long id);
    Bloc updateBloc(Bloc bloc);
}
