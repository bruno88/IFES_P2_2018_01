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
				// Imprime o condomínio em seu estado atual
				System.out.print("Condomínio atual: \n\n");				
				Util.imprimeMatriz(condominio);
				
				System.out.println("Digite uma opção: \n\n" 
						+ "1 - Incluir Condômino\n" 
						+ "2 - Transferir Condômino\n"
						+ "3 - Remover Condômino por nome\n" 
						+ "4 - Remover Condômino por andar/apto\n" 
						+ "0 - Sair");
				op = Integer.valueOf(entrada.nextLine());
				switch (op) {
				case 1:
					System.out.println("Digite o nome do Condômino a ser registrado");
					nome = entrada.nextLine();
					
					System.out.println("Digite o andar (linha) a ser ocupado");
					andar = Integer.valueOf(entrada.nextLine());
					
					System.out.println("Digite o apartamento (coluna) a ser ocupado");
					apto = Integer.valueOf(entrada.nextLine());
					
					Util.alugarAptoParaCondomino(condominio, nome, andar, apto, texto);
					
					break;
				case 2:
					System.out.println("Digite o nome do Condômino a ser transferido");
					nome = entrada.nextLine();

					// Verifica se o condômino está no condomínio
					if (Util.isOnMatrix(condominio, nome)) {

						System.out.println("Digite o andar (linha) a ser ocupado");
						novoAndar = Integer.valueOf(entrada.nextLine());

						System.out.println("Digite o apartamento (coluna) a ser ocupado");
						novoApto = Integer.valueOf(entrada.nextLine());

						Util.transfereCondomino(condominio, nome, novoAndar, novoApto, texto);
					} else {
						System.out
								.println("O nome digitado não está no condomínio, "
										+ "portanto não pode ser transferido.");
					}
					break;
				case 3:
					System.out.println("Digite o nome do Condômino a ser transferido");
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
					System.out.println("Programa encerrado por comando do usuário!");
					break;

				default:
					System.out.println("Entrada inválida !");
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
