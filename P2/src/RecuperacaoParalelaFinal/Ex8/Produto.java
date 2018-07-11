package RecuperacaoParalelaFinal.Ex8;

public class Produto {
	private String nome;
	private Pessoa fabricante;
	private double peso, altura;
	private Unidade unidade;

	public Produto(
			String nome, 
			Pessoa fabricante, 
			double peso, 
			double altura, 
			Unidade unidade) {
		this.nome = nome;
		this.fabricante = fabricante;
		this.peso = peso;
		this.altura = altura;
		this.unidade = unidade;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pessoa getFabricante() {
		return fabricante;
	}

	public void setFabricante(Pessoa fabricante) {
		this.fabricante = fabricante;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}
	
	@Override
	public String toString() {
		return "Imprimindo dados do produto: \n"
				+ "Nome: " + this.nome
				+ "\nAltura = " + this.altura + ", Peso = " + this.peso
				+ "\nUnidade = " + this.unidade.getNome() + " = " + this.unidade.getQtd()
				+ "\nFabricane: " + this.fabricante.getNome() + " - " + this.fabricante.getCPF();
	}
	
}