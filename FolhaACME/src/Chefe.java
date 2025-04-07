
public class Chefe extends Funcionario {
	private float salarioBase;
	private float adicionalFuncao;
	private float beneficioTerno;
	
	public Chefe(Integer numeroFuncionario, String nome, float salarioBase, float adicionalFuncao,
			float beneficioTerno) {
		super(numeroFuncionario, nome);
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTerno = beneficioTerno;
	}

	@Override
	public float calcularSalario() {
		return this.salarioBase + this.salarioBase*this.adicionalFuncao/100 + this.beneficioTerno;
	}
	

}
