package Arquivos;

import java.io.IOException;

public class Ex2 {
	public static void main(String[] args) {
		final String path1 = "src/Saidas/ArquivoNome.txt";
		final String path2 = "src/Saidas/ArquivoPeso.txt";
		final String path3 = "src/Saidas/ArquivoIdade.txt";

		try {
			Pessoa p1 = new Pessoa("Bruno", 100.0, 29);
			Controle.inserePessoa(p1);
			Pessoa p2 = new Pessoa("Pedro", 90.0, 28);
			Controle.inserePessoa(p2);
			Pessoa p3 = new Pessoa("João", 50.0, 24);
			Controle.inserePessoa(p3);

			for (int i = 0; i < Controle.getQtdPessoas(); i++) {
				Controle.salvarComAppend(path1, 
						Controle.getPessoas()[i].getNome());
				
				Controle.salvarComAppend(path2, 
						String.valueOf(Controle.getPessoas()[i]
								.getPeso()));
				
				Controle.salvarComAppend(path3, 
						String.valueOf(Controle.getPessoas()[i]
								.getIdade()));
			}
			
			
		} catch (IOException e) {
			System.out.println("Erro: ");
			e.printStackTrace();
		}
	}
}
