package POO;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int op, contaInt;
		double valorDigitado;
		
		Scanner entrada = new Scanner(System.in);
		boolean continua_menu = true, continua_submenu = true;

		OldConta c1 = new OldConta("Bruno");
		OldConta c2 = new OldConta("Pedro", 100, 100);
		OldConta contaEscolhida = null, outraConta = null;

		try {
			do {
				continua_menu = true;
				continua_submenu = true;
				
				// Seleciona a conta a ser utilizada
				contaInt = OldConta.selecionaContaPorMenu(entrada);

				if (contaInt == 1) {
					contaEscolhida = c1;
				} else if (contaInt == 2) {
					contaEscolhida = c2;
				} else {
					continua_menu = false;
					System.out.println("Programa encerrado por comando do usuário");
				}

				if (continua_menu) {
					do {
						System.out.println("Digite a opção desejada: \n\n" 
								+ "1 - Realizar Saque\n"
								+ "2 - Realizar Depósito\n" 
								+ "3 - Realizar Transferência\n"
								+ "4 - Imprimir dados da conta\n\n" 
								+ "0 - Retornar ao menu anterior");

						op = Integer.valueOf(entrada.nextLine());
						switch (op) {
						case 1:
							// lê valor a ser sacado
							System.out.println("Digite o valor a ser sacado");
							valorDigitado = Double.valueOf(entrada.nextLine());

							// realiza saque
							contaEscolhida.sacar(valorDigitado);

							System.out.println("Saque realizado com sucesso !");
							break;
						case 2:
							// lê valor a ser depositado
							System.out.println("Digite o valor a ser depositado");
							valorDigitado = Double.valueOf(entrada.nextLine());

							// realiza depósito
							contaEscolhida.depositar(valorDigitado);
							
							System.out.println("Depósito realizado com sucesso !");
							break;
						case 3:
							// TODO: lê conta de destino para transferida
							if (contaEscolhida == c1) {
								outraConta = c2; 
							} else {
								outraConta = c1;
							}
							
							// lê valor a ser depositado
							System.out.println("Digite o valor a ser transferido");
							valorDigitado = Double.valueOf(entrada.nextLine());

							// realiza depósito
							contaEscolhida.transferirPara(
									outraConta, valorDigitado);
							
							break;
						case 4:
							System.out.println(contaEscolhida.toString() + "\n");
							break;
						case 0:
							continua_submenu = false;
							break;

						default:
							System.out.println("Entrada inválida !");
							break;
						}
					} while (continua_submenu);
				}
			} while (continua_menu);

		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}
		entrada.close();
	}
}
