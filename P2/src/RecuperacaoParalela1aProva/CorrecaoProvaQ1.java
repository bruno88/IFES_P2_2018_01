package RecuperacaoParalela1aProva;

import java.util.Scanner;

import Util.Util;

public class CorrecaoProvaQ1 {
	public static int qtdTermos = 0;
	
	public static void main(String[] args) {
		final int tam = 1;
		int[] pilha = new int[tam];
		int[] qtdTermos = new int[tam];
		int op, numero;
		Scanner entrada = new Scanner(System.in);
		boolean continuar = true;
		
		try {
			do {				
				System.out.println("Digite uma opção: \n\n" 
						+ "1 - Empilhar - Push\n" 
						+ "2 - Desempilhar - Pop\n\n"
						+ "0 - Sair");
				op = Integer.valueOf(entrada.nextLine());
				switch (op) {
				case 1:
					System.out.println("Digite o número a ser empilhado");
					numero = Integer.valueOf(entrada.nextLine());
					
					pilha = Util.pushPilha(pilha, numero, qtdTermos);
					
					break;
				case 2:
					// Imprime o ultimo termo 
					Util.imprimeUltimoTermo(pilha);

					// Obtém a pilha sem o termo desempilhado
					pilha = Util.getPilhaSemUltimo(pilha, qtdTermos);
					
					break;
				case 0:
					System.out.println("Programa encerrado por comando do usuário");
					continuar = false;
					break;
				default:
					System.out.println("Entrada inválida !");
					break;
				}		
				//Imprime a pilha 
				System.out.print("Pilha atual: ");
				Util.imprimeVetorInt(pilha);
			} while (continuar);
		} catch (Exception e) {
			System.out.println("Erro no processamento: \n" + e);
		}

		// Fecha o scanner
		entrada.close();
	}
}
