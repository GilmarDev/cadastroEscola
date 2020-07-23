package com.escolaadventista.cadastro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	
	@PostMapping("/estudante")
	@ResponseStatus(HttpStatus.CREATED)
	public Estudante adicionarAluno(@RequestBody Estudante estudante) {
		return estudanteRepository.save(estudante);
	} 
	
	@PutMapping("/estudante/{estudanteId}")
	public ResponseEntity<Estudante> atualizarAluno(@PathVariable Long estudanteId, 
			@RequestBody Estudante estudante){
		
		estudante.setId(estudanteId);
		estudante = estudanteRepository.save(estudante);
		return ResponseEntity.ok(estudante);
	}
	
	
	@DeleteMapping("/estudante/{estudanteId}")
	public ResponseEntity<Void> removerAluno(@PathVariable Long estudanteId){
		
		if(!estudanteRepository.existsById(estudanteId)) {
			return ResponseEntity.notFound().build();
		}
		estudanteRepository.deleteById(estudanteId);
		return ResponseEntity.noContent().build();
				
	
	}
	
	
}
