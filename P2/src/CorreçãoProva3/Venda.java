package CorreçãoProva3;

public class Venda {
	private int codigo, quantidade;
	private String nomeProduto, tipoProduto, descricaoProd, dataVenda;
	private double valorUnit, valorImpostos;

	public Venda(int codigo, String nomeProduto, String tipoProduto, double valorUnit, int quantidade,
			double valorImpostos, String descricaoProd, String dataVenda) {

		this.codigo = codigo;
		this.quantidade = quantidade;
		this.nomeProduto = nomeProduto;
		this.tipoProduto = tipoProduto;
		this.descricaoProd = descricaoProd;
		this.dataVenda = dataVenda;
		this.valorUnit = valorUnit;
		this.valorImpostos = valorImpostos;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public String getDescricaoProd() {
		return descricaoProd;
	}

	public void setDescricaoProd(String descricaoProd) {
		this.descricaoProd = descricaoProd;
	}

	public String getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}

	public double getValorUnit() {
		return valorUnit;
	}

	public void setValorUnit(double valorUnit) {
		this.valorUnit = valorUnit;
	}

	public double getValorImpostos() {
		return valorImpostos;
	}

	public void setValorImpostos(double valorImpostos) {
		this.valorImpostos = valorImpostos;
	}

	public double getValorTotal() {
		return (this.valorUnit * this.quantidade) + this.valorImpostos;

	}

	public int getPeso() {
		int peso = 0;
		
		// Usando IF-Else
		/*if (this.tipoProduto.equals("Moveis")) {
			peso = 4;
		} else {
			if (this.tipoProduto.equals("Roupas")) {
				peso = 2;
			} else {
				peso = 1;
			}
		}
		return peso;*/
		
		// Usando Switch-case
		switch (this.tipoProduto) {
		case "Moveis":
			peso = 4;
			break;
		case "Roupas":
			peso = 2;
			break;
		case "Calcados":
			peso = 1;
			break;
		}
		return peso;

	}

	@Override
	public String toString() {
		return this.nomeProduto;
	}

}
