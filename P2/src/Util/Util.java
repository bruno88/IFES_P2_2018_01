package Util;

import java.util.Arrays;
import java.util.Collections;

public class Util {
	public static int soma(int numA, int numB) {
		int result = numA + numB;
		return result;
	}

	public static int geraIntAleatorio(int min, int max) {
		int intAleatorio = min + (int) 
				(Math.random() * ((max - min) + 1));
		return intAleatorio;
	}

	public static double calculaMediaArit(int[] vetor) {
		int soma = 0;
		double media;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		media = (double) soma / vetor.length;
		return media;
	}

	/**
	 * @description Método utilizado para imprimir vetor de inteiros
	 * 
	 * @author Bruno Clemente
	 * @param vetor
	 *            = vetor a ser impresso
	 * @return void
	 */
	public static void imprimeVetorInt(int[] vetor) 
			throws ArrayIndexOutOfBoundsException{
		String result = "";

		for (int i = 0; i < vetor.length; i++) {
			result += vetor[i] + " ";
		}
		System.out.println(result);

	}

	public static void imprimeVetorInt(int[] vetor, 
			boolean removeZeros) {
		String result = "";

		// Se true, remove os zeros
		if (removeZeros) {
			for (int i = 0; i < vetor.length; i++) {
				if (vetor[i] != 0) {
					result += vetor[i] + " ";
				}
			}
			System.out.println(result);
			// Se false, chama o método sem o boolean removeZeros
		} else {
			Util.imprimeVetorInt(vetor);
		}

	}

	public static double getNumeroAbs(double numero) {
		return Math.abs(numero);
		/*if (numero >= 0) {
			return numero;
		} else {
			return (-1)*numero;
		}*/
	}

	public static int[] getVetorIntAleatorio1(int[] vetor, int min, int max) {

		// Popula o vetor com aleatórios de min a max
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Util.geraIntAleatorio(min, 
					max);
		}
		return vetor;
	}

	public static void getVetorIntAleatorio2(int[] 
			vetor, int min, int max) {
		// Popula o vetor com aleatórios de min a max
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Util.geraIntAleatorio(min, 
					max);
		}

	}

	public static int getMinutosFromHoras(int horas) {
		return horas * 60;
	}

	public static int getSegundosFromHoras(int horas) {
		return horas * 3600;
	}

	public static int getSegundosFromMinutos(int horas) {
		return horas * 60;
	}

	public static int[] doSelectionSort(int[] vetor) 
			throws ArrayIndexOutOfBoundsException{
		for (int i = 0; i < vetor.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j] < vetor[index])
					index = j;
			}
			int menorValor = vetor[index];
			vetor[index] = vetor[i];
			vetor[i] = menorValor;
		}
		return vetor;
	}

	public static int[] getNumerosRepetidos(int[] vetor) {
		int qtd = 0;
		boolean isRepetido = false, isOnArray = false;
		int[] repetidos = new int[vetor.length];

		for (int i = 0; i < vetor.length; i++) {
			isRepetido = Util.isRepetidoInt(vetor, vetor[i]);
			isOnArray = Util.isOnArray(repetidos, vetor[i]);
			// Se o número tem repetições E
			// se não está no vetor de repetidos
			if (isRepetido && !isOnArray) {
				repetidos[qtd] = vetor[i];
				qtd++;
			}
		}

		return repetidos;
	}

	private static boolean isOnArray(int[] vetor, int numero) {
		int cont = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numero) {
				cont++;
			}
		}
		if (cont == 0) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean isRepetidoInt(int[] vetor, int numero) {
		int cont = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numero) {
				cont++;
			}
		}
		if (cont > 1) {
			return true;
		} else {
			return false;
		}

	}

	public static int getIndexOfSubconjuntoNoConjunto(int[] conjunto, int[] subconjunto) {
		int cont;
		for (int i = 0; 
				i <= (conjunto.length - 
						subconjunto.length); 
				i++) {
			
			cont = 0;
			for (int j = 0; 
					j < subconjunto.length; 
					j++) {
				if (conjunto[i + j] == 
						subconjunto[j]) {
					cont++;
				}
			}
			if (cont == subconjunto.length) {
				return i;
			}

		}
		return -1;
	}

	public static int[] getAllIndexOfSubconjuntoNoConjunto(int[] conjunto, int[] subconjunto) {
		int cont;
		int[] posicoes = new int[conjunto.length];
		int qtd = 0;

		for (int i = 0; 
				i <= (conjunto.length 
							- subconjunto.length);
				i++) {
			cont = 0;
			for (int j = 0; j < subconjunto.length; j++) {
				if (conjunto[i + j] == subconjunto[j]) {
					cont++;
				}
			}
			if (cont == subconjunto.length) {
				posicoes[qtd] = i;
				qtd++;
			}

		}
		return posicoes;

	}

	public static void imprimeLocacoesPromocao(
							int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			Util.imprimeLocacoesPromocao(vetor, i);
		}
	}

	public static void imprimeLocacoesPromocao(
						int[] vetor, int codPessoa) {
		final int criterio = 15;
		String result = "Cliente " + (codPessoa + 1) + " possui " + vetor[codPessoa] + " locações. "
				+ (vetor[codPessoa] / criterio) + " locações grátis\n";

		System.out.println(result);
	}

	public static int[][] getMatrizIntAleatorio(int[][] matriz, int min, int max) {

		// Popula o vetor com aleatórios de min a max
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = Util.geraIntAleatorio(min, max);
			}

		}
		return matriz;
	}

	public static void imprimeMatrizInt(int[][] matriz) {
		String result = "";

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				result += matriz[i][j] + "\t";
			}
			result += "\n";

		}
		System.out.println(result);

	}

	public static int getLinhaDoMaiorElemento(int[][] matriz, int minRand) {
		int maior = minRand;
		int linhaDoMaior = -1;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
					linhaDoMaior = i;
				}
			}
		}
		return linhaDoMaior;
	}

	public static int getMinmax(int[][] matriz, int minRand, int maxRand) {
		int linha = Util.getLinhaDoMaiorElemento(matriz, minRand);
		int menor = maxRand;
		for (int j = 0; j < matriz.length; j++) {
			if (matriz[linha][j] < menor) {
				menor = matriz[linha][j];
			}
		}
		return menor;

	}

	public static double getMediaPond(int[] numeros, int[] pesos) {
		int numerador = 0, denominador = 0;
		double mediaPond = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			numerador += (numeros[i] * pesos[i]);
			denominador += pesos[i];
		}
		mediaPond = (double) numerador / denominador;
		return mediaPond;
	}
	
	public static int[] setVetorNegativo(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = -1;
		}
		return vetor;
	}
}
