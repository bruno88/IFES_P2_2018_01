package Corre��oProva1;

import java.util.Scanner;

import Util.Util;

public class ProvaBEx2 {

	public static void main(String[] args) {
		final int minRand = 0, maxRand = 50;
		int M, N, posL, posC;
		Scanner entrada = new Scanner(System.in);

		try {
			// Obt�m M
			System.out.println("Digite o n�mero de linhas da matriz");
			M = Integer.valueOf(entrada.nextLine());

			// Obt�m N
			System.out.println("Digite o n�mero de colunas da matriz");
			N = Integer.valueOf(entrada.nextLine());

			// Cria a matriz com o tamanho escolhido
			int[][] mat1 = new int[M][N];
			int[][] mat2 = new int[M][N];
			int[][] mat3 = new int[M][N];
			int[][] mat4 = new int[M][N];
			int[][] menorMatriz = new int[M][N];

			// Preenche a matriz com numeros aleat�rios no intervalo
			Util.getMatrizIntAleatorio(mat1, minRand, maxRand);
			Util.getMatrizIntAleatorio(mat2, minRand, maxRand);
			Util.getMatrizIntAleatorio(mat3, minRand, maxRand);
			Util.getMatrizIntAleatorio(mat4, minRand, maxRand);

			// Imprime Matriz
			Util.imprimeMatriz(mat1);
			Util.imprimeMatriz(mat2);
			Util.imprimeMatriz(mat3);
			Util.imprimeMatriz(mat4);

			// Obt�m posL
			System.out.println("Digite o posL");
			posL = Integer.valueOf(entrada.nextLine());

			// Obt�m posC
			System.out.println("Digite o posC");
			posC = Integer.valueOf(entrada.nextLine());

			// Obt�m a menor matriz
			menorMatriz = Util.getMenorMatriz(
					mat1, mat2, mat3, mat4, 
					posL, posC, maxRand);
			
			// Imprime Menor Matriz
			Util.imprimeMatriz(menorMatriz);
			
		} catch (Exception e) {
			System.out.println("Erro de processamento:" + e);
		}

		// Fecha o Scanner
		entrada.close();
	}

}
