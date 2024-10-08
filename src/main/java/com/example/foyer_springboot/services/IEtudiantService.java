package com.example.foyer_springboot.services;

import com.example.foyer_springboot.entities.Bloc;
import com.example.foyer_springboot.entities.Etudiant;

import java.util.List;

public interface IEtudiantService{
    Etudiant addEtudiant(Etudiant etudiant);
    List<Etudiant> getAllEtudiant();
    void deleteEtudiant(Long id);
    Etudiant updateEtudiant(Etudiant Etudiant);
}
