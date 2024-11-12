package com.example.foyer_springboot.services;

import com.example.foyer_springboot.entities.Reservation;
import com.example.foyer_springboot.repositories.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Service
public class ReservationServiceImpl implements IReservationService{

    ReservationRepository reservationRepository;
    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> getAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public void deleteReservation(String id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
    public List<Reservation> findByAnneeUniversitaireBetween(Date d1, Date d2){
        return reservationRepository.findByAnneeUniversitaireBetween(d1,d2);
    }
}
