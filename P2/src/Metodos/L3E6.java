
package Metodos;

import java.util.Scanner;

import Util.Util;

public class L3E6 {
	public static int jogadorAtual = 1;
	public static String result = "";

	public static void main(String[] args) {
		final int tam = 3;
		int novaLinha, novaColuna;
		boolean continuar = true;
		Scanner entrada = new Scanner(System.in);

		String[][] tabuleiro = new String[tam][tam];
		try {
			// Preenche toda a matriz com "_"
			Util.defineTabuleiro(tabuleiro);

			do {
				// Imprime tabuleiro
				Util.imprimeTabuleiro(tabuleiro);

				// L� dados do usu�rio
				System.out.println("Digite a linha a ser jogada");
				novaLinha = Integer.valueOf(entrada.nextLine());
				System.out.println("Digite a coluna a ser jogada");
				novaColuna = Integer.valueOf(entrada.nextLine());

				// Verificando se a tupla � valida e est� livre
				if (Util.isTuplaValida(
						tabuleiro, novaLinha, novaColuna)) {
					// Registra a jogada de acordo com o jogador
					Util.realizaJogada(tabuleiro, novaLinha, novaColuna, jogadorAtual);
					
					// Verifica a condi��o de vit�ria 
					// para saber se o jogo continua 
					continuar = Util.verificaVitoria(tabuleiro);
				} else {
					result = "Jogada Inv�lida";
				}

				System.out.println(result);
			} while (continuar);

			// Imprime tabuleiro final
			System.out.println("\nTabuleiro final: \n");
			Util.imprimeTabuleiro(tabuleiro);

			entrada.close();
		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}
	}
}
