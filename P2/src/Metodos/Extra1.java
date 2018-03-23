package Metodos;

import Util.Util;

public class Extra1 {
	public static void main(String[] args) {
		final int tam = 10, min = 1, max = 10;
		int[] vetor = new int[tam];
		
		// Preenche o vetor com aleatórios
		Util.getVetorIntAleatorio(vetor, min, max);

		System.out.print("Vetor original: \n");
		Util.imprimeVetorInt(vetor);

		// Procedimento para zerar os ímpares
		Util.zeraImpares(vetor);

		System.out.print("\nVetor Alterado: \n");
		Util.imprimeVetorInt(vetor);
	}

}
