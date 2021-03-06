package RecuperacaoParalelaFinal.Ex8;

public class Estoque {
	private final int tam = 10;
	private static int qtdEstoques = 0;
	private int codigo;
	private Produto[] estoque = new Produto[tam];
	private int qtdProdutos = 0;

	public Estoque() {
		Estoque.qtdEstoques++;
		this.codigo = Estoque.qtdEstoques;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Produto[] getEstoque() {
		return estoque;
	}

	public void setEstoque(Produto[] estoque) {
		this.estoque = estoque;
	}

	public void addProduto(Produto p1) {
		this.estoque[qtdProdutos] = p1;
		this.qtdProdutos++;
	}

	public void removerProduto(Produto p1) {
		Produto[] novoEstoque = new Produto[tam];
		int qtd = 0;
		for (int i = 0; i < this.qtdProdutos; i++) {
			if (this.estoque[i] != p1) {
				novoEstoque[qtd] = this.estoque[i];
				qtd++;
				
			}
		}
		this.qtdProdutos--;
		this.estoque = novoEstoque;
	}

	public Produto getProdutoPorNome(String nome) {
		for (int i = 0; i < this.qtdProdutos; i++) {
			if (this.estoque[i].getNome().
					equalsIgnoreCase(nome)) {
				return this.estoque[i];
			}
		}
		return null;
	}

}