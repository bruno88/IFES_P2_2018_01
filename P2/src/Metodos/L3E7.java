
package Metodos;

import java.util.Scanner;
import Util.Util;

public class L3E7 {
	public static int qtdNum = 0;
	public static void main(String[] args) {
		final int tamVetor = 1;
		int[] vetor = new int[tamVetor];
		int op, numero;
		Scanner entrada = new Scanner(System.in);
		try {
			do {
				System.out.println(
						"Escolha: \n\n" 
				+ "1 - Adicionar um número\n" 
				+ "2 - Remover um número\n\n" 
				+ "0 - Sair");
				op = Integer.valueOf(entrada.nextLine());
				
				switch (op) {
				case 1:
					System.out.println("Digite o número a ser adicionado");
					numero = Integer.valueOf(entrada.nextLine());
					vetor = Util.adicionarNoVetor(vetor, numero);
					System.out.print("Vetor atual: ");
					Util.imprimeVetorInt(vetor, qtdNum);
					break;
				case 2:
					System.out.println("Digite o número a ser removido");
					numero = Integer.valueOf(entrada.nextLine());
					vetor = Util.removeDoVetor(vetor, numero);
					System.out.print("Vetor atual: ");
					Util.imprimeVetorInt(vetor, qtdNum);
					break;
				case 0:
					System.out.println("Programa encerrado por comando do usuário");
					break;

				default:
					System.out.println("Entrada inválida");
					break;
				}
				
			} while (op != 0);
		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}
		entrada.close();
	}
}
