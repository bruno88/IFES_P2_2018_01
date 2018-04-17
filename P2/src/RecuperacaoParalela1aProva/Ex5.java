package RecuperacaoParalela1aProva;

import Util.Util;

public class Ex5 {
	public static void main(String[] args) {
		final int tam = 4, min = 1, max = 10;
	
		int[][] matriz = new int[tam][tam];
		double mediaAritMatriz;

		try {
			// Preenche o vetor com aleat�rios no intervalo
			Util.getMatrizIntAleatorio(matriz, min, max);

			// Imprime Matriz
			Util.imprimeMatriz(matriz);
			
			// Obt�m a m�dia dos termos da matriz
			mediaAritMatriz = Util.getMediaAritMatriz(matriz);
			
			System.out.println("M�dia aritm�tica da Matriz: " 
							+ mediaAritMatriz);	
		} catch (Exception e) {
			System.out.println("Erro no processamento: \n" + e);
		}
		
	}
}
