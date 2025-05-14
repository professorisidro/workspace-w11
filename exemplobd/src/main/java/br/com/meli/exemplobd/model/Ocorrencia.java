package br.com.meli.exemplobd.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_ocorrencia")
public class Ocorrencia {

	@EmbeddedId
	private OcorrenciaID id;
	
	@Column(name = "descricao")
	private String descricao;

	public OcorrenciaID getId() {
		return id;
	}

	public void setId(OcorrenciaID id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	

}
