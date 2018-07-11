package CorreçãoProva3;

import Util.GerenciadorDeArquivos;
import Util.Util;

public class Pratica_ProvaA {
	public static void main(String[] args) {
		final int numVendas = 6;
		final String pathEntrada = "src/ArquivosEntrada/vendas.txt";
		final String pathSaida = "src/ArquivosSaida/ResultadosProvaA.txt";
		try {
			Venda[] vendas = GerenciadorDeArquivos.lePreenchendoVetorVendas(pathEntrada, numVendas);
			
			double mediaPonderada = Util.getMediaPondRecur(vendas, 0);
			
			String result = "Resultados do relatório de venda:\n";
			result += "Média ponderada das vendas, conforme peso: " + mediaPonderada;
			
			GerenciadorDeArquivos.salvar(pathSaida, result);
			System.out.println("Arquivo atualizado!");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
