package CorreçãoProva1;

import java.util.Scanner;

import Util.Util;

public class ProvaAEx1 {
	public static void main(String[] args) {
		// Variáveis numéricas como CONSTANTES (FINAL)
		final int minRand = 0, maxRand = 99, tam = 10;
		int[] vetor = new int[tam];
		int pos, num;
		Scanner entrada = new Scanner(System.in);
		
		try {
			// Preenche o vetor com aleatórios no intervalo
			Util.getVetorIntAleatorio(vetor, minRand, maxRand);

			// Imprime o vetor
			Util.imprimeVetorInt(vetor);

			// Obtém pos
			System.out.println("Digite a posição a ser alterada");
			pos = Integer.valueOf(entrada.nextLine());

			// Obtém num
			System.out.println("Digite o novo valor");
			num = Integer.valueOf(entrada.nextLine());

			// Realiza a substituição
			//Util.substituiValor(vetor, pos, num);
			
			// Se fosse pra fazer a inclusão
			vetor = Util.incluirValor(vetor, pos, num);

			// Imprime o vetor alterado
			Util.imprimeVetorInt(vetor);
		} catch (Exception e) {
			// Mostrar o err
			System.err.println("Erro de processamento:" + e);
			//System.out.println("Erro de processamento:" + e);
		}

		// Fecha o Scanner
		entrada.close();
	}

}
