package Metodos;

import Util.Util;

public class L2E2 {
	public static void main(String[] args) {
		double mediaPond = 0;
		// Falar aqui sobre passagem de parametro
		final int tam = 5, minRandNum = 1, maxRandNum = 10,
				minRandPeso = 1, maxRandPeso = 3;
		int[] numeros = new int [tam];
		int[] pesos = new int [tam];
		
		// Populando vetores		
		// Passagem de parametro "por refer�ncia"
		Util.getVetorIntAleatorio(numeros, 
		 minRandNum, maxRandNum);
		Util.getVetorIntAleatorio(pesos, 
				minRandPeso, maxRandPeso);
		
		// Imprime o vetor
		Util.imprimeVetorInt(numeros);
		Util.imprimeVetorInt(pesos);
		
		// Calculo da m�dia ponderada dos vetores
		mediaPond = Util.getMediaPond(numeros, pesos);
		System.out.println("M�dia ponderada: " + 
						mediaPond);
	}

}
