package ConteudoProva1;

import java.util.Scanner;

public class L1E1 {
	public static void main(String[] args) {
		final int tam = 5;
		int[] vetor = new int[tam];
		Scanner entrada = new Scanner(System.in);
		
		try {
			// Leitura dos numeros
			for (int i = 0; i < vetor.length; i++) {
				System.out.println("Digite um número");
				vetor[i] = entrada.nextInt();
			}
			
			// Imprimindo o vetor
			for (int i = 0; i < vetor.length; i++) {
				System.out.println(vetor[i] + "\n");
			}
		} catch (Exception e) {
			System.out.println("Deu erro em algum lugar !!");
		}
	}
}
