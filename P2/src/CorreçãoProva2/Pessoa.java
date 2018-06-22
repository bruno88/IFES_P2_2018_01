package CorreçãoProva2;

public class Pessoa {
	private static int qtdPessoas = 0;
	private int codigo;
	private String nome;
	private int idade;
	
	public Pessoa (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		Pessoa.qtdPessoas++;
		this.codigo = Pessoa.qtdPessoas;
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

	public int getCodigo() {
		return codigo;
	}
	
	public void consultarVoos () {
		GerenciarVoo.listaTodosVoos();
	}
	
	public void consultarAssentosEmVoo (Voo voo) {
		voo.imprimirMapaDeAssentos();
	}
	
	// Opção 1: Passando a própria pessoa como parâmetro
	public void escolherAssento(Voo voo, int linha, int coluna,
			Pessoa p1) {
		
		if (voo.validarAssentoLivre(linha, coluna)) {
			voo.getAssentos()[linha][coluna] = p1;
			System.out.println("Assento reservado com sucesso!");
		} else {
			System.out.println("ERRO: Assento em uso");
		}
		
	}
	
	// Opção 2: fazendo uso do this (melhor jeito)
	public void escolherAssento(Voo voo, int linha, int coluna) {
		if (voo.validarAssentoLivre(linha, coluna)) {
			voo.getAssentos()[linha][coluna] = this;
			System.out.println("Assento reservado com sucesso!");
		} else {
			System.out.println("ERRO: Assento em uso");
		}
		
	}

	@Override
	public String toString() {
		return nome;
	}
	
	
}
