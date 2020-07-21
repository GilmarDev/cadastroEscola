package com.escolaadventista.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.escolaadventista.cadastro.model.Estudante;

@Repository
public interface EstudanteRepository extends JpaRepository<Estudante,Long> {

}
