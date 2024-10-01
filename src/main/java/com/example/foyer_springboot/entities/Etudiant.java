package com.example.foyer_springboot.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;
    private Date dateNaissance;
    @ManyToMany(mappedBy = "etudiants")
    private List<Reservation> reservations;
}
