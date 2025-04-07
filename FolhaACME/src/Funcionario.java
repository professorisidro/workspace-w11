
public abstract class Funcionario {
	private Integer numeroFuncionario;
	private String nome;
	public Funcionario(Integer numeroFuncionario, String nome) {
		super();
		this.numeroFuncionario = numeroFuncionario;
		this.nome = nome;
	}
	
	public abstract float calcularSalario();
	
	public Integer getNumeroFuncionario() {
		return numeroFuncionario;
	}
	public void setNumeroFuncionario(Integer numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	@Override
	public String toString() {
		return String.format("%5d - %-20s - %-15s  R$ %.2f", numeroFuncionario, nome, this.getClass().getName(), calcularSalario());
			
	}

}
