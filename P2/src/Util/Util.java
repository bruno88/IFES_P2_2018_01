package Util;

public class Util {
	public static int soma(int numA, int numB) {
		int result = numA + numB;
		return result;
	}

	public static int geraIntAleatorio(int min, int max) {
		int intAleatorio = (int) (min + (Math.random() * max));
		// int intAleatorio = min + (int)(Math.random() * ((max - min) + 1));
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
	public static void imprimeVetorInt(int[] vetor) {
		String result = "";
		for (int i = 0; i < vetor.length; i++) {
			result += vetor[i] + " ";
		}
		System.out.println(result);
	}

	public static double getNumeroAbs(double numero) {
		return Math.abs(numero);
	}

	public static int[] getVetorIntAleatorio1(int[] vetor, int min, int max) {

		// Popula o vetor com aleatórios de min a max
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Util.geraIntAleatorio(min, max);
		}
		return vetor;
	}

	public static void getVetorIntAleatorio2(int[] vetor, int min, int max) {

		// Popula o vetor com aleatórios de min a max
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Util.geraIntAleatorio(min, max);
		}

	}

	public static int getMinutosFromHoras(int horas) {
		return horas*60;
	}
	
	public static int getSegundosFromHoras(int horas) {
		return horas*3600;
	}
	public static int getSegundosFromMinutos(int horas) {
		return horas*60;
	}
}
