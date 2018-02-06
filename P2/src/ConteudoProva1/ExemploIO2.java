package ConteudoProva1;

import java.util.Scanner;

public class ExemploIO2 {

	public static void main(String[] args) {
		final int tam = 10;
		int[] vetor = new int[tam];
		String result = "";
		

		// Populando a Matriz
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < tam; i++) {
			System.out.println("Digite o " + (i+1) + " número: ");
			vetor[i] = entrada.nextInt();
		}
		entrada.close();
		
		// Imprimindo o vetor com o System.out.println()
		for (int i = 0; i < vetor.length; i++) {
			result += vetor[i] + " ";
		}
		
		System.out.println(result);
	}

}
