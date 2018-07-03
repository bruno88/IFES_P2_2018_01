package Recursividade;

import java.util.Scanner;
import Util.Util;

public class Ex1 {
	public static void main(String[] args)  {
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println("Digite o número de repetições: ");
			int numero = Integer.valueOf(entrada.nextLine());
			
			String resultado = Util.euAdoroProg(numero);
			System.out.println(resultado);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro!");
		}
		
		
		entrada.close();
	}
}
