package com.example.foyer_springboot.repositories;

import com.example.foyer_springboot.entities.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlocRepository extends JpaRepository<Bloc, Long> {
    Integer countByCapaciteBlocGreaterThan(Long capacite);
}
