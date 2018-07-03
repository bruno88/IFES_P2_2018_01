package Recursividade;

import Util.Util;

public class L10E7 {
	public static void main(String[] args) {
		final int K = 1;
		int indice = 0;
		int[] vet = { 1, 2, 1, 3, 1 };

		int cont = Util.contaKNoVetor(vet, K, indice);

		System.out.println(cont);
	}
}
