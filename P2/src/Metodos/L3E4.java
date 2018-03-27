package Metodos;

import Util.Util;

public class L3E4 {
	public static void main(String[] args) {
		final int tam = 100, minRand = 1, maxRand = 20;

		int[] vet1 = new int[tam];
		int[] vet2 = new int[tam];

		int primosVet1, primosVet2;

		Util.getVetorIntAleatorio(vet1, minRand, maxRand);
		Util.getVetorIntAleatorio(vet2, minRand, maxRand);

		// Contagem de primos
		primosVet1 = Util.getNumPrimos(vet1);
		primosVet2 = Util.getNumPrimos(vet2);
		
		// Imprime os vetores e as contagens
		Util.imprimeVetorInt(vet1);
		System.out.println(primosVet1 + " n�meros primos");
		Util.imprimeVetorInt(vet2);
		System.out.println(primosVet2 + " n�meros primos");

		// Imprime quem tem mais primos
		if (primosVet1 > primosVet2) {
			System.out.println("Vetor 1 possui mais n�meros primos");
		} else if (primosVet2 > primosVet1) {
			System.out.println("Vetor 2 possui mais n�meros primos");
		} else {
			System.out.println("Ambos possuem a mesma quantidade de primos");
		}
		
		// Ordena os vetores
		Util.doSelectionSort(vet1);
		Util.doSelectionSort(vet2);
		
		// Imprime novamente
		Util.imprimeVetorInt(vet1);
		Util.imprimeVetorInt(vet2);

	}

}
