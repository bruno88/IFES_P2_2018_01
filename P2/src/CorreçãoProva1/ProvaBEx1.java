package CorreçãoProva1;

import java.util.Scanner;

import Util.Util;

public class ProvaBEx1 {

	public static void main(String[] args) {
		final int tam = 20, minRand = 0, maxRand = 99;
		int pos, media;
		int[] vetor = new int [tam];
		Scanner entrada = new Scanner(System.in);
		try {
			// Preenche o vetor com numeros aleatórios no intervalo
			Util.getVetorIntAleatorio(vetor, minRand, maxRand);
			
			// Imprime o vetor
			Util.imprimeVetorInt(vetor);
			
			// Calcula e imprime média
			media = (int) Util.calculaMediaArit(vetor);
			
			// Imprime média
			System.out.println(media);
			
			// Obtém pos
			System.out.println("Digite a posição");
			pos = Integer.valueOf(entrada.nextLine());
			
			// Altera os vizinhos
			Util.alteraVizinhos(vetor, pos, media);
			
			// Imprime o vetor
			Util.imprimeVetorInt(vetor);
			
		} catch (Exception e) {
			System.out.println("Erro de processamento:" + e);
		}
		// Fecha o Scanner
		entrada.close();
	}

}
