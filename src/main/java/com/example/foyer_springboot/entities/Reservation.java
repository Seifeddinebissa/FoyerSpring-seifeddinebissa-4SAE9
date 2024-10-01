package com.example.foyer_springboot.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ManyToAny;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Reservation {
    @Id
    private String idReservation;
    private Date anneeUniversitaire;
    private Boolean estValid;
    @ManyToMany
    private List<Etudiant> etudiants;
}
