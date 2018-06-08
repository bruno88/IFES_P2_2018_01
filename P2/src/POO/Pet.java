package POO;

import java.util.Date;

public class Pet {
	private String nome, especie, raca;
	private Date nascimento;
	private double peso;
	
	public Pet(String nome, String especie,
			String raca, Date nascimento,
			double peso) {
		this.nome = nome;
		this.especie = especie;
		this.raca = raca;
		this.nascimento = nascimento;
		this.peso = peso;
	}
	
	public Pet(String nome, String especie,
			String raca) {
		this.nome = nome;
		this.especie = especie;
		this.raca = raca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
