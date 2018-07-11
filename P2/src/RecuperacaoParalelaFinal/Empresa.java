package RecuperacaoParalelaFinal;

public class Empresa {
	private String nome, CNPJ, ramoAtiv;
	private int qtdEmpregados;
	private double patrimonioAtual, receitaAnual;

	public Empresa(String nome, String cNPJ, String ramoAtiv, int qtdEmpregados, double patrimonioAtual,
			double receitaAnual) {
		this.nome = nome;
		CNPJ = cNPJ;
		this.ramoAtiv = ramoAtiv;
		this.qtdEmpregados = qtdEmpregados;
		this.patrimonioAtual = patrimonioAtual;
		this.receitaAnual = receitaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getRamoAtiv() {
		return ramoAtiv;
	}

	public void setRamoAtiv(String ramoAtiv) {
		this.ramoAtiv = ramoAtiv;
	}

	public int getQtdEmpregados() {
		return qtdEmpregados;
	}

	public void setQtdEmpregados(int qtdEmpregados) {
		this.qtdEmpregados = qtdEmpregados;
	}

	public double getPatrimonioAtual() {
		return patrimonioAtual;
	}

	public void setPatrimonioAtual(double patrimonioAtual) {
		this.patrimonioAtual = patrimonioAtual;
	}

	public double getReceitaAnual() {
		return receitaAnual;
	}

	public void setReceitaAnual(double receitaAnual) {
		this.receitaAnual = receitaAnual;
	}

	@Override
	public String toString() {
		return "Empresa [nome=" + nome + ", CNPJ=" + CNPJ + ", ramoAtiv=" + ramoAtiv + ", qtdEmpregados="
				+ qtdEmpregados + ", patrimonioAtual=" + patrimonioAtual + ", receitaAnual=" + receitaAnual + "]";
	}

}
