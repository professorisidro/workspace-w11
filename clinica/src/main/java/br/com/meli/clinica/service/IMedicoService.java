package br.com.meli.clinica.service;

import java.util.List;

import br.com.meli.clinica.model.Medico;

public interface IMedicoService {
	public Medico addNew(Medico medico);
	public Medico getById(Integer id);
	public List<Medico> getAll();
}
