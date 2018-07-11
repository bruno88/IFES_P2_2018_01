package RecuperacaoParalelaFinal;

public class Ex1 {
	public static void main(String[] args) {
		// Passo 1: Instancie 3 profissões diferentes e
		// adicione 2 delas no vetor da classe Controle
		Profissao prof1 = new Profissao("Programador", "computação", 2000.0, 20);
		Profissao prof2 = new Profissao("Analista de Sistemas", "computação", 2000.0, 15);
		Profissao prof3 = new Profissao("Engenheiro de Software", "computação", 2500.0, 10);

		Controle.addProfissao(prof1);
		Controle.addProfissao(prof2);

		// Passo 2: Remova uma profissão e adicione 
		// a terceira no lugar da que foi removida
		Controle.removeProfissao(prof2);
		Controle.addProfissao(prof3);

		// Passo 3: Consulte uma profssso dado o nome e recupere o objeto
		Profissao profConsultada = Controle.getProfissaoPorNome("Programador");
		
		// Passo 4: Imprima o toString() deste objeto
		System.out.println(profConsultada.toString());
	}
}
