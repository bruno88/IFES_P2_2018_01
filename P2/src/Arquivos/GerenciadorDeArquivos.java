package Arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GerenciadorDeArquivos {
	public static void salvar(String fileName, String texto) throws IOException {
		// Atenção para o "append true"
		FileWriter arquivo = new FileWriter(fileName);
		BufferedWriter gravador = new BufferedWriter(arquivo);

		gravador.append(texto);
		gravador.close();
		arquivo.close();

	}
	
	public static void salvarComAppend(String fileName, String texto) throws IOException {
		// Atenção para o "append true"
		FileWriter arquivo = new FileWriter(fileName, true);
		BufferedWriter gravador = new BufferedWriter(arquivo);

		gravador.append(texto);
		gravador.close();
		arquivo.close();

	}

	public static String ler(String fileName) throws IOException {
		String linha = "", result = "";
		FileReader arquivo = new FileReader(fileName);
		BufferedReader leitor = new BufferedReader(arquivo);

		while ((linha = leitor.readLine()) != null) {
			result += linha + "\n";
		}

		leitor.close();
		arquivo.close();

		return result;
	}

}
