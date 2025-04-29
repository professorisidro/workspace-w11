package br.com.meli.testemock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meli.testemock.dto.ClienteRequestDTO;
import br.com.meli.testemock.dto.ClienteResponseDTO;
import br.com.meli.testemock.exceptions.ClienteConflictException;
import br.com.meli.testemock.model.Cliente;
import br.com.meli.testemock.repo.IClienteRepo;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteRepo repo;
	
	@Override
	public ClienteResponseDTO addNewCliente(ClienteRequestDTO dto) {
		// TODO Auto-generated method stub
		Cliente c = fromDtoToCliente(dto);
		
		if (repo.findByEmailOrTelefone(c.getEmail(), c.getTelefone()) != null) {
			throw new ClienteConflictException("Cliente já existe" );
		}
		Cliente res = repo.save(c);
		ClienteResponseDTO resp = fromClienteToDTO(res);
		return resp;
	}
	
	private Cliente fromDtoToCliente(ClienteRequestDTO dto) {
		Cliente c = new Cliente();
		c.setEmail(dto.email());
		c.setNome(dto.nome());
		c.setTelefone(dto.telefone());
		return c;
	}
	
	private ClienteResponseDTO fromClienteToDTO(Cliente c) {
		return new ClienteResponseDTO(c.getId(), c.getNome(), c.getEmail(), c.getTelefone());
	}

}
