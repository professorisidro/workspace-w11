package br.com.meli.exemplobd.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class InteresseID {
	@ManyToOne
	@JoinColumn(name = "tbl_cliente_id_cliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "tbl_produto_id_produto")
	private Produto produto;
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}
