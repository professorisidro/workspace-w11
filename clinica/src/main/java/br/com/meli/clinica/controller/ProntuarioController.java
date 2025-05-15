package br.com.meli.clinica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.clinica.documents.Prontuario;
import br.com.meli.clinica.service.IProntuarioService;

@RestController
public class ProntuarioController {

	@Autowired
	private IProntuarioService service;

	@PostMapping("/prontuarios")
	public ResponseEntity<Prontuario> addNew(@RequestBody Prontuario prontuario) {
		return ResponseEntity.status(201).body(service.addNew(prontuario));
	}
	
	@GetMapping("/prontuarios/{protocolo}")
	public ResponseEntity<Prontuario> getByProtocolo(@PathVariable Integer protocolo){
		return ResponseEntity.ok(service.getByProtocolo(protocolo));
	}

}
