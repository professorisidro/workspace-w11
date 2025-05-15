package br.com.meli.clinica.service;

import java.util.List;

import br.com.meli.clinica.model.Paciente;

public interface IPacienteService {
	public Paciente addNew(Paciente paciente);
	public Paciente getById(Integer id);
	public List<Paciente> getAll();

}
