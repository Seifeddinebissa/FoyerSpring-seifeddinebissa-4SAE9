package com.example.foyer_springboot.repositories;

import com.example.foyer_springboot.entities.Bloc;
import com.example.foyer_springboot.entities.Chambre;
import com.example.foyer_springboot.enums.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long> {
    List<Chambre> findAllByTypeC(TypeChambre tc);
    Chambre findByNumeroChambre(Long numeroChambre);
    List<Chambre> getChambresByBlocAndTypeC(Bloc idBloc, TypeChambre typeChambre);
    List<Chambre> findByBloc_NomBloc(String nomBloc);

    @Query("SELECT c FROM Chambre c WHERE c.bloc.nomBloc = :nombloc")
    List<Chambre> findByBlocNameQuery(@Param("nombloc") String nomBloc);
    @Query("SELECT c FROM Chambre c JOIN c.reservations r WHERE r.anneeUniversitaire BETWEEN ?1 AND ?2")
    List<Chambre> findByAnneeReservationQuery(@DateTimeFormat(pattern = "yyyy-mm-dd") Date startDate, @DateTimeFormat(pattern = "yyyy-mm-dd") Date endDate);
}
