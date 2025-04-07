package main;

import java.util.List;

import model.Roupa;
import service.GuardaRoupa;

public class MainClass {
	public static void main(String[] args) {
		GuardaRoupa guardaRoupa = new GuardaRoupa();
		
		Integer gaveta1, gaveta2, gaveta3;
		
		gaveta1 = guardaRoupa.guardarRoupas(List.of(new Roupa("Zara","calça djins"), new Roupa("CIA", "camiseta do bátima")));
		gaveta2 = guardaRoupa.guardarRoupas(List.of(new Roupa("Guti", "brusinha")));
		gaveta3 = guardaRoupa.guardarRoupas(List.of(new Roupa("Rener","camiseta do mario"), new Roupa("Lupo", "meia do bob sponja"), new Roupa("zorba", "cueca da patrulha canina")));
		
		guardaRoupa.mostrarRoupas();
		
		List<Roupa> gavetaDevolucao = guardaRoupa.devolverRoupas(2);
		
		System.out.println("Devolvido: "+gavetaDevolucao);
		
		guardaRoupa.mostrarRoupas();
		
	}
}
