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
		// Exemplo 1: Passagem de parametro por valor
		numeros = Util.getVetorIntAleatorio1(numeros, 
				minRandNum, maxRandNum);
		pesos = Util.getVetorIntAleatorio1(pesos, 
				minRandPeso, maxRandPeso);
		
		// Exemplo 2: Passagem de parametro "por referência"
		/*Util.getVetorIntAleatorio2(numeros, 
		 minRandNum, maxRandNum);
		Util.getVetorIntAleatorio2(pesos, 
				minRandPeso, maxRandPeso);*/
		
		// Imprime o vetor
		Util.imprimeVetorInt(numeros);
		Util.imprimeVetorInt(pesos);
		
		// Calculo da média ponderada dos vetores
		mediaPond = Util.getMediaPond(numeros, pesos);
		System.out.println("Média ponderada: " + 
						mediaPond);
	}

}
