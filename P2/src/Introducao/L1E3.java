package Introducao;

import Util.Util;

public class L1E3 {
	public static void main(String[] args) {
		final int tam = 5, minRand = 1, maxRand = 100;
		double media;	
		int[] vetor = new int[tam];

		// Popula o vetor com aleatórios de 1 a 100
		for (int i = 0; i < tam; i++) {
			vetor[i] = Util.geraIntAleatorio(
					minRand, maxRand);
		}

		// Imprime vetor
		Util. imprimeVetorInt(vetor);
		
		// Calculo da média
		media = Util.calculaMediaArit(vetor);
		System.out.println("A média é : " + media);

	}

}
