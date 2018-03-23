package Metodos;

import java.util.Scanner;

import Util.Util;

public class L2E8 {
	public static void main(String[] args) {
		final int tam = 500, minRand = 1, maxRand = 100;
		int[] vetor = new int[tam];
		
		// Popula vetor
		Util.getVetorIntAleatorio(vetor, 
				minRand, maxRand);
		
		// Imprime vetor
		Util.imprimeVetorInt(vetor);
		
		// Imprime dados da Promo��o para Todos
		Util.imprimeLocacoesPromocao(vetor);
		
		// Imprime dados da Promo��o para Cliente 1
		Scanner entrada = new Scanner(System.in);
		int codCliente = entrada.nextInt();
		codCliente--; 
		entrada.close();
		Util.imprimeLocacoesPromocao(vetor, codCliente);
		
		
	}

}
