package br.com.meli.clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.clinica.model.Paciente;
import br.com.meli.clinica.service.IPacienteService;

@RestController
public class PacienteController {
	
	@Autowired
	private IPacienteService service;	

	@PostMapping("/pacientes")
	public ResponseEntity<Paciente> addNew(@RequestBody Paciente paciente){
		return ResponseEntity.status(201).body(service.addNew(paciente));
	}
	
	@GetMapping("/pacientes")
	public ResponseEntity<List<Paciente>> getAll(){
		return ResponseEntity.ok(service.getAll());
	}
	
	@GetMapping("/pacientes/{id}")
	public ResponseEntity<Paciente> getById(@PathVariable Integer id){
		return ResponseEntity.ok(service.getById(id));
	}
}
