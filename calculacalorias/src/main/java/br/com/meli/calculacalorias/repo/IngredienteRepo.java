package br.com.meli.calculacalorias.repo;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.meli.calculacalorias.model.Ingrediente;

@Repository
public class IngredienteRepo {

	private ArrayList<Ingrediente> database;

	public IngredienteRepo() {
		try {
			
			database = new ArrayList<>();
			ObjectMapper mapper = new ObjectMapper();
			File f = ResourceUtils.getFile("classpath:food.json");
			database = (ArrayList<Ingrediente>)mapper.readValue(f, new TypeReference<List<Ingrediente>>() {});
			System.out.println("Inicializando repo..."+database.size());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public List<Ingrediente> findAll(){
		return database;
	}

}
