package br.com.meli.calculacalorias.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.calculacalorias.dto.PratoDTO;
import br.com.meli.calculacalorias.dto.RespostaDTO;
import br.com.meli.calculacalorias.service.ICalculadoraService;

@RestController
public class PratoController {

	private ICalculadoraService service;
	
	public PratoController(ICalculadoraService service) {
		this.service = service;
	}
	
	@PostMapping("/ingredientes")
	public ResponseEntity<RespostaDTO> recuperarIngredientes(@RequestBody PratoDTO dto){
		return ResponseEntity.ok(service.recuperarIngredientes(dto));
	}
	
}
