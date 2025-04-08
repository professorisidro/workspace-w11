package br.com.meli.objetos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.objetos.model.Cliente;
import br.com.meli.objetos.model.Produto;

@RestController
public class ProdutoController {
	
	@GetMapping("/produtos")
	public Produto exibirProduto() {
		Produto p = new Produto();
		p.setId(12345);
		p.setDescricao("Computador que acende luzinha");
		p.setPreco(2000.0);
		p.setQtdEstoque(3);
		return p;
	}
	
	@GetMapping("/produtos/{id}")
	public Produto exibirProdutoEspecifico(@PathVariable Integer id) {
		Produto p = new Produto();
		p.setId(id);
		p.setDescricao("Produto especifico");
		p.setPreco(100.0);
		p.setQtdEstoque(10);
		return p;
	}
	
	@GetMapping("/clientes")
	public Cliente exibirCliente() {
		return new Cliente(1,"Isidro","isidro@isidro.com", "11987654321");
	}
	
	@PostMapping("/produtos")
	public String cadastrarProduto(@RequestBody Produto novo) {
		System.out.println("Recebi.."+novo.getId()+" - "+novo.getDescricao()+ "-"+novo.getPreco());
		return "Ok";
	}
}
