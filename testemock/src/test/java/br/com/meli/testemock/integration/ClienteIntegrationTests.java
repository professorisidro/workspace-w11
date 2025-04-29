package br.com.meli.testemock.integration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.meli.testemock.dto.ClienteRequestDTO;
import br.com.meli.testemock.model.Cliente;
import br.com.meli.testemock.repo.IClienteRepo;

@SpringBootTest
@AutoConfigureMockMvc
public class ClienteIntegrationTests {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private IClienteRepo repo;
	
	@Test
	public void shouldAddNewClienteAndReturnStatus201() throws Exception{
		ClienteRequestDTO c = new ClienteRequestDTO("Isidro","isidro@isidro.com","11987654321");
		
		ObjectMapper mapper = new ObjectMapper();
		
		  MvcResult result = mockMvc.perform(MockMvcRequestBuilders.post("/clientes") 
				                              .contentType(MediaType.APPLICATION_JSON)
				                              .content(mapper.writeValueAsBytes(c)))
				  					.andExpect(MockMvcResultMatchers.status().is(201))
				  					.andReturn();
		  String str = result.getResponse().getContentAsString();
		  
		  Cliente resp = (Cliente)mapper.readValue(str, Cliente.class);
		  repo.deleteById(resp.getId());
		//       .andExpect(MockMvcResultMatchers.status().is(201));
			   
				                              
	}

}
