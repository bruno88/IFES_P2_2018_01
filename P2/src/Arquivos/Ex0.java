package Arquivos;

import java.io.IOException;

public class Ex0 {
	public static void main(String[] args) throws IOException {
		int contador = 0;
		String path = "src/Saidas/SaidaEx0.txt";
		String path2 = "src/Saidas/split.txt";
		
		try {
			// Salvando
			while (contador < 5) {
				contador++;
				GerenciadorDeArquivos.salvarComAppend(path, "Entrei pela " + contador + " vez\n");
			}
			System.out.println("Terminei a escrita. Iniciando leitura:\n");
			
			// Lendo
			System.out.println(GerenciadorDeArquivos.ler(path));
			
			// salvando um dado em outro arquivo
			GerenciadorDeArquivos.salvar(path2, "Bruno;29;Professor;brunoclemente88@gmail.com");
			
			// Lendo
			String result = GerenciadorDeArquivos.ler(path2);
			System.out.println(result);
			
			// capturando dados com split 
			
			String[] vetor = new String[4];
			vetor = result.split(";");
			
			System.out.println(vetor[0]);
			System.out.println(vetor[1]);
			System.out.println(vetor[2]);
			System.out.println(vetor[3]);
			
			// Fazendo uso do parseInt (falar do valueOf)
			int idade = Integer.parseInt(vetor[1]);
			System.out.println(idade);
			
		} catch (IOException e) {
			System.out.println("ERRO: " + e.getMessage());
		}

	}
}
