
public class CarroBuilder {
	private Carro carro;
	
	public CarroBuilder() {
		carro = new Carro();
	}
	
	public CarroBuilder definirMotor(Motor motor) {
		carro.setMotor(motor);
		return this;
	}
	
	public CarroBuilder definirCor(Cor cor) {
		carro.setCor(cor);
		return this;
	}
	
	public CarroBuilder adicionarItemOpcional(Opcional item) {
		carro.getItens().add(item);
		return this;
	}
	
	public Carro build() {
		Carro res = this.carro;
		this.carro = new Carro();
		return res;
	}
}
