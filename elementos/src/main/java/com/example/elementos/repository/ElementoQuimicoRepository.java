package com.example.elementos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.elementos.models.ElementoQuimico;

@Repository
public interface ElementoQuimicoRepository extends JpaRepository<ElementoQuimico, Integer> {
    // Você pode adicionar métodos personalizados aqui, se necessário
}