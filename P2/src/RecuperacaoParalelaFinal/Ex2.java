package RecuperacaoParalelaFinal;

import java.io.IOException;

import Util.GerenciadorDeArquivos;

public class Ex2 {
	public static void main(String[] args) {
		final String path = "src/ArquivosSaida/RecFinalEx2.txt";
		Profissao prof1 = new Profissao("Programador", "computação", 2000.0, 20);
		Profissao prof2 = new Profissao("Analista de Sistemas", "computação", 2000.0, 15);
		Profissao prof3 = new Profissao("Engenheiro de Software", "computação", 2500.0, 10);

		Controle.addProfissao(prof1);
		Controle.addProfissao(prof2);
		Controle.addProfissao(prof3);
		try {
			for (int i = 0; i < Controle.getQtdProfissoes(); i++) {
				GerenciadorDeArquivos.salvarComAppend(path, Controle.getProfissoes()[i].toString());
			}
			System.out.println("Arquivo salvo com sucesso!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
