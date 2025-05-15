package br.com.meli.clinica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meli.clinica.model.Consulta;
import br.com.meli.clinica.repo.ConsultaRepo;

@Service
public class ConsultaServiceImpl implements IConsultaService{
	@Autowired
	private ConsultaRepo repo;

	@Override
	public Consulta addNew(Consulta consulta) {
		// TODO Auto-generated method stub
		return repo.save(consulta);
	}

	@Override
	public Consulta getByProtocolo(Integer protocolo) {
		// TODO Auto-generated method stub
		return repo.findById(protocolo).orElseThrow(()->new RuntimeException("Consulta nao existente"));
	}

	@Override
	public List<Consulta> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
