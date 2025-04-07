
public class Banco {
	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaEspecial(1234,"Isidro",500);
		c1.creditar(1000);
		
		System.out.println(c1.getNumero()+" - "+c1.getTitular()+" R$"+c1.getSaldo());
		if (c1.debitar(1200)) {
			System.out.println("Debito efetuado com sucesso");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println(c1.getNumero()+" - "+c1.getTitular()+" R$"+c1.getSaldo());
	}
}
