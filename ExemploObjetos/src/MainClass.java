
public class MainClass {
	public static void main(String[] args) {
		Produto p1 = new Produto(1,"Computador",1500.0);
		Produto p2 = p1;
		
		
		System.out.println(p1.getId()+"-"+p1.getNome()+"-"+p1.getPreco());
		
		p2.setPreco(2000.0);
		
		System.out.println(p1.getId()+"-"+p1.getNome()+"-"+p1.getPreco());
		
		String s1, s2;
		s1 = "Oi, quer tc?";
		s2 = "Oi, quer tc?";
		
		s1 = "xablau";
		
		
		System.out.println(s1 + " / "+ s2);
		if (s1 == s2) {
			System.out.println("Iguais");
		}
		else {
			System.out.println("Diferentes");
		}
				
		
	}
}
