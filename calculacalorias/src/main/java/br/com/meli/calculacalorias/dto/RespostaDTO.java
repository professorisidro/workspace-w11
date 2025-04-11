package br.com.meli.calculacalorias.dto;

import java.util.List;

import br.com.meli.calculacalorias.model.Ingrediente;

public record RespostaDTO(Integer totalCalorias, List<Ingrediente> lista, Ingrediente maisCalorico) {

}
