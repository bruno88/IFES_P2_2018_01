package Arquivos;

import java.io.IOException;

public class Ex0 {	
	public static void main(String[] args) throws IOException {
		final int tam = 10;
		Pessoa[] pessoasCadastradas = new Pessoa[tam];
		int qtdPessoas = 0;
		
		int contador = 0;
		
		
		String path = "src/Saidas/SaidaEx0.txt";
		String path2 = "src/Saidas/split.txt";
		
		try {			
			// Salvando
			while (contador < 5) {
				contador++;
				GerenciadorDeArquivos.salvarComAppend(path, "Entrei pela " + contador + " vezes\n");
			}
			System.out.println("Terminei a escrita. Iniciando leitura:\n");
			
			// Lendo
			System.out.println(GerenciadorDeArquivos.ler(path));
			
			// salvando um dado em outro arquivo
			GerenciadorDeArquivos.salvar(path2, 
					"Bruno;29;Professor;brunoclemente88@gmail.com\n");
			GerenciadorDeArquivos.salvarComAppend(path2, 
					"Pedro;23;Aluno;pedro@abc.com\n");
			
			// Lendo
			String result = GerenciadorDeArquivos.ler(path2);
			System.out.println(result);
			
			// capturando dados com split 
			String[] vetor = new String[4];
			// em cada posição do vetor, coloca
			// 1 dado, até o próximo ";"
			vetor = result.split(";");
			
			// Imprimindo as posições do vetor
			System.out.println(vetor[0]);
			System.out.println(vetor[1]);
			System.out.println(vetor[2]);
			System.out.println(vetor[3]);
			
			// Lendo dados do construtor de Pessoa
			String nome = vetor[0];
			int idade = Integer.parseInt(vetor[1]);
			//double altura = Double.parseDouble(vetor[1]);
			String profissao = vetor[2];
			String email = vetor[3];
			
			// Criando uma nova Pessoa com os dados lidos
			Pessoa novaPessoa = new Pessoa(
					nome, profissao, email, idade);
			
			// Adicionando a Pessoa no vetor de Pessoas
			pessoasCadastradas[qtdPessoas] = novaPessoa;
			qtdPessoas++;
			
			// Imprimindo o vetor de Pessoas
			for (int i = 0; i < qtdPessoas; i++) {
				System.out.println("Imprimindo pessoa "
						+ (i+1) + ": " + pessoasCadastradas[i].getNome());
			}

		} catch (Exception e) {
			System.out.println("ERRO: " + e.getMessage());
		}

	}
}
