import java.util.ArrayList;
import java.util.List;

public class Carro {
	private Motor motor;
	private Cor   cor;
	private List<Opcional> itens;
	
	public Carro() {
		this.itens = new ArrayList<Opcional>();
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Cor getCor() {
		return cor;
	}
	public void setCor(Cor cor) {
		this.cor = cor;
	}
	public List<Opcional> getItens() {
		return itens;
	}
	public void setItens(List<Opcional> itens) {
		this.itens = itens;
	}
	@Override
	public String toString() {
		return "Carro [motor=" + motor + ", cor=" + cor + ", itens=" + itens + "]";
	}
	
	
}
