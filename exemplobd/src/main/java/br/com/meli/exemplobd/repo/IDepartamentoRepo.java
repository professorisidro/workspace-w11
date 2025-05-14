package br.com.meli.exemplobd.repo;

import org.springframework.data.repository.ListCrudRepository;

import br.com.meli.exemplobd.model.Departamento;

public interface IDepartamentoRepo extends ListCrudRepository<Departamento, Integer> {

}
