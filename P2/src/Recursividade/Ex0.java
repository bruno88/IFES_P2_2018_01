package Recursividade;

import java.util.Scanner;
import Util.Util;

public class Ex0 {
	public static void main(String[] args)  {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o número a ser calculado: ");
		int numero = Integer.valueOf(entrada.nextLine());
		
		int resultado = Util.calcularFatorial(numero);
		System.out.println(numero + "! = " + resultado);
		
		entrada.close();
	}
}
