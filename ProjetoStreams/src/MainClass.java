import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainClass {
	public static void main(String[] args) {
		Garagem g = new Garagem();
		
		// o que dá pra fazer com streams?
		
		// coisa 1 - iterar sobre seus elementos
//		g.getVeiculos().stream().forEach((v)-> {
//			System.out.println(v);
//		});
		
		// agora quero ordenar meus valores
		List<Veiculo> veiculosOrdenados = g.getVeiculos()
								           .stream()
								           .sorted(Comparator.comparing((Veiculo v)-> v.getPreco()).reversed())
								           .collect(Collectors.toList());
		
		//veiculosOrdenados.add(new Veiculo("teste","teste",100.0, 1000.0, 2020));
		System.out.println(veiculosOrdenados);
		
		// filtros
		List<Veiculo> extrairMarca = g.getVeiculos().stream()
													.filter(v -> v.getMarca().equals("Audi"))
													.toList();
		
		System.out.println(extrairMarca);
		
		
		Double precoMedio = g.getVeiculos().stream().mapToDouble(Veiculo::getPreco).average().orElse(0.0);
		System.out.println("Preco medio dos carros "+precoMedio);
		
		Integer veiculoMaisAntigo = g.getVeiculos().stream().mapToInt(Veiculo::getAno).min().orElse(0);
		System.out.println(veiculoMaisAntigo);
		
		
		
		g.getVeiculos().stream()
					   .filter(v->v.getMarca().equals("Audi") || v.getMarca().equals("BMW"))
					   .sorted(Comparator.comparing(Veiculo::getPreco))
					   .forEach(v -> System.out.println(v));
		
		
		
		List<String> frases = List.of("Ola Mundo","Java eh muito legal","O isidro fala pra um bone");
		List<String> palavras;
		
		palavras = frases.stream()
				         .map(frase -> frase.split(" "))
				         .flatMap(Arrays::stream)
				         .toList();
		
		System.out.println(palavras);
		
		
		Optional<Double> valor = Optional.ofNullable(null);
		
		System.out.println(valor.orElse(-1.0));
		
			
	}

}
