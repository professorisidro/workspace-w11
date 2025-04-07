
public class Veiculo {
	
	private String marca;
	private String modelo;
	private Double velMaxima;
	private Double preco;
	private Integer ano;
	
	public Veiculo(String marca, String modelo, Double velMaxima, Double preco, Integer ano) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.velMaxima = velMaxima;
		this.preco = preco;
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getVelMaxima() {
		return velMaxima;
	}

	public void setVelMaxima(Double velMaxima) {
		this.velMaxima = velMaxima;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "[marca=" + marca + ", modelo=" + modelo + ", velMaxima=" + velMaxima + ", preco=" + preco
				+ ", ano=" + ano + "]";
	}
	
}
