
package Metodos;

import java.util.Scanner;
import Util.Util;

public class L3E7 {
	public static void main(String[] args) {
		final int tamVetor = 1;
		int qtdNum = 0;
		int[] vetor = new int[tamVetor];
		int op, numero;
		Scanner entrada = new Scanner(System.in);
		try {
			do {
				System.out.println(
						"Escolha: \n\n" 
				+ "1 - Adicionar um n�mero\n" 
				+ "2 - Remover um n�mero\n\n" 
				+ "0 - Sair");
				op = Integer.valueOf(entrada.nextLine());
				
				switch (op) {
				case 1:
					System.out.println("Digite o n�mero a ser adicionado");
					numero = Integer.valueOf(entrada.nextLine());
					vetor = Util.adicionarNoVetor(vetor, numero, qtdNum);
					qtdNum++;
					System.out.print("Vetor atual: ");
					Util.imprimeVetorInt(vetor, qtdNum);
					break;
				case 2:
					System.out.println("Digite o n�mero a ser removido");
					numero = Integer.valueOf(entrada.nextLine());
					vetor = Util.removeDoVetor(vetor, numero);
					qtdNum--;
					System.out.print("Vetor atual: ");
					Util.imprimeVetorInt(vetor, qtdNum);
					break;
				case 0:
					System.out.println("Programa encerrado por comando do usu�rio");
					break;

				default:
					System.out.println("Entrada inv�lida");
					break;
				}
				
			} while (op != 0);
		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}
		entrada.close();
	}
}
