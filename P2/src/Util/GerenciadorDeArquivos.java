package Util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import Arquivos.Pessoa;
import CorreçãoProva3.Aquisicao;
import CorreçãoProva3.Venda;

public class GerenciadorDeArquivos {
	public static void salvar(String fileName, String texto) throws IOException {
		// Neste método, sobreescreve o arquivo
		// anterior, se houver
		FileWriter arquivo = new FileWriter(fileName);
		BufferedWriter gravador = new BufferedWriter(arquivo);

		gravador.write(texto);
		gravador.close();
		arquivo.close();

	}

	public static void salvarComAppend(String fileName, String texto) throws IOException {
		// Neste método, concatena-se o novo texto
		// ao final do arquivo
		// Atenção para segundo parametro "true" (append)
		FileWriter arquivo = new FileWriter(fileName, true);
		BufferedWriter gravador = new BufferedWriter(arquivo);

		gravador.append(texto);
		gravador.newLine();
		gravador.close();
		arquivo.close();

	}

	public static String ler(String fileName) throws IOException {
		String linha = "", result = "";
		FileReader arquivo = new FileReader(fileName);
		BufferedReader leitor = new BufferedReader(arquivo);

		while (linha != null) {
			linha = leitor.readLine();
			if (linha != null) {
				result += linha + "\n";
			}
		}

		leitor.close();
		arquivo.close();

		return result;
	}

	public static Pessoa[] lePreenchendoVetorPessoas(String path) throws IOException {
		final int tam = 10;
		FileReader arquivo = new FileReader(path);
		BufferedReader leitor = new BufferedReader(arquivo);

		String linha = "";
		int qtdPessoas = 0;

		Pessoa[] pessoasCadastradas = new Pessoa[tam];

		while (linha != null) {
			linha = leitor.readLine();
			if (linha != null) {
				String[] vetor = linha.split(";");

				Pessoa novaPessoa = new Pessoa(vetor[0], vetor[1], vetor[2], Integer.parseInt(vetor[3]));

				pessoasCadastradas[qtdPessoas] = novaPessoa;
				qtdPessoas++;
			}
		}

		leitor.close();
		arquivo.close();

		return pessoasCadastradas;
	}

	public static Venda[] lePreenchendoVetorVendas(String path, int numVendas) throws IOException {
		FileReader arquivo = new FileReader(path);
		BufferedReader leitor = new BufferedReader(arquivo);

		String linha = "";
		int qtdVendas = 0;

		Venda[] vendasCadastradas = new Venda[numVendas];

		while (linha != null) {
			linha = leitor.readLine();
			if (linha != null) {
				String[] vetor = linha.split(";");

				Venda novaVenda = new Venda(
						Integer.parseInt(vetor[0]), 
						vetor[1], 
						vetor[2],
						Double.parseDouble(vetor[3]), 
						Integer.parseInt(vetor[4]), 
						Double.parseDouble(vetor[5]),
						vetor[6], 
						vetor[7]);

				vendasCadastradas[qtdVendas] = novaVenda;
				qtdVendas++;
			}
		}

		leitor.close();
		arquivo.close();

		return vendasCadastradas;

	}
	
	public static Aquisicao[] lePreenchendoVetorAquis(String path, int numAquisicoes) throws IOException {
		FileReader arquivo = new FileReader(path);
		BufferedReader leitor = new BufferedReader(arquivo);

		String linha = "";
		int qtdAquisicoes = 0;

		Aquisicao[] aquisCadastradas = new Aquisicao[numAquisicoes];

		while (linha != null) {
			linha = leitor.readLine();
			if (linha != null) {
				String[] vetor = linha.split(";");

				Aquisicao novaAquisicao = new Aquisicao(
						Integer.parseInt(vetor[0]), 
						vetor[1], 
						vetor[2],
						Double.parseDouble(vetor[3]), 
						Integer.parseInt(vetor[4]), 
						vetor[5],
						vetor[6], 
						vetor[7]);

				aquisCadastradas[qtdAquisicoes] = novaAquisicao;
				qtdAquisicoes++;
			}
		}

		leitor.close();
		arquivo.close();

		return aquisCadastradas;

	}

}
