package RecuperacaoParalela1aProva;

import Util.Util;

public class Ex3 {
	public static void main(String[] args) {
		final int tam = 10, min = 1, max = 10;
		int[] vet1 = new int[tam];

		try {
			// Preenche o vetor com aleatórios no intervalo
			Util.getVetorIntAleatorio(vet1, min, max);

			// Imprime vetor
			Util.imprimeVetorInt(vet1);
		} catch (Exception e) {
			System.out.println("Erro no processamento: \n" + e);
		}
	}
}
