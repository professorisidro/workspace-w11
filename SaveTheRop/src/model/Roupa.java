package model;

public class Roupa {
	private String marca;
	private String modelo;
	public Roupa(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
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
	@Override
	public String toString() {
		return "Roupa [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	
}
