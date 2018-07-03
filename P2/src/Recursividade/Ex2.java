package Recursividade;

import java.util.Scanner;
import Util.Util;

public class Ex2 {
	public static void main(String[] args)  {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o número de repetições: ");
		int numero = Integer.valueOf(entrada.nextLine());
		
		String resultado = Util.euAdoroProg(numero);
		System.out.println(resultado);
		
		entrada.close();
	}
}
