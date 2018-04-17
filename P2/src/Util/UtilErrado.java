package Util;

import Metodos.Extra3;
import Metodos.L2E7;
import Metodos.L3E1;
import Metodos.L3E5;
import Metodos.L3E6;
import Metodos.L3E7;

public class UtilErrado {
	public static int soma(int numA, int numB) {
		int result = numA + numB;
		return result;
	}

	public static int geraIntAleatorio(int min, int max) {
		int intAleatorio = min + (int) (Math.random() * ((max - min) + 1));
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
	public static void imprimeVetorInt(int[] vetor) throws ArrayIndexOutOfBoundsException {
		String result = "";

		for (int i = 0; i < vetor.length; i++) {
			result += vetor[i] + " ";
		}
		System.out.println(result);

	}

	public static void imprimeVetorInt(int[] vetor, int qtd) {
		String result = "";

		for (int i = 0; i <= (qtd - 1); i++) {
			result += vetor[i] + " ";
		}
		System.out.println(result);
	}

	public static double getNumeroAbs(double numero) {
		return Math.abs(numero);
		/*
		 * if (numero >= 0) { return numero; } else { return (-1)*numero; }
		 */
	}

	public static void getVetorIntAleatorio(int[] vetor, int min, int max) {
		// Popula o vetor com aleatórios de min a max
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = UtilErrado.geraIntAleatorio(min, max);
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

	public static int[] doSelectionSort(int[] vetor) throws ArrayIndexOutOfBoundsException {
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
			isRepetido = UtilErrado.isRepetidoInt(vetor, vetor[i]);
			isOnArray = UtilErrado.isOnArray(repetidos, vetor[i]);
			// Se o número tem repetições E
			// se não está no vetor de repetidos
			if (isRepetido && !isOnArray) {
				repetidos[qtd] = vetor[i];
				qtd++;
			}
		}

		return repetidos;
	}

	public static boolean isOnArray(int[] vetor, int numero) {
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

	public static boolean isOnArray(String[] vetor, String chave) {
		// Quando isOnArray recebe Strings, também precisa
		int cont = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != null && vetor[i].equalsIgnoreCase(chave)) {
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
		for (int i = 0; i <= (conjunto.length - subconjunto.length); i++) {

			cont = 0;
			for (int j = 0; j < subconjunto.length; j++) {
				if (conjunto[i + j] == subconjunto[j]) {
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

		for (int i = 0; i <= (conjunto.length - subconjunto.length); i++) {
			cont = 0;
			for (int j = 0; j < subconjunto.length; j++) {
				if (conjunto[i + j] == subconjunto[j]) {
					cont++;
				}
			}
			if (cont == subconjunto.length) {
				posicoes[L2E7.qtd] = i;
				L2E7.qtd++;
			}

		}
		return posicoes;

	}

	public static void imprimeLocacoesPromocao(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			UtilErrado.imprimeLocacoesPromocao(vetor, i);
		}
	}

	public static void imprimeLocacoesPromocao(int[] vetor, int codPessoa) {
		final int criterio = 15;
		String result = "Cliente " + (codPessoa + 1) + " possui " + vetor[codPessoa] + " locações. "
				+ (vetor[codPessoa] / criterio) + " locações grátis\n";

		System.out.println(result);
	}

	public static void getMatrizIntAleatorio(int[][] matriz, int min, int max) {

		// Popula o vetor com aleatórios de min a max
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = UtilErrado.geraIntAleatorio(min, max);
			}

		}
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

	public static int getMaiorElemento(int[][] matriz, int minRand) {
		int maior = minRand;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
				}
			}
		}
		return maior;
	}

