package CorreçãoProva2;

public class Voo {
	private final int tam = 4;
	private int numero;
	private String dataEmbarque, dataChegada;
	private Pessoa[][] assentos = new Pessoa[tam][tam];
	
	public Voo (int numero, String data1, String data2) {
		this.numero = numero;
		this.dataEmbarque = data1;
		this.dataChegada = data2;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDataEmbarque() {
		return dataEmbarque;
	}
	public void setDataEmbarque(String dataEmbarque) {
		this.dataEmbarque = dataEmbarque;
	}
	public String getDataChegada() {
		return dataChegada;
	}
	public void setDataChegada(String dataChegada) {
		this.dataChegada = dataChegada;
	}
	public Pessoa[][] getAssentos() {
		return assentos;
	}
	public void setAssentos(Pessoa[][] assentos) {
		this.assentos = assentos;
	}

	public void imprimirMapaDeAssentos() {
		String result = "";

		for (int i = 0; i < this.assentos.length; i++) {
			for (int j = 0; j < this.assentos[0].length; j++) {
				result += assentos[i][j] + "\t";
			}
			result += "\n";

		}
		System.out.println(result);

	}
	
	public boolean validarAssentoLivre(int linha, int coluna) {
		if (this.assentos[linha][coluna] == null) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Voo [numero=" + numero + ", dataEmbarque=" + dataEmbarque + ", dataChegada=" + dataChegada + "]";
	}
	
	
	
}
