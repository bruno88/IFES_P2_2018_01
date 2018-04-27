package POO;

public class Pessoa {
	private String nome;
	private int idade;

	public Pessoa(String nome) {
		this.nome = nome;
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
	
	public void imprimirSaudacao() {
		System.out.println("Ol�! Seja bem vindo ! "
				+ "Meu nome � " + this.nome);
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + this.nome 
				+ ", idade=" + this.idade + "]";
	}
	
	
	
}
