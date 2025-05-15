package br.com.meli.clinica.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_paciente")
public class Paciente {
	
	@Id
	@Column(name = "id_paciente")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name ="cpf", unique = true)
	private String cpf;
	@Column(name = "nome", nullable = false)
	private String nome;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
