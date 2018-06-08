package POO;

public class Unidade {
	private String nome;
	private double qtd;

	public Unidade(
			String nome, 
			double qtd) {
		this.nome = nome;
		this.qtd = qtd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getQtd() {
		return qtd;
	}

	public void setQtd(double qtd) {
		this.qtd = qtd;
	}

	public double getValorConvetido(Unidade unidDestino) {
		return this.qtd 
				/ 
				unidDestino.qtd;
	}
	
	@Override
	public String toString() {
		return "Imprimindo dados da Unidade: \n\n"
				+ "Nome: " + this.nome
				+ " = " + this.qtd;
	}

}
