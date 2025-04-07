
public class Opcional {
	private String nome;

	public Opcional(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Opcional [nome=" + nome + "]";
	}
	
}	
