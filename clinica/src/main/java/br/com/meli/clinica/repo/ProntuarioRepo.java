package br.com.meli.clinica.repo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import br.com.meli.clinica.documents.Prontuario;

public interface ProntuarioRepo extends ElasticsearchRepository<Prontuario, Integer>{

}
