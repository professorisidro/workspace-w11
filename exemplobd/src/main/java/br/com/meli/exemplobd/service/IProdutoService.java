package br.com.meli.exemplobd.service;

import java.util.List;

import br.com.meli.exemplobd.dto.ProdutoReq;
import br.com.meli.exemplobd.model.Produto;

public interface IProdutoService {
	public Produto addNew(ProdutoReq p);
	public Produto update(Produto p);
	public List<Produto> readAll();
	public Produto readById(Integer id);
	public void deleteById(Integer id);
}
