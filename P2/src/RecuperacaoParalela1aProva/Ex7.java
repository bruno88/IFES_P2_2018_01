package RecuperacaoParalela1aProva;

import java.util.Scanner;

import Util.Util;

public class Ex7 {
	public static void main(String[] args) {
		final int tam = 4;
		final String texto = "Vago";
		boolean continuar = true;
		Scanner entrada = new Scanner(System.in);
		String[][] condominio = new String[tam][tam];
		String nome;
		int op, andar, apto, novoAndar, novoApto;

		try {
			// Preenche matriz com o texto "Vago"
			Util.preencheMatrizComTexto(condominio, texto);
			
			do {
				// Imprime o condom�nio em seu estado atual
				System.out.print("Condom�nio atual: \n\n");				
				Util.imprimeMatriz(condominio);
				
				System.out.println("Digite uma op��o: \n\n" 
						+ "1 - Incluir Cond�mino\n" 
						+ "2 - Transferir Cond�mino\n"
						+ "3 - Remover Cond�mino por nome\n" 
						+ "4 - Remover Cond�mino por andar/apto\n" 
						+ "0 - Sair");
				op = Integer.valueOf(entrada.nextLine());
				switch (op) {
				case 1:
					System.out.println("Digite o nome do Cond�mino a ser registrado");
					nome = entrada.nextLine();
					
					System.out.println("Digite o andar (linha) a ser ocupado");
					andar = Integer.valueOf(entrada.nextLine());
					
					System.out.println("Digite o apartamento (coluna) a ser ocupado");
					apto = Integer.valueOf(entrada.nextLine());
					
					Util.alugarAptoParaCondomino(condominio, nome, andar, apto, texto);
					
					break;
				case 2:
					System.out.println("Digite o nome do Cond�mino a ser transferido");
					nome = entrada.nextLine();

					// Verifica se o cond�mino est� no condom�nio
					if (Util.isOnMatrix(condominio, nome)) {

						System.out.println("Digite o andar (linha) a ser ocupado");
						novoAndar = Integer.valueOf(entrada.nextLine());

						System.out.println("Digite o apartamento (coluna) a ser ocupado");
						novoApto = Integer.valueOf(entrada.nextLine());

						Util.transfereCondomino(condominio, nome, novoAndar, novoApto, texto);
					} else {
						System.out
								.println("O nome digitado n�o est� no condom�nio, "
										+ "portanto n�o pode ser transferido.");
					}
					break;
				case 3:
					System.out.println("Digite o nome do Cond�mino a ser transferido");
					nome = entrada.nextLine();

					Util.removeDoCondominioPorNome(condominio, nome, texto);

					break;
				case 4:
					System.out.println("Digite o andar (linha) a ser ocupado");
					novoAndar = Integer.valueOf(entrada.nextLine());

					System.out.println("Digite o apartamento (coluna) a ser ocupado");
					novoApto = Integer.valueOf(entrada.nextLine());

					Util.removeDoCondominioPorPosicao(condominio, novoAndar, novoApto, texto);
					break;
				case 0:
					continuar = false;
					System.out.println("Programa encerrado por comando do usu�rio!");
					break;

				default:
					System.out.println("Entrada inv�lida !");
					break;
				}			
			} while (continuar);
		} catch (Exception e) {
			System.out.println("Erro no processamento: \n" + e);
		}

		// Fecha o scanner
		entrada.close();
	}
}
