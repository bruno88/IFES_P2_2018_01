package ConteudoProva1;

public class ExemploIO1 {

	public static void main(String[] args) {
		final int tam = 10, minRand = 1, maxRand = 10;
		int[] vetor = new int[tam];
		String result = "";

		// Populando um vetor com aleatórios
		for (int i = 0; i < tam; i++) {
			vetor[i] = (int) (Math.random() * maxRand + minRand);
		}
		
		// Imprimindo o vetor com o System.out.println()
		for (int i = 0; i < vetor.length; i++) {
			result += vetor[i] + " ";
		}
		
		System.out.println(result);
		
	}

}
