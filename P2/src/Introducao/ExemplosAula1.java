package Introducao;

import java.util.Scanner;

public class ExemplosAula1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua idade");
		int idade = entrada.nextInt();
		System.out.println(idade);
		
		entrada.close();
	}

}
