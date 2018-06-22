package RecuperacaoParalela2aProva;

public class Pessoa {
	private String nome;
	private int idade;
	private double altura, peso;
	
	public Pessoa(String nome, int idade, 
			double altura, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
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

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void solicitarMatricula(Academia a1) {
		a1.addPessoa(this);

	}
	
	public void solicitarDesligamento(Academia a1) {
		a1.removerPessoa(this);

	}
	
	public void cadastrarEmAula(Aula aula) {
		aula.adicionarAluno(this);

	}
	
	public void sairDeAula(Aula aula) {
		aula.removerAluno(this);

	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + ", peso=" + peso + "]";
	}
	
	
}
