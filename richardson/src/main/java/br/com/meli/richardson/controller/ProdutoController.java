package br.com.meli.richardson.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.richardson.dto.ErroDTO;
import br.com.meli.richardson.model.Produto;

@RestController
public class ProdutoController {
	
	private HashMap<Integer, Produto> produtos;
	
	public ProdutoController() {
		produtos = new HashMap<>() {{
			put(1, new Produto(1, "computador", 1500.0));
			put(2, new Produto(2, "teclado", 150.0));
			put(3, new Produto(3, "mouse", 50.0));
			put(4, new Produto(4, "monitor", 500.0));
			put(5, new Produto(5, "impressora", 600.0));
			
		}};
	}
	
	@GetMapping("/produtos")
	public ResponseEntity<List<Produto>> recuperarTodos(){
		return ResponseEntity.ok(produtos.values().stream().toList());
	}
	
	@GetMapping("/produtos/{id}")
	public ResponseEntity<?> recuperarPeloId(@PathVariable Integer id){
		Produto p = produtos.get(id);
		if (p != null) {
			return ResponseEntity.ok(p);
		}
		return ResponseEntity.status(404).body(new ErroDTO("Produto de id "+id+" nao existe na base"));
	}
	
	@PostMapping("/produtos")
	public ResponseEntity<?> addNew(@RequestBody Produto p){
		if (produtos.get(p.getId())!= null) {
			return ResponseEntity.status(409).body(new ErroDTO("Produto de id "+p.getId()+" ja cadastrado na base"));
		}
		if (p.getNome() == null || p.getNome().isBlank() || p.getPreco() <= 0) {
			return ResponseEntity.status(400).body(new ErroDTO("Produto com dados inválidos"));
		}
		produtos.put(p.getId(), p);
		return ResponseEntity.status(201).body(p);
	}
}
