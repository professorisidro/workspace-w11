package br.com.meli.exemplobd.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_interesse")
public class Interesse {
	
	@EmbeddedId
	private InteresseID id;
	
	@Column(name = "data_hora")
	private LocalDateTime dataHora;

	public InteresseID getId() {
		return id;
	}

	public void setId(InteresseID id) {
		this.id = id;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}


}
