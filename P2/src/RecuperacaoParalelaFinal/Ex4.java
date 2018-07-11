package RecuperacaoParalelaFinal;

import java.io.IOException;
import CorreçãoProva3.Venda;
import Util.GerenciadorDeArquivos;

public class Ex4 {
	public static void main(String[] args) {
		final String pathEntrada = "src/ArquivosEntrada/vendas.txt";
		final int numVendas = 6;
		Venda[] vendas;
		
		try {
			vendas = GerenciadorDeArquivos.lePreenchendoVetorVendas(pathEntrada, numVendas);

			for (int i = 0; i < vendas.length; i++) {
				System.out.println(vendas[i].toString());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
