package Arquivos;

public class Ex6 {
	public static void main(String[] args)  {

		String path = "src/Saidas/VetorPessoas.txt";

		try {
			// Leitura do arquivo
			Pessoa[] pessoasCadastradas = GerenciadorDeArquivos.
					lePreenchendoVetorPessoas(path);

			Controle.setPessoas(pessoasCadastradas);
			
			for (int i = 0; i < Controle.getQtdPessoas(); i++) {
				System.out.println(Controle.getPessoas()[i]
								.toString());
			}

		} catch (Exception e) {
			System.out.println("ERRO: " + e.getMessage());
		}

	}
}
