package br.com.meli.exemplobd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.exemplobd.model.Departamento;
import br.com.meli.exemplobd.repo.IDepartamentoRepo;

@RestController
public class DepartamentoController {
	
	@Autowired
	private IDepartamentoRepo repo;  // so estou fazendo isso para demonstrar
	
	@GetMapping("/departamentos")
	public ResponseEntity<List<Departamento>> getAll(){
		return ResponseEntity.ok(repo.findAll());
	}
	
	

}
