package Corre��oProva3;

import Util.GerenciadorDeArquivos;
import Util.Util;

public class Pratica_ProvaB {
	public static void main(String[] args) {
		final int numAquisicoes = 6;
		final String pathEntrada = "src/ArquivosEntrada/aquisicoes.txt";
		final String pathSaida = "src/ArquivosSaida/ResultadosProvaB.txt";
		try {
			Aquisicao[] aquisicoes = 
					GerenciadorDeArquivos.
					lePreenchendoVetorAquis(pathEntrada, numAquisicoes);
			
			double mediaPonderada = Util.getMediaPondRecur(aquisicoes, 0);
			
			String result = "Resultados do relat�rio das Aquisi��es:\n";
			result += "M�dia ponderada das Aquisi��es, conforme peso: " 
							+ mediaPonderada;
			
			GerenciadorDeArquivos.salvar(pathSaida, result);
			System.out.println("Arquivo atualizado!");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
