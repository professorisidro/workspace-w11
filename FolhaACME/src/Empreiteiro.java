
public class Empreiteiro extends Funcionario {
	

	private float valorEmpreita;
	
	public Empreiteiro(Integer numeroFuncionario, String nome, float valorEmpreita) {
		super(numeroFuncionario, nome);
		this.valorEmpreita = valorEmpreita;
	}

	@Override
	public float calcularSalario() {
		// TODO Auto-generated method stub
		return valorEmpreita;
	}
	
	

}