	public static int getMenorElemento(int[][] matriz, int maxRand) {
		int menor = maxRand;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] < menor) {
					menor = matriz[i][j];
				}
			}
		}
		return menor;
	}

	public static int getMinmax(int[][] matriz, int minRand, int maxRand) {
		int linha = UtilErrado.getLinhaDoMaiorElemento(matriz, minRand);
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

	public static void zeraImpares(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 1) {
				vetor[i] = 0;
			}
		}

	}

	public static boolean isPrimo(int numero) {
		int cont = 0;

		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0)
				cont++;
		}

		if (cont == 2) {
			return true;
		} else {
			return false;
		}
	}

	public static int[] getNumerosPrimo(int[] vetor) {
		int[] indicesPrimos = new int[vetor.length];

		for (int i = 0; i < vetor.length; i++) {
			if (UtilErrado.isPrimo(vetor[i]) && !UtilErrado.isOnArray(indicesPrimos, vetor[i])) {
				indicesPrimos[Extra3.qtd] = vetor[i];
				Extra3.qtd++;
			}
		}
		return indicesPrimos;
	}

	public static int[] getIndexOfAllNumerosPrimo(int[] vetor) {
		int[] indicesPrimos = new int[vetor.length];

		for (int i = 0; i < vetor.length; i++) {
			if (UtilErrado.isPrimo(vetor[i])) {
				indicesPrimos[Extra3.qtd] = i;
				Extra3.qtd++;
			}
		}

		return indicesPrimos;
	}

	public static int[] getNMaiores(int[][] matriz, int N) {
		int[] maiores = new int[N];
		int maior = 0;
		while (L3E1.qtd < N) {
			maior = UtilErrado.getMenorElemento(matriz, L3E1.minRand);
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					if (matriz[i][j] > maior && isOnArray(maiores, matriz[i][j])) {
						maior = matriz[i][j];
					}
				}
			}
			maiores[L3E1.qtd] = maior;
			L3E1.qtd++;
		}

		return maiores;
	}

	public static int getIndexOf(String[] login, String novoLogin) {
		for (int i = 0; i < login.length; i++) {
			if (login[i].equalsIgnoreCase(novoLogin)) {
				return i;
			}
		}
		return -1;
	}

	public static int getNumPrimos(int[] vet1) {
		int cont = 0;
		for (int i = 0; i < vet1.length; i++) {
			if (UtilErrado.isPrimo(vet1[i])) {
				cont++;
			}
		}
		return cont;
	}

	public static void salvaHistorico(String operacao, 
			double valor) {
		L3E5.nomeOperHist[L3E5.qtdTransacoes] = operacao;
		L3E5.valorOperHist[L3E5.qtdTransacoes] = valor;
		L3E5.qtdTransacoes++;

	}

	public static void imprimeHistorico() {
		System.out.println("Listando transações:\n");
		for (int i = 0; i < L3E5.qtdTransacoes; i++) {
			System.out.println(
					"Operação " + (i + 1) + ": " 
							+ L3E5.nomeOperHist[i] 
							+ " no valor de: " 
							+ L3E5.valorOperHist[i]);
		}
		System.out.println();

	}

	public static void defineTabuleiro(String[][] tabuleiro) {
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro.length; j++) {
				tabuleiro[i][j] = "_";
			}
		}

	}

	public static void imprimeTabuleiro(String[][] tabuleiro) {
		String result = "";
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro.length; j++) {
				result += tabuleiro[i][j] + " | ";
			}
			result += "\n";
		}
		System.out.println(result);

	}

	public static boolean isTuplaValida(String[][] tabuleiro, int novaLinha, int novaColuna) {
		if (// está no intervalo (entre 0 e 2)
		novaLinha >= 0 
		&& novaLinha < tabuleiro.length 
		&& novaColuna >= 0 
		&& novaColuna < tabuleiro.length
		// E se está livre
		&& tabuleiro[novaLinha][novaColuna] == "_") {
			return true;
		} else {
			return false;
		}
	}

	public static void realizaJogada(String[][] tabuleiro, int novaLinha, int novaColuna, int jogadorAtual) {

		if (jogadorAtual == 1) {
			tabuleiro[novaLinha][novaColuna] = "O";
			L3E6.jogadorAtual = 2;
		} else {
			tabuleiro[novaLinha][novaColuna] = "X";
			L3E6.jogadorAtual = 1;
		}

	}

	public static boolean verificaVitoria(String[][] tabuleiro) {
		for (int i = 0; i < tabuleiro.length; i++) {
			// Checando as Linhas
			if (tabuleiro[i][0].equals(tabuleiro[i][1]) 
					&& tabuleiro[i][0].equals(tabuleiro[i][2])
					&& !tabuleiro[i][0].equals("_")) {
				inverteJogador();
				L3E6.result = "Vitória do jogador " + L3E6.jogadorAtual;
				return false;
			}
			// Checando as Colunas
			if (tabuleiro[0][i].equals(tabuleiro[1][i]) 
					&& tabuleiro[0][i].equals(tabuleiro[2][i])
					&& !tabuleiro[0][i].equals("_")) {
				inverteJogador();
				L3E6.result = "Vitória do jogador " + L3E6.jogadorAtual;
				return false;
			}

			// Verificando a Diagonal Principal
			if (tabuleiro[0][0].equals(tabuleiro[1][1]) 
					&& tabuleiro[0][0].equals(tabuleiro[2][2])
					&& !tabuleiro[0][0].equals("_")) {
				inverteJogador();
				L3E6.result = "Vitória do jogador " + L3E6.jogadorAtual;
				return false;
			}

			// Verificando a Diagonal Invertida
			if (tabuleiro[0][2].equals(tabuleiro[1][1]) 
					&& tabuleiro[0][2].equals(tabuleiro[2][0])
					&& !tabuleiro[0][2].equals("_")) {
				inverteJogador();
				L3E6.result = "Vitória do jogador " + L3E6.jogadorAtual;
				return false;
			}	
		}
		
		if (UtilErrado.verificaEmpate(tabuleiro)) {
			L3E6.result = "Fim de jogo. Não há jogadas disponíveis";
			return false;
		}
		
		return true;

	}

	public static boolean verificaEmpate(String[][] tabuleiro) {
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro.length; j++) {
				if(tabuleiro[i][j].equals("_")){
					return false;
				}
			}
		}
		return true;
	}

	public static void inverteJogador() {
		if (L3E6.jogadorAtual == 1) {
			L3E6.jogadorAtual = 2;
		} else {
			L3E6.jogadorAtual = 1;
		}
	}

	public static int[] adicionarNoVetor(int[] vetor, int numero) {
		if (L3E7.qtdNum < vetor.length) {
			vetor[L3E7.qtdNum] = numero;
			L3E7.qtdNum++;
			return vetor;

		} else {
			// Cria novo vetor
			int[] novoVetor = new int[(vetor.length + 1)];

			// transfere os dados do primeiro vetor pro segundo
			for (int i = 0; i < vetor.length; i++) {
				novoVetor[i] = vetor[i];
			}

			// adiciona o novo número
			novoVetor[L3E7.qtdNum] = numero;
			L3E7.qtdNum++;

			// retorna o novo vetor
			return novoVetor;
		}
	}

	public static int[] removeDoVetor(int[] vetor, int numero) {
		int[] novoVetor = new int[(vetor.length - 1)];

		int novoCont = 0, removidos = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numero && removidos < 1) {
				removidos++;
				L3E7.qtdNum--;
			} else {
				novoVetor[novoCont] = vetor[i];
				novoCont++;
			}
		}
		return novoVetor;
	}
}
