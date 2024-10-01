package com.example.foyer_springboot.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;
    private String nomBloc;
    private Long capaciteBloc;
    @ManyToOne
    private Foyer foyer;
    @OneToMany(mappedBy = "bloc")
    private List<Chambre> chambres;
}