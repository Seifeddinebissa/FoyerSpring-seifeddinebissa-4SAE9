package com.example.foyer_springboot.repositories;

import com.example.foyer_springboot.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, String> {
    List<Reservation> findByAnneeUniversitaireBetween(Date d1, Date d2);
}
