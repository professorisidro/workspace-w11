package br.com.meli.clinica.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "idx_clinica")
public class Prontuario {
	
	@Id
	private Integer prontuario;
	private String  queixa;
	private String  diagnostico;
	private String  tratamento;
	private String  prescricao;
	public Integer getProntuario() {
		return prontuario;
	}
	public void setProntuario(Integer prontuario) {
		this.prontuario = prontuario;
	}
	public String getQueixa() {
		return queixa;
	}
	public void setQueixa(String queixa) {
		this.queixa = queixa;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getTratamento() {
		return tratamento;
	}
	public void setTratamento(String tratamento) {
		this.tratamento = tratamento;
	}
	public String getPrescricao() {
		return prescricao;
	}
	public void setPrescricao(String prescricao) {
		this.prescricao = prescricao;
	}
	
	

}
