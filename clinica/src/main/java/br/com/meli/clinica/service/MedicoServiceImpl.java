package br.com.meli.clinica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meli.clinica.model.Medico;
import br.com.meli.clinica.repo.MedicoRepo;

@Service
public class MedicoServiceImpl implements IMedicoService{

	@Autowired
	private MedicoRepo repo;
	
	@Override
	public Medico addNew(Medico medico) {
		// TODO Auto-generated method stub
		return repo.save(medico);
	}

	@Override
	public Medico getById(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow(() -> new RuntimeException("Medico nao econtrado"));
	}

	@Override
	public List<Medico> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
