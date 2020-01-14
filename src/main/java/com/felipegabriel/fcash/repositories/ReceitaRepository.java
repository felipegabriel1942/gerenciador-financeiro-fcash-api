package com.felipegabriel.fcash.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipegabriel.fcash.models.Receita;

@Repository
public interface ReceitaRepository extends JpaRepository<Receita, Integer>{

}
