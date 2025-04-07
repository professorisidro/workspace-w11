
public class MainClass {
	public static void main(String[] args) {
		CarroBuilder builder = new CarroBuilder();
		
		Carro corsinha = builder.definirMotor(new Motor("combustao","flex", "1.0"))
					            .definirCor(new Cor("Bordô com detalhes em branco no capo"))
					            .build();
		
		Carro porxe = builder.definirMotor(new Motor("Hibrido CTV", "gasolina/eletrico", "2.6vTurbo"))
					         .definirCor(new Cor("Chumbo bandidona com os vidro fumê"))
					         .adicionarItemOpcional(new Opcional("vidro eletrico"))
					         .adicionarItemOpcional(new Opcional("multimidia que serve cafe"))
					         .build();
		
		System.out.println(corsinha);
		System.out.println(porxe);
	}  
}	
