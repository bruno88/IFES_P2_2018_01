package Arquivos;

import java.io.IOException;

import Util.GerenciadorDeArquivos;

public class Ex6 {
	public static void main(String[] args) {

		String path = "src/Saidas/VetorPessoas.txt";

		try {
			// Leitura do arquivo
			Pessoa[] pessoasCadastradas = GerenciadorDeArquivos.lePreenchendoVetorPessoas(path);

			Controle.setPessoas(pessoasCadastradas);

			for (int i = 0; i < Controle.getQtdPessoas(); i++) {
				System.out.println(Controle.getPessoas()[i].toString());
			}

		} catch (IOException e) {
			System.out.println("ERRO DE LEITURA OU ESCRITA DE ARQUIVOS: " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ERRO DE MANUSEAMENTO DE INDICES: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("ERRO: " + e.getMessage());
		}
	}
}
