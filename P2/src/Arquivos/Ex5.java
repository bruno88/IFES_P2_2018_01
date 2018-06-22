package Arquivos;

public class Ex5 {
	public static void main(String[] args)  {

		final String path = "src/Saidas/VetorPessoas.txt";

		try {
			// Programa de Escrita
			Pessoa p1 = new Pessoa("Bruno", "professor", "abc@gmail.com", 29);
			Controle.inserePessoa(p1);
			Pessoa p2 = new Pessoa("João", "aluno", "def@gmail.com", 25);
			Controle.inserePessoa(p2);
			Pessoa p3 = new Pessoa("Ana", "aluno", "qwe@gmail.com", 21);
			Controle.inserePessoa(p3);
			
			for (int i = 0; i < Controle.getQtdPessoas(); i++) {
				GerenciadorDeArquivos.salvarComAppend(path, 
						Controle.getPessoas()[i].toSave());
			}

		} catch (Exception e) {
			System.out.println("ERRO: " + e.getMessage());
		}

	}
}
