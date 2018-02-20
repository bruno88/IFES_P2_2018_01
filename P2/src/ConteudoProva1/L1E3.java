package ConteudoProva1;
public class L1E3 {
	public static void main(String[] args) {
		final int tam = 5, minRand = 1, maxRand = 100;
		double media;
		int[] vetor = new int[tam];

		// Popula o vetor com aleat�rios de 1 a 100
		for (int i = 0; i < tam; i++) {
			vetor[i] = Utils.geraIntAleatorio(
					minRand, maxRand);
		}

		// Imprime vetor
		Utils.imprimeVetorInt(vetor);
		
		// Calculo da m�dia
		media = Utils.calculaMediaArit(vetor);
		System.out.println("A m�dia � : " + media);

	}

}
