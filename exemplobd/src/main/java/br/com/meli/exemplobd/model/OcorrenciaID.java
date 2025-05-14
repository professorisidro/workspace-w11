package br.com.meli.exemplobd.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class OcorrenciaID {

	@Column(name = "tipo_ocorrencia")
	private Integer tipo;
	
	@Column(name = "data_hora")
	private LocalDateTime dataHora;
	
	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	
	

}
