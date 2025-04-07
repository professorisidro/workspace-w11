
public class Horista extends Funcionario{
	private float valorHora;
	private int   numeroHoras;
	
	public Horista(Integer numeroFuncionario, String nome, float valorHora, int numeroHoras) {
		super(numeroFuncionario, nome);
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}

	@Override
	public float calcularSalario() {
		// TODO Auto-generated method stub
		return valorHora * numeroHoras;
	}


}
