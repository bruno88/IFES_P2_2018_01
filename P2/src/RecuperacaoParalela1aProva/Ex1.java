package RecuperacaoParalela1aProva;

import java.util.Scanner;

import Util.Util;

public class Ex1 {
	public static void main(String[] args) {
		final int tam = 3;
		Scanner entrada = new Scanner(System.in);
		int[] vetor = new int[tam];
		try {
			// Preenche vetor pelo usuário
			Util.leVetorInt(vetor, entrada);

			// Imprime vetor
			System.out.print("Vetor Digitado: ");
			Util.imprimeVetorInt(vetor);
		} catch (Exception e) {
			System.out.println("Erro no processamento: \n" + e);
		}
		// Fecha o Scanner
		entrada.close();
	}
}
