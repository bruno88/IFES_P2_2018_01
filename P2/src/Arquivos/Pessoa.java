package Arquivos;

public class Pessoa {
	private String nome, profissao, email;
	private int idade;
	private double peso;

	public Pessoa (String nome, String profissao, 
			String email, int idade)
	{
		this.nome = nome;
		this.profissao = profissao;
		this.email = email;
		this.idade = idade;
		
	}
	
	public Pessoa (String nome, double peso, int idade)
	{
		this.nome = nome;
		this.peso = peso;
		this.idade = idade;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String toSave() {
		String result = "";
		result += this.nome + ";";
		result += this.profissao + ";";
		result += this.email + ";";
		result += this.idade + ";";
		return result;

	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + " (" 
					+ this.profissao + ", " + this.email + " ," + this.idade + ")";
	}
	
	
	
}
