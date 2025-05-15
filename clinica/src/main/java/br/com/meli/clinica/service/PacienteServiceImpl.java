package br.com.meli.clinica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meli.clinica.model.Paciente;
import br.com.meli.clinica.repo.PacienteRepo;

@Service
public class PacienteServiceImpl implements IPacienteService{
	@Autowired
	private PacienteRepo repo;

	@Override
	public Paciente addNew(Paciente paciente) {
		// TODO Auto-generated method stub
		return repo.save(paciente);
	}

	@Override
	public Paciente getById(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow(() -> new RuntimeException("Paciente não encontrado"));
	}

	@Override
	public List<Paciente> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	

}
