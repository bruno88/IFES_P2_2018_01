package Arquivos;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex4 {
	public static void main(String[] args)  {
		final String path1 = "src/Saidas/ArquivoNome.txt";
		final String path2 = "src/Saidas/ArquivoPeso.txt";
		final String path3 = "src/Saidas/ArquivoIdade.txt";
		final int tam = 10;
		
		Pessoa[] pessoas = new Pessoa[tam];
		int pessoasLidas = 0;
		
		try {
		
			String linha1 = "", linha2 = "", linha3 = "";
			FileReader arquivo1 = new FileReader(path1);
			BufferedReader leitor1 = new BufferedReader(arquivo1);
			
			FileReader arquivo2 = new FileReader(path2);
			BufferedReader leitor2 = new BufferedReader(arquivo2);
			
			FileReader arquivo3 = new FileReader(path3);
			BufferedReader leitor3 = new BufferedReader(arquivo3);
			
			while (linha1 != null ||
					linha2 != null ||
					linha3 != null ) {
				linha1 = leitor1.readLine();
				linha2 = leitor2.readLine();
				linha3 = leitor3.readLine();
				
				if (linha1 != null ||
						linha2 != null ||
						linha3 != null ) {
					Pessoa novaPessoa = new Pessoa (
							linha1, 
							Double.parseDouble(linha2), 
							Integer.parseInt(linha3));
					
					pessoas[pessoasLidas] = novaPessoa;
					pessoasLidas++;
				}
			}
			
			leitor1.close();
			leitor2.close();
			leitor3.close();
			arquivo1.close();
			arquivo2.close();
			arquivo3.close();
			
			for (int i = 0; i < pessoasLidas; i++) {
				System.out.println("Nome: " + pessoas[i].getNome() + "\n" +
						"Peso: " + pessoas[i].getPeso() + "\n" +
						"Idade: " + pessoas[i].getIdade() + "\n\n" );
				
			}

		} catch (Exception e) {
			System.out.println("ERRO: " + e.getMessage());
		}

	}
}
