package POO;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int op;
		double valorDigitado;
		Scanner entrada = new Scanner(System.in);
		boolean continua_menu = true;
		Conta c1 = new Conta("Bruno");
		
		
		do {
			try {
				System.out.println("Digite a opção desejada: \n\n"
						+ "1 - Realizar Saque\n"
						+ "2 - Realizar Depósito\n"
						+ "3 - Imprimir dados da conta\n\n"
						+ "0 - Encerrar Programa");
				op = Integer.valueOf(entrada.nextLine());
				switch (op) {
				case 1:
					// lê valor a ser sacado
					System.out.println("Digite o valor a ser sacado");
					valorDigitado = Double.valueOf(entrada.nextLine());
					
					// realiza saque
					c1.sacar(valorDigitado);
					
					break;
				case 2:
					// lê valor a ser depositado
					System.out.println("Digite o valor a ser depositado");
					valorDigitado = Double.valueOf(entrada.nextLine());
					
					// realiza depósito
					c1.depositar(valorDigitado);
					break;
				case 3: 
					System.out.println(c1.toString() + "\n");
					break;
				case 0:
					System.out.println("Programa encerrado por comando do usuário");
					continua_menu = false;
					break;

				default:
					System.out.println("Entrada inválida !");
					break;
				}
			} catch (Exception e) {
				System.out.println("Erro: " + e);
			}
		} while (continua_menu);
		
		entrada.close();		
	}
}