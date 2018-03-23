package Metodos;

import java.util.Scanner;

import Util.Util;

public class L2E7 {
	public static int qtd = 0;
	
	public static void main(String[] args) {
		final int tamVetor = 100, tamSubConj = 3;
		//int[] conjunto = new int[tamVetor];
		// Para Testes: 
		int[] conjunto = { 8, 6, 5, 4, 7,
				6, 5, 4, 6, 9, 8, 2, 6, 5, 4};
		int[] subconjunto = new int[tamSubConj];
		int[] vetorDePosicoes = new int[tamVetor];
		Scanner entrada = new Scanner(System.in);

		// Popula o vetor (Tirar para testar com vetor fixo)
	//	Util.getVetorIntAleatorio2(conjunto, minRand, maxRand);

		// Imprime o vetor
		Util.imprimeVetorInt(conjunto);

		// Lê o subconjunto
		for (int i = 0; i < subconjunto.length; i++) {
			System.out.println("Digite o " + (i + 1) + " número");
			subconjunto[i] = entrada.nextInt();
		}
		entrada.close();

		// Imprime o subconjunto
		Util.imprimeVetorInt(subconjunto);
		
		// Verifica se o subconjunto está contido no conjunto		
		vetorDePosicoes = 
				Util.getAllIndexOfSubconjuntoNoConjunto(
						conjunto, subconjunto);
		
		if (L2E7.qtd > 0) {
			Util.imprimeVetorInt(vetorDePosicoes, qtd);	
		} else {
			System.out.println("O subconjunto não "
					+ "foi encontrado no conjunto "
					+ "pesquisado.");
		}
		
		
		
	}

}
