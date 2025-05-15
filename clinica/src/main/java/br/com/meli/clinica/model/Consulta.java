package br.com.meli.clinica.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_consulta")
public class Consulta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "protocolo_consulta")
	private Integer protocolo;
	
	@Column(name = "data_hora")
	private LocalDateTime dataHora;
	
	@ManyToOne
	@JoinColumn(name = "tbl_medico_id")
	private Medico medico;
	
	@ManyToOne
	@JoinColumn(name = "tbl_paciente_id")
	private Paciente paciente;

	public Integer getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(Integer protocolo) {
		this.protocolo = protocolo;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	

}
