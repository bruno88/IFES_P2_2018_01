package Metodos;

//import java.util.InputMismatchException;

import java.util.Scanner;

import Util.Util;

public class L2E6 {
	public static void main(String[] args) {
		final int tamVetor = 6, tamSubConj = 3, minRand = 1, maxRand = 20;
		int[] conjunto = new int[tamVetor];
		int[] subconjunto = new int[tamSubConj];
		Scanner entrada = new Scanner(System.in);

		try {
			// Popula o vetor
			Util.getVetorIntAleatorio(conjunto, minRand, maxRand);
			// System.out.println("digite um int");
			// int a = entrada.nextInt();
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

			/*
			 * Verifica se o subconjunto está contido no conjunto
			 */
			int posicaoEncontrada = Util.getIndexOfSubconjuntoNoConjunto(conjunto, subconjunto);

			// Se -1, não retornou indice
			if (posicaoEncontrada == -1) {
				System.out.println("Subconjunto " + "não encontrado");
			} else {
				// Senão, imprime o índice
				System.out.println("Subconjunto " + "inicia-se na posição " + posicaoEncontrada);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro por indice fora do intervalo: \n" + e);
		} catch (Exception e) {
			System.out.println("Deu ruim:\n" + e);
		}

	}
}
