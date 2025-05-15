package br.com.meli.clinica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meli.clinica.documents.Prontuario;
import br.com.meli.clinica.repo.ProntuarioRepo;

@Service
public class ProntuarioServiceImpl implements IProntuarioService{
	
	@Autowired
	private ProntuarioRepo repo;

	@Override
	public Prontuario addNew(Prontuario prontuario) {
		// TODO Auto-generated method stub
		return repo.save(prontuario);
	}

	@Override
	public Prontuario getByProtocolo(Integer protocolo) {
		// TODO Auto-generated method stub
		return repo.findById(protocolo).orElseThrow(()->new RuntimeException("Prontuario nao encontrado"));
	}

	@Override
	public List<Prontuario> getByQueixa(String queixa) {
		// TODO Auto-generated method stub
		return null;
	}

}
