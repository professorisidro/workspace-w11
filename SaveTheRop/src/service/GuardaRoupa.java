package service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Roupa;

public class GuardaRoupa {
	
	
	private Map<Integer, List<Roupa>> mapa;
	private Integer generatedId;
	
	public GuardaRoupa() {
		mapa = new HashMap<Integer, List<Roupa>>();
		generatedId = 1;
	}
	
	public Integer guardarRoupas(List<Roupa> lista) {
		Integer currentId = generatedId;
		mapa.put(generatedId, lista);
		generatedId++;
		return currentId;
	}
	
	public List<Roupa> devolverRoupas(Integer pos){
		List<Roupa> minhaLista = mapa.remove(pos);
		return minhaLista;
	}
	
	public void mostrarRoupas() {
		for (Integer id: mapa.keySet()) {
			System.out.println("ID do Armario = "+id);
			System.out.println("Conteudo do Armario:");
			System.out.println(mapa.get(id));
			System.out.println("----------------------------");
		}
		
	}

}
