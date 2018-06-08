package POO;

public class Funcionario {
	static int qtdFunc = 0;
	private String nome, cargo;
	private int qtdFilhos;
	private boolean planoSaude = false;

	public Funcionario(String nome, 
				int qtdFilhos, String cargo) {
		this.nome = nome;
		this.qtdFilhos = qtdFilhos;
		this.cargo = cargo;
		qtdFunc++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getQtdFilhos() {
		return qtdFilhos;
	}

	public void setQtdFilhos(int qtdFilhos) {
		this.qtdFilhos = qtdFilhos;
	}

	public boolean isPlanoSaude() {
		return planoSaude;
	}

	public void setPlanoSaude(boolean planoSaude) {
		this.planoSaude = planoSaude;
	}
	
	public String toString() {
		return "nome: " + this.nome
				+"\n Nº Filhos: " + this.qtdFilhos
				+"\n Cargo: " + this.cargo;
	}
	
	
}
