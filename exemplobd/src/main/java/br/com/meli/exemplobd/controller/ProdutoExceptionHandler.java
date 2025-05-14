package br.com.meli.exemplobd.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.meli.exemplobd.dto.ErroDTO;
import br.com.meli.exemplobd.exceptions.NotFoundException;

@ControllerAdvice
public class ProdutoExceptionHandler {

	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<ErroDTO> handleNotFoun(NotFoundException ex){
		return ResponseEntity.status(404).body(new ErroDTO(ex.getMessage()));
	}
}
