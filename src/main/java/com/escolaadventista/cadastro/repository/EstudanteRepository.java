package com.escolaadventista.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.escolaadventista.cadastro.model.Estudante;

public interface EstudanteRepository extends JpaRepository<Estudante,Long> {

}
