package Introducao;

import java.util.Scanner;

public class ExemploIO3 {

	public static void main(String[] args) {
		String result = "", nome, sobrenome, curso, CPF;
		int idade;

		// Exemplo de leitura e convers�o de tipos com JOptionPane
		/*
		 * String aux = JOptionPane.showInputDialog( "Digite sua altura"); double altura
		 * = Double.valueOf(aux);
		 */

		// Uso do Try/Catch para qualquer exce��o
		try {
			// Lendo dados da pessoa
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite seu nome ");
			nome = entrada.nextLine();
			// Mostrar aqui o nextLine
			System.out.println("Digite seu sobrenome ");
			sobrenome = entrada.next();
			//
			System.out.println("Digite sua idade ");
			idade = entrada.nextInt();
			//
			System.out.println("Digite seu curso ");
			curso = entrada.next();
			
			// Mostrar aqui o nextLine
			System.out.println("Digite seu CPF ");
			CPF = entrada.next();

			entrada.close();

			// Imprimindo os dados da pessoa
			result = "Seu nome � " + nome + "\n";
			result += "Seu sobrenome � " + sobrenome + "\n";
			result += "Seu idade � " + idade + "\n";
			result += "Seu curso � " + curso + "\n";
			result += "Seu CPF � " + CPF + "\n";

			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Houve um erro! \n" );
		}
		
	}

}
