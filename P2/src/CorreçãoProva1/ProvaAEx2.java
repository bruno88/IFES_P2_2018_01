package CorreçãoProva1;

import java.util.Scanner;
import Util.Util;

public class ProvaAEx2 {

	public static void main(String[] args) {
		final int tamVetor = 2, minRand = 0, maxRand = 50;
		int M, N;
		int[] vetor = new int[tamVetor];
		Scanner entrada = new Scanner(System.in);

		try {
			// Obtém M
			System.out.println("Digite o número de linhas da matriz");
			M = Integer.valueOf(entrada.nextLine());

			// Obtém N
			System.out.println("Digite o número de colunas da matriz");
			N = Integer.valueOf(entrada.nextLine());

			// Cria a matriz com o tamanho escolhido
			int[][] matriz = new int[M][N];

			// Preenche a matriz com numeros aleatórios no intervalo
			Util.getMatrizIntAleatorio(matriz, minRand, maxRand);

			// Imprime Matriz
			Util.imprimeMatriz(matriz);

			// Lê o vetor de inteiros
			Util.leVetorInt(vetor, entrada);
			
			// Imprime o vetor de Inteiros
			System.out.print("Vetor atual: ");
			Util.imprimeVetorInt(vetor);

			// Altera a matriz conforme o exercício
			Util.alteraMatriz(matriz, vetor);

			// Imprime Nova Matriz
			Util.imprimeMatriz(matriz);

		} catch (Exception e) {
			System.out.println("Erro de processamento:" + e);
		}

		// Fecha o Scanner
		entrada.close();

	}

}
