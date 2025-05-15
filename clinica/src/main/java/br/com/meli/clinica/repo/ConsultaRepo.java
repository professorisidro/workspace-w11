package br.com.meli.clinica.repo;

import org.springframework.data.repository.ListCrudRepository;

import br.com.meli.clinica.model.Consulta;

public interface ConsultaRepo extends ListCrudRepository<Consulta, Integer>{

}
