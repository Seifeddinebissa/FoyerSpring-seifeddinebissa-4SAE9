package com.example.foyer_springboot.entities;

import com.example.foyer_springboot.enums.TypeChambre;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;
    private Long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
    @JsonIgnore
    @ManyToOne
    private Bloc bloc;
    @JsonIgnore
    @OneToMany
    private List<Reservation> reservations;

}
