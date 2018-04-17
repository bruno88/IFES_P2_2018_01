package RecuperacaoParalela1aProva;

import Util.Util;

public class Ex6 {
	public static void main(String[] args) {
		final int tam = 4, min = 1, max = 10;
	
		int[][] matriz = new int[tam][tam];

		try {
			// Preenche o vetor com aleatórios no intervalo
			Util.getMatrizIntAleatorio(matriz, min, max);

			// Imprime Matriz
			Util.imprimeMatriz(matriz);
			
		} catch (Exception e) {
			System.out.println("Erro no processamento: \n" + e);
		}
		
	}
}
