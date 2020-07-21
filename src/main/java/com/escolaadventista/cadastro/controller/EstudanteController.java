package com.escolaadventista.cadastro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escolaadventista.cadastro.model.Estudante;
import com.escolaadventista.cadastro.repository.EstudanteRepository;



@RestController
@RequestMapping("/api")
public class EstudanteController {

	@Autowired
	private EstudanteRepository estudanteRepository;
	
	
	@GetMapping("/estudante")
	public List<Estudante> listar(){
		return estudanteRepository.findAll();
	}
	
}
