package RecuperacaoParalela2aProva;

public class Academia {
	private final int tam = 10;
	private int qtdMembros = 0;
	private Pessoa[] membros = new Pessoa[tam];
	
	public Pessoa[] getMembros() {
		return membros;
	}
	public void setMembros(Pessoa[] membros) {
		this.membros = membros;
	}
	
	public void addPessoa(Pessoa pessoa) {
		this.membros[this.qtdMembros] = pessoa;
		this.qtdMembros++;
	}
	
	public void removerPessoa(Pessoa pessoa) {
		Pessoa[] novosMembros = new Pessoa[tam];
		int novaQtd = 0;
		for (int i = 0; i < this.qtdMembros ; i++) {
			if (membros[i] != pessoa) {
				novosMembros[novaQtd] = membros[i];
				novaQtd++;
			}
		}
		this.qtdMembros--;
		this.membros = novosMembros;

	}
	
	public Pessoa getPessoaPorNome(String nome) {
		for (int i = 0; i < 
				this.qtdMembros; i++) {
			if (this.membros[i].getNome().
					equalsIgnoreCase(nome)) {
				return this.membros[i];
			}
		}
		return null;

	}
	
}
