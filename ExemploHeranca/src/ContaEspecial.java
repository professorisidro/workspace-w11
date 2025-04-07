
public class ContaEspecial extends ContaBancaria {
	private double limite;
	
	
	public ContaEspecial(int numeroConta, String titular, double limite) {
		super(numeroConta, titular);
		this.limite = limite;
	}

	@Override
	public boolean debitar(double valor) {
		if (super.saldo + this.limite >= valor) {
			super.saldo -= valor;
			return true;			
		}
		return false;
	}

	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	
}
