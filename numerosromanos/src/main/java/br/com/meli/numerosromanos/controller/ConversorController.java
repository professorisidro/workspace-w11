package br.com.meli.numerosromanos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.numerosromanos.dto.RequestDTO;
import br.com.meli.numerosromanos.dto.ResponseDTO;
import br.com.meli.numerosromanos.service.ConversorService;
import jakarta.validation.Valid;

@RestController
public class ConversorController {
	
	@Autowired
	private ConversorService service;
	
	
	@PostMapping("/convert")
	public ResponseEntity<ResponseDTO> converter(@RequestBody @Valid RequestDTO request){
		return ResponseEntity.ok(new ResponseDTO(service.converterParaRomanos(request.number())));
	}

}
