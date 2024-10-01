package com.example.foyer_springboot.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;
    private String nomFoyer;
    private Long capaciteFoyer;
    @OneToOne(mappedBy = "foyer")
    private Universite universite;
    @OneToMany(mappedBy = "foyer")
    private List<Bloc> blocs;
}
