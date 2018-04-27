package POO;

import Util.Util;

public class Ex0 {

	public static void main(String[] args) {
		// Criado uma referência para um 
		// objeto do tipo "Pessoa"
		Pessoa p1;
		
		// Criando um novo objeto do tipo 
		// Pessoa e guardando a referencia 
		// para este objeto em "p1"
		p1 = new Pessoa("Bruno");
		
		// Imprimindo um atributo 
		// fazendo uso do "getter"
		System.out.println(p1.getNome());
		
		// Imprimindo o toString() de p1
		System.out.println(p1.toString());
		
		// mudando um atributo com
		p1.setIdade(29);
		System.out.println(p1.toString());
		
		// chamando um método de p1
		p1.imprimirSaudacao();
		
		Pessoa p2 = new Pessoa("Pedro");
		
		// chamando um método de p2
		p2.imprimirSaudacao();
		
		// Adicionando pessoas em um vetor
		Pessoa[] pessoas = new Pessoa[10];
		pessoas[0] = p1;
		pessoas[1] = p2;
		
		// Imprimindo o vetor
		System.out.println("\nImprimindo "
				+ "nosso vetor de Pessoas");
		Util.imprimeVetor(pessoas);
	}

}
