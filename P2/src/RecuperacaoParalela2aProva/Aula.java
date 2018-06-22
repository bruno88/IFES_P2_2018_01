package RecuperacaoParalela2aProva;

import java.util.Arrays;

public class Aula {
	private static final int tam = 5;
	private int qtdAlunos = 0;
	private String nome, diaDaSemana, horario, instrutor;
	private double preco;
	private Pessoa[] alunosInscritos = new Pessoa[tam];

	public Aula(String nome, double preco) {
		this.nome = nome;
		this.diaDaSemana = "Segunda à sexta";
		this.horario = "10:00 às 11:00";
		this.instrutor = "José"	;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDiaDaSemana() {
		return diaDaSemana;
	}

	public void setDiaDaSemana(String diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(String instrutor) {
		this.instrutor = instrutor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Pessoa[] getAlunosInscritos() {
		return alunosInscritos;
	}

	public void setAlunosInscritos(Pessoa[] alunosInscritos) {
		this.alunosInscritos = alunosInscritos;
	}

	public void adicionarAluno(Pessoa aluno) {
		if (!estaCheia()) {
			this.alunosInscritos[this.qtdAlunos] = aluno;
			this.qtdAlunos++;	
			System.out.println(aluno.getNome() + " foi inscrito na aula de "
					+ this.nome);
		} else {
			System.out.println("Não há vagas para a turma de "
					+ this.nome);
		}
		

	}

	public void removerAluno(Pessoa aluno) {
		Pessoa[] novoAlunos = new Pessoa[tam];
		int novaQtd = 0;
		for (int i = 0; i < this.qtdAlunos; i++) {
			if (this.alunosInscritos[i] != aluno) {
				novoAlunos[novaQtd] = this.alunosInscritos[i];
				novaQtd++;
			}
		}

		this.qtdAlunos--;
		this.alunosInscritos = novoAlunos;

	}

	public Pessoa getAlunoPorNome(String nome) {
		for (int i = 0; i < 
				this.qtdAlunos; i++) {
			if (this.alunosInscritos[i].getNome().
					equalsIgnoreCase(nome)) {
				return this.alunosInscritos[i];
			}
		}
		return null;

	}
	
	public boolean estaCheia() {
		if (this.qtdAlunos == this.alunosInscritos.length) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public String toString() {
		return "Aula [nome=" + nome + ", diaDaSemana=" + diaDaSemana + ", horario=" + horario + ", instrutor="
				+ instrutor + ", preco=" + preco + ", alunosInscritos=" + Arrays.toString(alunosInscritos) + "]";
	}

}
