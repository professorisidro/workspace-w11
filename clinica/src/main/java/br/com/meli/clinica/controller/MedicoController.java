package br.com.meli.clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.clinica.model.Medico;
import br.com.meli.clinica.service.IMedicoService;

@RestController
public class MedicoController {
	@Autowired
	private IMedicoService service;
	
	@PostMapping("/medicos")
	public ResponseEntity<Medico> addNew(@RequestBody Medico medico){
		return ResponseEntity.status(201).body(service.addNew(medico));
	}
	
	@GetMapping("/medicos")
	public ResponseEntity<List<Medico>> getAll(){
		return ResponseEntity.ok(service.getAll());
	}

	@GetMapping("/medicos/{id}")
	public ResponseEntity<Medico> getById(@PathVariable Integer id){
		return ResponseEntity.ok(service.getById(id));
	}
}
