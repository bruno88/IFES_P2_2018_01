package Metodos;

import Util.Util;

public class Extra2 {
	public static void main(String[] args) {
		final int numero = 7;
		boolean isPrimo = false;

		isPrimo = Util.isPrimo(numero);
		if (isPrimo) {
			System.out.println(numero + " é primo");
		} else {
			System.out.println(numero + " não é primo");
		}
	}
}
