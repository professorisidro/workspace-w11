package br.com.meli.testemock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.testemock.dto.ClienteRequestDTO;
import br.com.meli.testemock.dto.ClienteResponseDTO;
import br.com.meli.testemock.service.IClienteService;

@RestController
public class ClienteController {
	
	@Autowired
	private IClienteService service;
	
	@PostMapping("/clientes")
	public ResponseEntity<ClienteResponseDTO> addNewClient(@RequestBody ClienteRequestDTO dto){
		return ResponseEntity.status(201).body(service.addNewCliente(dto));
	}

}
