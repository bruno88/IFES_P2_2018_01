package RecuperacaoParalela1aProva;

import Util.Util;

public class Ex2 {
	public static void main(String[] args) {
		final int tam = 10, min = 1, max = 10;
		
		int[] vet1 = new int[tam];
		int[] vet2 = new int[tam];
		int[] vetSoma = new int[tam];

		try {
			// Preenche os 2 vetores com aleatórios no intervalo
			Util.getVetorIntAleatorio(vet1, min, max);
			Util.getVetorIntAleatorio(vet2, min, max);

			// Imprime vetor
			Util.imprimeVetorInt(vet1);
			Util.imprimeVetorInt(vet2);

			// Cria o vetor de Somas e atribui ao vetSoma do main
			vetSoma = Util.somaVetores(vet1, vet2);

			// Imprime vetor
			Util.imprimeVetorInt(vetSoma);
		} catch (Exception e) {
			System.out.println("Erro no processamento: \n" + e);
		}
	}
}
