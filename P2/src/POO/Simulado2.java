package POO;

public class Simulado2 {

	public static void main(String[] args) {
		
		Funcionario f1 = 
				new Funcionario("Bruno", 0, "professor");
		Funcionario f2 = 
				new Funcionario("Pedro", 0, "pintor");

		System.out.println(Funcionario.qtdFunc);
	}
}
