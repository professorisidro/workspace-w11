
public class MainClass {
	public static void main(String[] args) {
		Funcionario folha[] = new Funcionario[7];
		folha[0] = new Chefe(1230, "Isidro", 5000F, 15.0F, 500.0F);
		folha[1] = new Comissionado(1231, "Josefina", 3000.0f, 20);
		folha[2] = new Comissionado(1232, "Clara", 3000f, 20);
		folha[3] = new Horista(1233, "Januario", 70, 45 );
		folha[4] = new Horista(1234, "Deosdedite", 70, 50);
		folha[5] = new Empreiteiro(1235, "Pedro", 3580.0f);
		folha[6] = new Empreiteiro(1236, "Adalberto", 4123.55f);
		
		
		for (Funcionario f: folha) {
			System.out.println(f);
		}
		
	}
}
