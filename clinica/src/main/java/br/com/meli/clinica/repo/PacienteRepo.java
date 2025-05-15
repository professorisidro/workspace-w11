package br.com.meli.clinica.repo;

import org.springframework.data.repository.ListCrudRepository;

import br.com.meli.clinica.model.Paciente;

public interface PacienteRepo extends ListCrudRepository<Paciente, Integer>{

}
