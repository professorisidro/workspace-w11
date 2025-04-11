package br.com.meli.calculacalorias.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meli.calculacalorias.dto.PratoDTO;
import br.com.meli.calculacalorias.dto.RespostaDTO;
import br.com.meli.calculacalorias.model.Ingrediente;
import br.com.meli.calculacalorias.repo.IngredienteRepo;

@Service
public class CalculadoraServiceImpl implements ICalculadoraService{

	@Autowired
	private IngredienteRepo repo;
	
	@Override
	public RespostaDTO recuperarIngredientes(PratoDTO prato) {
		// TODO Auto-generated method stub
		List<Ingrediente> listaFinal = new ArrayList<Ingrediente>();
		
		for (String item: prato.listaIngredientes()) {
			
			System.out.println("ingrediente do prato = "+item);
			listaFinal.add(repo.findAll().stream().filter(i->i.getName().equals(item)).findFirst().get());
		}
		
		System.out.println(listaFinal);
		int total = listaFinal.stream().mapToInt(Ingrediente::getCalories).sum();
		
		int maiorCaloria = listaFinal.stream().mapToInt(Ingrediente::getCalories).max().getAsInt();
		Ingrediente maisCalorico = listaFinal.stream().filter(i->i.getCalories()==maiorCaloria).findFirst().get();
		
		
		return new RespostaDTO(total, listaFinal, maisCalorico);
	}
}
