package br.com.meli.clinica.service;

import java.util.List;

import br.com.meli.clinica.model.Consulta;

public interface IConsultaService {
	public Consulta addNew(Consulta consulta);
	public Consulta getByProtocolo(Integer protocolo);
	public List<Consulta> getAll();
}
