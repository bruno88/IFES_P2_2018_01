package RecuperacaoParalela2aProva;

public class Principal {
	public static void main(String[] args) {
		Academia santaTeresa = new Academia();
		
		Pessoa p1 = new Pessoa("Bruno", 21, 1, 2);
		p1.solicitarMatricula(santaTeresa);
		
		Pessoa p2 = new Pessoa("Pedro", 22, 1, 2);
		p2.solicitarMatricula(santaTeresa);
		
		Pessoa p3 = new Pessoa("João", 23, 1, 2);
		p3.solicitarMatricula(santaTeresa);
		
		Pessoa p4 = new Pessoa("Maria", 24, 1, 2);
		p4.solicitarMatricula(santaTeresa);
		
		Pessoa p5 = new Pessoa("Ana", 25, 1, 2);
		p5.solicitarMatricula(santaTeresa);
		
		Pessoa p6 = new Pessoa("Alberto", 26, 1, 2);
		p6.solicitarMatricula(santaTeresa);
		
		//santaTeresa.removerPessoa(p5);
		p5.solicitarDesligamento(santaTeresa);		
		
		p5.solicitarMatricula(santaTeresa);
		
		Aula yoga = new Aula("Yoga", 79.99);
		Aula crossfit = new Aula("Crossfit", 99.99);
		
		p1.cadastrarEmAula(yoga);
		p2.cadastrarEmAula(yoga);
		p3.cadastrarEmAula(yoga);
		p4.cadastrarEmAula(yoga);
		p5.cadastrarEmAula(yoga);
		p6.cadastrarEmAula(yoga);
		
		p6.cadastrarEmAula(crossfit);
		
		
	}

}
