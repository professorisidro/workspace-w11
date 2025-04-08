package br.com.meli.codigomorse.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.codigomorse.dto.RequestDTO;
import br.com.meli.codigomorse.dto.ResponseDTO;
import br.com.meli.codigomorse.service.ConversorMorse;

@RestController
public class Morsecontroller {

	
	@PostMapping("/convert")
	public ResponseDTO converterMorse(@RequestBody RequestDTO dto) {
		return ConversorMorse.converter(dto);
			
	}

}
