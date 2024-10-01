package com.example.foyer_springboot.entities;

import com.example.foyer_springboot.enums.TypeChambre;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

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
    @ManyToOne
    private Bloc bloc;
    @OneToMany
    private List<Reservation> reservations;

}
