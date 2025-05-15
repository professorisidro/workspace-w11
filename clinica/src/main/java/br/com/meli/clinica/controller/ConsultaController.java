package br.com.meli.clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.clinica.model.Consulta;
import br.com.meli.clinica.model.Medico;
import br.com.meli.clinica.service.IConsultaService;

@RestController
public class ConsultaController {
	
	@Autowired
	private IConsultaService service;
	
	@PostMapping("/consultas")
	public ResponseEntity<Consulta> addNew(@RequestBody Consulta consulta){
		return ResponseEntity.status(201).body(service.addNew(consulta));
	}
	
	@GetMapping("/consultas")
	public ResponseEntity<List<Consulta>> getAll(){
		return ResponseEntity.ok(service.getAll());
	}

	@GetMapping("/consultas/{id}")
	public ResponseEntity<Consulta> getById(@PathVariable Integer id){
		return ResponseEntity.ok(service.getByProtocolo(id));
	}

}
