package Metodos;

import java.util.Scanner;

import Util.Util;

public class L3E5 {
	public static String[] nomeOperHist = new String [100];
	public static double[] valorOperHist = new double [100];
	public static int qtdTransacoes = 0;
	
	public static void main(String[] args) {
		int op = 0;
		double valor, saldo = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			try {
				System.out.println("Digite a op��o desejada:\n" 
						+ "\n1 - Realizar Saque" 
						+ "\n2 - Realizar Dep�sito"
						+ "\n3 - Consultar Transa��es" 
						+ "\n\n0 - Sair");

				op = Integer.parseInt(entrada.nextLine());

				switch (op) {
				// 1 - Realizar Saque
				case 1:
					System.out.println("Digite o valor a ser sacado");
					valor = Double.parseDouble(entrada.nextLine());
					
					// Deduz da Conta Corrente
					saldo -= valor;
					
					// Hist�rico
					Util.salvaHistorico("Saque", valor);
					
					System.out.println("Saque realizado com sucesso");
					break;
				case 2:
					System.out.println("Digite o valor a ser depositado");
					valor = Double.parseDouble(entrada.nextLine());
					
					// Soma na Conta Corrente
					saldo += valor;
					
					// Hist�rico
					Util.salvaHistorico("Dep�sito", valor);
					
					System.out.println("Dep�sito realizado com sucesso");
					break;
				case 3:
					Util.imprimeHistorico();
					System.out.println("Saldo Atual: " + saldo);
					break;

				case 0:
					System.out.println("Programa encerrado por comando do usu�rio");
					break;
					
				default:
					System.out.println("C�digo inv�lido!");
					break;
				}

			} catch (Exception e) {
				System.out.println("Ocorreu um erro no processamento: " + e);
			}
		} while (op != 0);
		entrada.close();

	}

}
