package CorreçãoProva3;

public class Aquisicao {
	private int codigo, quantidade;
	private String nomeAquisicao, tipoAquisicao, responsavel, descricaoAquisicao, dataAquisicao;
	private double valorUnit;

	public Aquisicao(int codigo, String nomeAquisicao, String tipoAquisicao, double valorUnit, int quantidade,
			String responsavel, String descricaoAquisicao, String dataAquisicao) {
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.nomeAquisicao = nomeAquisicao;
		this.tipoAquisicao = tipoAquisicao;
		this.responsavel = responsavel;
		this.descricaoAquisicao = descricaoAquisicao;
		this.dataAquisicao = dataAquisicao;
		this.valorUnit = valorUnit;
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

	public String getNomeAquisicao() {
		return nomeAquisicao;
	}

	public void setNomeAquisicao(String nomeAquisicao) {
		this.nomeAquisicao = nomeAquisicao;
	}

	public String getTipoAquisicao() {
		return tipoAquisicao;
	}

	public void setTipoAquisicao(String tipoAquisicao) {
		this.tipoAquisicao = tipoAquisicao;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getDescricaoAquisicao() {
		return descricaoAquisicao;
	}

	public void setDescricaoAquisicao(String descricaoAquisicao) {
		this.descricaoAquisicao = descricaoAquisicao;
	}

	public String getDataAquisicao() {
		return dataAquisicao;
	}

	public void setDataAquisicao(String dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}

	public double getValorUnit() {
		return valorUnit;
	}

	public void setValorUnit(double valorUnit) {
		this.valorUnit = valorUnit;
	}

	public double getValorTotal() {
		return this.valorUnit * this.quantidade;

	}

	public int getPeso() {
		int peso = 0;
		switch (this.tipoAquisicao) {
		case "TI":
			peso = 3;
			break;
		case "Marketing":
			peso = 3;
			break;
		case "Escritorio":
			peso = 2;
			break;
		}
		return peso;

	}
	
	@Override
	public String toString() {
		return this.nomeAquisicao;
	}

}
