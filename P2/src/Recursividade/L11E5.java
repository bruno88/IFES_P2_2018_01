package Recursividade;

import java.io.IOException;

import Arquivos.GerenciadorDeArquivos;
import Util.Util;

public class L11E5 {
	public static void main(String[] args) {
		final String path = "src/Saidas/ResultadoEx5.txt";
		final int x = 6;
		try {
			GerenciadorDeArquivos.salvar(path, "");
			int result = Util.resolveEImprimeEquacao(x,path);
			System.out.println(result);
			System.out.println("Arquivo atualizado!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
