package br.com.meli.exemplobd.repo;

import org.springframework.data.repository.ListCrudRepository;

import br.com.meli.exemplobd.model.Produto;

public interface IProdutoRepo extends ListCrudRepository<Produto, Integer>{

}
