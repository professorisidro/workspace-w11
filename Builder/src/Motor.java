
public class Motor {
	private String tipo;
	private String combustivel;
	private String cc;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public Motor(String tipo, String combustivel, String cc) {
		super();
		this.tipo = tipo;
		this.combustivel = combustivel;
		this.cc = cc;
	}
	@Override
	public String toString() {
		return "Motor [tipo=" + tipo + ", combustivel=" + combustivel + ", cc=" + cc + "]";
	}
	
}
