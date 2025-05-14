import java.util.HashMap;

public class MainClass {

	public static void main(String[] args) {
		
		int TAM=5000;
		int matriz[][] = new int[TAM][TAM];
		
		long ini,fim;
		ini = System.currentTimeMillis();
		for (int i=0;i<TAM;i++) {
			for (int j=0;j<TAM;j++) {
				matriz[j][i] = 0;
			}
		}
		fim = System.currentTimeMillis();
		
		System.out.println("Demorou "+(fim-ini)+"ms");
		
		/*int TAM = 100000;
		
		HashMap<Integer, Produto> mapa = new HashMap<>();
		for (int i=0;i<TAM; i++) {
			mapa.put(i+1, new Produto(i+1, "Produto "+i, 1.0+i));
		}
		
		long ini, fim;
		int IDASERBUSCADO = TAM-1;
		ini = System.currentTimeMillis();
		for (int count = 0; count < 1000; count++) {
			if (mapa.get(IDASERBUSCADO) != null) {
				// faca algo
			}
		}
		
		fim = System.currentTimeMillis();
		System.out.println("Demorou = "+(fim-ini)+"ms");
		
		*/
		/*
		ArrayList<Produto> lista = new ArrayList<>();
		// preenchendo a lista
		for (int i=0;i<TAM; i++) {
			lista.add(new Produto(i+1, "Produto "+i, 1.0+i));
		}
		
		long ini, fim;
		int IDASERBUSCADO = TAM-1;
		
		ini = System.currentTimeMillis();
		for (int count = 0; count < 1000; count++) {
			
			for (Produto p : lista) {
				if (p.getId() == IDASERBUSCADO) {
					break;
				}
			}
		}
		
		fim = System.currentTimeMillis();
		System.out.println("Demorou = "+(fim-ini)+"ms");
		*/
	}
}
