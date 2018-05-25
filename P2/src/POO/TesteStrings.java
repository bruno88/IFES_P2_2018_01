package POO;

public class TesteStrings {

	public static void main(String[] args) {

		String nome = "Bruno";
		int idade = 29;
		String CPF = "MeuCPF";
		
		// Fazendo uso do método format
		// para adicionar variáveis na String
		String result = String.format(
				"Meu nome é : %s"
				+ "\nMinha idade é %d."
				+ "\nMeu CPF é %s", 
				nome,idade,CPF);
		System.out.printf(result);
		System.out.println("\n\n");
		
		// Montando a StringBuilder
		StringBuilder stringBuilder =
				new StringBuilder();
		
		// append coloca a String ao final do
		// StringBuilder
		stringBuilder.append(result);
		
		System.out.println(stringBuilder.toString());
		
		System.out.println("\n\n");
		
		stringBuilder.append("\nBLA BLA BLA");
		
		System.out.println(stringBuilder.toString());
		

	}

}
