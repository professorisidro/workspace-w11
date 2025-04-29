package br.com.meli.numerosromanos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.meli.numerosromanos.dto.ErrorDTO;
import br.com.meli.numerosromanos.exceptions.OutOfRangeException;

@ControllerAdvice
public class ConversorAdvice {
	
	@ExceptionHandler(exception = OutOfRangeException.class)
	public ResponseEntity<ErrorDTO> handleOutOfRange(OutOfRangeException ex){
		return ResponseEntity.status(400).body(new ErrorDTO(ex.getMessage()));
	}
	
	@ExceptionHandler(exception = MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorDTO> handleValidation(MethodArgumentNotValidException ex){
		StringBuilder str = new StringBuilder();
		for (ObjectError obj: ex.getAllErrors()) {
			str.append("Erro - "+obj.getDefaultMessage()+"\n");
		}
		return ResponseEntity.badRequest().body(new ErrorDTO(str.toString()));
	}

}
