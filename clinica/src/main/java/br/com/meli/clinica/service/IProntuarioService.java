package br.com.meli.clinica.service;

import java.util.List;

import br.com.meli.clinica.documents.Prontuario;

public interface IProntuarioService {
	public Prontuario addNew(Prontuario prontuario);
	public Prontuario getByProtocolo(Integer protocolo);
	public List<Prontuario> getByQueixa(String queixa);

}
