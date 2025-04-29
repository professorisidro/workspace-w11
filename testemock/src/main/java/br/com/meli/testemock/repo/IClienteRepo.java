package br.com.meli.testemock.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.meli.testemock.model.Cliente;

public interface IClienteRepo extends JpaRepository<Cliente, Integer>{
	
	public Cliente findByEmailOrTelefone(String email, String telefone);

}
