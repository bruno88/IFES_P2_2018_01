package Metodos;

import Util.Util;

public class L2E5 {
	public static void main(String[] args) {
		final int tamVetor = 10, 
				tamRepetidos = tamVetor/2, 
				minRand = 30, 
				maxRand = 60;
		int[] vetor = new int[tamVetor];
		int[] vetRepetidos = new int[tamRepetidos];
		try {
		// Popula o vetor
		Util.getVetorIntAleatorio2(vetor, minRand, maxRand);

		// Imprime o vetor
		Util.imprimeVetorInt(vetor);

		// Passo 1: Ordenar Vetor
		vetor = Util.doSelectionSort(vetor);

		// Imprime o vetor
		Util.imprimeVetorInt(vetor);

		// Passo 2: Gerar novos valores
		// Mostrar a questão do re-uso de código
		Util.getVetorIntAleatorio2(vetor, minRand, maxRand);

		// Imprime o vetor
		Util.imprimeVetorInt(vetor);

		// Passo 3: Buscar repetidos
		vetRepetidos = Util.getNumerosRepetidos(vetor);

		// Imprime o vetor
		// Explicar sobrecarga de métodos
		Util.imprimeVetorInt(vetRepetidos);
		} catch (Exception e) {
			System.out.println("Deu ruim =(");
		}
	}

}
