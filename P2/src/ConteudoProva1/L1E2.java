package ConteudoProva1;

import java.util.Scanner;

public class L1E2 {
	public static void main(String[] args) {
		final int tam = 5;
		
		int numA, numB, numC, resp;
		Scanner entrada = new Scanner(System.in);

		try {
			System.out.println("Digite A");
			numA = entrada.nextInt();
			System.out.println("Digite B");
			numB = entrada.nextInt();
			// Chamada da fun��o soma:
			 // Chamada pelo objeto
			 	// resp = utils.soma(numA, numB);
			 // Chamada pela Classe (est�tico)
			    resp = Utils.soma(numA, numB);
			    
			/* for (int i = 0; i < 3; i++) {
				int contagem = 0;
				contagem += i;
			}
			Erro por variavel de bloco
			System.out.println(contagem);
			*/
			System.out.println(resp);
			/*System.out.println("Digite C");
			numC = entrada.nextInt();
			resp = soma(resp, numC);  */

		} catch (Exception e) {
			System.out.print("Deu erro em algum lugar !!");
		}

	}	
}
