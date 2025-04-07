
public record Cliente(Integer id, String nome, String email, String telefone) {

	public String toString() {
		return this.id() + " - " + nome() + " - "+email();
	}
	
	public static double calculaPI() {
		return 3.14;
	}	
}
