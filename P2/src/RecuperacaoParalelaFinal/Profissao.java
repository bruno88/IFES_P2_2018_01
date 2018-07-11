package RecuperacaoParalelaFinal;

public class Profissao {
	private String nome, formacao;
	private double salarioMedio;
	private int mediaVagasPorAno;

	public Profissao(String nome, String formacao, double salarioMedio, int mediaVagasPorAno) {
		this.nome = nome;
		this.formacao = formacao;
		this.salarioMedio = salarioMedio;
		this.mediaVagasPorAno = mediaVagasPorAno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public double getSalarioMedio() {
		return salarioMedio;
	}

	public void setSalarioMedio(double salarioMedio) {
		this.salarioMedio = salarioMedio;
	}

	public int getMediaVagasPorAno() {
		return mediaVagasPorAno;
	}

	public void setMediaVagasPorAno(int mediaVagasPorAno) {
		this.mediaVagasPorAno = mediaVagasPorAno;
	}

	@Override
	public String toString() {
		return "Profissao [nome=" + nome + ", formacao=" + formacao + ", salarioMedio=" + salarioMedio
				+ ", mediaVagasPorAno=" + mediaVagasPorAno + "]";
	}

}
