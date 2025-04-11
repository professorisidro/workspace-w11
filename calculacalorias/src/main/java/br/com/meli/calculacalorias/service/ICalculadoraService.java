package br.com.meli.calculacalorias.service;

import br.com.meli.calculacalorias.dto.PratoDTO;
import br.com.meli.calculacalorias.dto.RespostaDTO;

public interface ICalculadoraService {
	RespostaDTO recuperarIngredientes(PratoDTO prato);
}
