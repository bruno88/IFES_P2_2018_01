package POO;

public class Pessoa {
	private String nome, CPF;
	private int idade;
	private Pessoa[] dependentes = new Pessoa[10];
	private static int qtd;
	private int qtdDependentes;
	
	// Mantido aqui só pra não quebrar o "Ex0"
	public Pessoa(String nome) {
		this.nome = nome;
		Pessoa.qtd++;
	}
	
	public Pessoa(String nome, int idade, String CPF) {
		this.nome = nome;
		this.idade = idade;
		this.CPF = CPF;
		Pessoa.qtd++;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	public void imprimirSaudacao() {
		System.out.println("Olá! Seja bem vindo ! "
				+ "Meu nome é " + this.nome);
	}
	
	public static int getQtd() {
		return Pessoa.qtd;
	}

	public static int getProximaPos() {
		return Pessoa.qtd - 1;
	}
	
	public static Pessoa getPessoaPorNome(Pessoa[] vetor, String nome) {
		/*for (Pessoa p1 : vetor) {
			if (p1.getNome().equalsIgnoreCase(nome)) {
				return p1;
			}
		}
		return null;*/
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].getNome().
					equalsIgnoreCase(nome)) {
				return vetor[i];
			}
		}
		return null;
	}
	
	public void addDependente (Pessoa dependente) {
		this.dependentes[this.qtdDependentes] 
				= dependente;
		this.qtdDependentes++;
	}
	
	public String getDependentes() {
		String result = "";
		if (this.qtdDependentes == 0) {
			result = "Não há dependentes";
		} else {
			for (int i = 0; i < 
					this.qtdDependentes; i++) {
				result += "Nome: " 
					+ dependentes[i].getNome() 
					+ "\n";
			}
		}
		return result;
	}
	
	@Override
	public String toString() {
		return "\nImprimindo dados do " + this.nome  
				+ "\nCPF: " + this.CPF 
				+ "\nIdade: " + this.idade
				+ "\nLista de Dependentes: \n" 
				+ this.getDependentes();
	}
	
}
