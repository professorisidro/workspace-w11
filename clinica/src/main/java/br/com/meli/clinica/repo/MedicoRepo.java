package br.com.meli.clinica.repo;

import org.springframework.data.repository.ListCrudRepository;

import br.com.meli.clinica.model.Medico;

public interface MedicoRepo extends ListCrudRepository<Medico, Integer>{

}
