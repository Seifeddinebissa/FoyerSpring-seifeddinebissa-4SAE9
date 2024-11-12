package com.example.foyer_springboot.services;

import com.example.foyer_springboot.entities.Bloc;
import com.example.foyer_springboot.entities.Chambre;
import com.example.foyer_springboot.enums.TypeChambre;
import com.example.foyer_springboot.repositories.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Service
public class ChambreServiceImpl implements IChambreService{

    ChambreRepository chambreRepository;

    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public List<Chambre> getAllChambre() {
        return chambreRepository.findAll();
    }

    @Override
    public void deleteChambre(Long id) {
        chambreRepository.deleteById(id);
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public List<Chambre> findAllByTypeC(TypeChambre tc) {
        return chambreRepository.findAllByTypeC(tc);
    }

    @Override
    public Chambre findByNumeroChambre(Long numeroChambre) {
        return chambreRepository.findByNumeroChambre(numeroChambre);
    }

    @Override
    public List<Chambre> getChambresByBlocAndTypeC(Bloc bloc, TypeChambre typeChambre) {
        return chambreRepository.getChambresByBlocAndTypeC(bloc, typeChambre);
    }


    public List<Chambre> getChambresByBloc_nomBloc(String nomBloc) {
        return chambreRepository.findByBloc_NomBloc(nomBloc);
    }

    public List<Chambre> findByAnneeReservationQuery(Date d1, Date d2){
        return chambreRepository.findByAnneeReservationQuery(d1,d2);
    }

    public List<Chambre> findByBlocNameQuery(String name){
        return chambreRepository.findByBlocNameQuery(name);
    }
}
