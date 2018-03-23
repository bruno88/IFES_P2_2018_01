package Metodos;

import Util.Util;

public class Extra3 {
	// Controla a quantidade de termos em "indicesPrimos"
	public static int qtd = 0; 
	
	public static void main(String[] args) {
		final int tam = 10, minRand = 1, maxRand = 20;
		int[] vetor = new int[tam];
		int[] indicesPrimos;
		
		Util.getVetorIntAleatorio(vetor, minRand,
							maxRand);
		Util.imprimeVetorInt(vetor);
		
		// Obtém os primos
		//indicesPrimos = Util.getIndexOfAllNumerosPrimo
		//		(vetor);

		indicesPrimos = Util.getNumerosPrimo(vetor);
		// Apenas imprime a quantidade de termos repetidos
		Util.imprimeVetorInt(indicesPrimos, qtd);
	}

}
