package ConteudoProva1;

public class Utils {
	public static int soma(int numA, int numB) {
		int result = numA + numB;
		return result;
	}

	public static int geraIntAleatorio(int min, int max) {
		int intAleatorio = (int) 
				(min + (Math.random() * max));
		return intAleatorio;
	}

	public static double calculaMediaArit(int[] vetor)  {
		int soma = 0;
		double media;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		media = (double) soma / vetor.length;
		return media;
	}

	public static void imprimeVetorInt(int[] vetor) {
		String result = "";
		for (int i = 0; i < vetor.length; i++) {
			result += vetor[i] + " ";
		}
		System.out.println(result);
	}
}
