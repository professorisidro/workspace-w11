package br.com.meli.testemock.unity;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.meli.testemock.dto.ClienteRequestDTO;
import br.com.meli.testemock.dto.ClienteResponseDTO;
import br.com.meli.testemock.exceptions.ClienteConflictException;
import br.com.meli.testemock.model.Cliente;
import br.com.meli.testemock.repo.IClienteRepo;
import br.com.meli.testemock.service.ClienteServiceImpl;

@SpringBootTest
public class ClienteServiceTest {
	
	@Mock
	private IClienteRepo repo;
	
	@InjectMocks
	private ClienteServiceImpl service;
	
	@Test
	@DisplayName("Vamos inserir bunitinho um cabra normal")
	public void shouldAcceptAddNewClient() {
		
		// AAA - Arrange, Act, Assert
		Cliente c = new Cliente();
		c.setNome("Cliente teste");
		c.setEmail("teste@valido.com");
		c.setTelefone("11987654321");
				
		Cliente res = new Cliente();
		res.setNome(c.getNome());
		res.setEmail(c.getEmail());
		res.setTelefone(c.getTelefone());
		res.setId(1);
		
		Mockito.when(repo.save(c)).thenReturn(res);
		
		ClienteRequestDTO req = new ClienteRequestDTO(c.getNome(), c.getEmail(), c.getTelefone());
		ClienteResponseDTO rep;
		
		rep = service.addNewCliente(req);
		assertNotNull(rep);	
	}
	
	@Test
	@DisplayName("Nao pode aceitar inserir um novo cliente com email existente")
	public void shouldNotAcceptExisitingEmail() {
		Cliente c = new Cliente();
		c.setEmail("duplicado@email.com");
	    c.setTelefone("11987654321");
	    c.setNome("Cliente duplicado");
	    
	    Mockito.when(repo.findByEmailOrTelefone(c.getEmail(), c.getTelefone())).thenReturn(c);
	    
	    ClienteRequestDTO req = new ClienteRequestDTO(c.getNome(), c.getEmail(), c.getTelefone());
	    
	    assertThrows(ClienteConflictException.class, () -> {
	    	service.addNewCliente(req);
	    });	    
	}

}
