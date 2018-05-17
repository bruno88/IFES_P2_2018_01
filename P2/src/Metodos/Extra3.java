package Metodos;

import Util.Util;

public class Extra3 {	
	public static void main(String[] args) {
		final int tam = 10, tamQtdPrimos = 1, minRand = 1, maxRand = 20;
		
		int[] vetor = new int[tam];
		int[] indicesPrimos;
		int[] qtdPrimos = new int[tamQtdPrimos];
		
		Util.getVetorIntAleatorio(vetor, minRand,
							maxRand);
		Util.doSelectionSort(vetor);
		Util.imprimeVetorInt(vetor);
		
		// Obtém os primos
		//indicesPrimos = Util.getIndexOfAllNumerosPrimo
		//		(vetor, qtdPrimos);
		
		indicesPrimos = Util.getNumerosPrimo(vetor, qtdPrimos);
		// Apenas imprime a quantidade de termos repetidos
		Util.imprimeVetorInt(indicesPrimos, qtdPrimos[0]);
	}

}
