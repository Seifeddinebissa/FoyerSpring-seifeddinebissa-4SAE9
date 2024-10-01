package com.example.foyer_springboot.entities;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;
    private String nomUniversite;
    private String adresse;
    @OneToOne
    private Foyer foyer;
}
