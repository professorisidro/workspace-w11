import java.util.ArrayList;
import java.util.List;

public class Garagem {

	private List<Veiculo> veiculos;
	
	public Garagem() {
		veiculos = new ArrayList<Veiculo>();
		veiculos.add(new Veiculo("Audi","Q3", 220.0, 450000.0, 2025));
		veiculos.add(new Veiculo("Audi","A3", 200.0, 150000.0, 2023));
		veiculos.add(new Veiculo("Ford","Fiesta", 170.0, 85000.0, 2025));
		veiculos.add(new Veiculo("Ford","Ranger", 150.0, 200000.0, 2025));
		veiculos.add(new Veiculo("Volkswagen","Gol", 180.0, 75000.0, 2025));
		veiculos.add(new Veiculo("Volkswagen","Parati", 140.0, 45000.0, 2010));
		veiculos.add(new Veiculo("BMW","X1", 190.0, 145000.0, 2023));
		veiculos.add(new Veiculo("BMW","M3", 250.0, 650000.0, 2025));
		veiculos.add(new Veiculo("Fiat","Toro", 165.0, 90000.0, 2022));
		veiculos.add(new Veiculo("Fiat","Uninho da firma", 270.0, 45000.0, 2026));
	}
	
	public List<Veiculo> getVeiculos(){
		return this.veiculos;
	}
}
