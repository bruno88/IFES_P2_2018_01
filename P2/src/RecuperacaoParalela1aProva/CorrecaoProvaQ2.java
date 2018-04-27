package RecuperacaoParalela1aProva;

import java.util.Scanner;

import Util.Util;

public class CorrecaoProvaQ2 {
	public static void main(String[] args) {
		final int minRand = 0, maxRand = 50;
		int N;
		Scanner entrada = new Scanner(System.in);

		try {
			// Obt�m N
			System.out.println("Digite o n�mero de colunas da matriz");
			N = Integer.valueOf(entrada.nextLine());

			// Cria a matriz com o tamanho escolhido
			int[][] mat1 = new int[N][N];
			int[][] mat2 = new int[N][N];
			int[][] matAlternada = new int[N][N];

			// Preenche a matriz com numeros aleat�rios no intervalo
			Util.getMatrizIntAleatorio(mat1, minRand, maxRand);
			Util.getMatrizIntAleatorio(mat2, minRand, maxRand);
			
			// Imprime Matriz
			Util.imprimeMatriz(mat1);
			Util.imprimeMatriz(mat2);

			// Obt�m a menor matriz
			matAlternada = Util.getMatrizAlternada(mat1, mat2);

			// Imprime Matriz Alternada
			Util.imprimeMatriz(matAlternada);

		} catch (Exception e) {
			System.out.println("Erro de processamento:" + e);
		}

		// Fecha o Scanner
		entrada.close();
	}
}
