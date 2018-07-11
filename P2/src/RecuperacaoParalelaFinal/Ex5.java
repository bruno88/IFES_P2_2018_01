package RecuperacaoParalelaFinal;

import Util.Util;

public class Ex5 {
	public static void main(String[] args) {
		final int min = 1, max = 20, tam = 10;
		int[] vetor = new int[tam];
		Util.getVetorIntAleatorio(vetor, min, max);

		Util.imprimeVetorInt(vetor);

		int result = somaVet(vetor, 0);
		System.out.println("Soma: " + result);
		result *= vetor[vetor.length - 1];

		System.out.println("Resultado: " + result);

	}

	private static int somaVet(int[] vetor, int i) {
		if (i == vetor.length - 1) {
			return 0;
		} else {
			return vetor[i] + somaVet(vetor, (i + 1));
		}

	}
}
