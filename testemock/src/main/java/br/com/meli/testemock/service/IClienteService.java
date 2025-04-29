package br.com.meli.testemock.service;

import br.com.meli.testemock.dto.ClienteRequestDTO;
import br.com.meli.testemock.dto.ClienteResponseDTO;

public interface IClienteService {
	public ClienteResponseDTO addNewCliente(ClienteRequestDTO dto);
}
