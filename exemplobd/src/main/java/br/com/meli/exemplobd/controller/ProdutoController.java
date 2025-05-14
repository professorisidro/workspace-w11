package br.com.meli.exemplobd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.exemplobd.dto.ProdutoReq;
import br.com.meli.exemplobd.model.Produto;
import br.com.meli.exemplobd.service.IProdutoService;

@RestController
public class ProdutoController {

	@Autowired
	private IProdutoService service;
	
	@GetMapping("/produtos")
	public ResponseEntity<List<Produto>> readAll(){
		return ResponseEntity.ok(service.readAll());
	}
	
	@GetMapping("/produtos/{id}")
	public ResponseEntity<Produto> readById(@PathVariable Integer id){
		Produto res = service.readById(id);
		res.setNome(res.getNome().toUpperCase());
		return ResponseEntity.ok(res);
	}
	@PostMapping("/produtos")
	public ResponseEntity<Produto> addNew(@RequestBody ProdutoReq p){
		Produto res = service.addNew(p);
		res.setNome(res.getNome().toUpperCase());
		return ResponseEntity.status(201).body(res);
	}
	@PutMapping("/produtos/{id}")
	public ResponseEntity<Produto> update(@PathVariable Integer id, @RequestBody Produto p){
		p.setId(id);
		return ResponseEntity.ok(service.update(p));
	}
	
	@DeleteMapping("/produtos/{id}")
	public ResponseEntity<?> deleteProduct(@PathVariable Integer id){
		service.deleteById(id);
		return ResponseEntity.status(200).body("");
	}

}
