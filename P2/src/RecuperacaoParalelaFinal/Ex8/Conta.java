package RecuperacaoParalelaFinal.Ex8;

import java.util.Scanner;

public class Conta {
	private static int qtd;
	// private String titular;
	private Pessoa titular;
	private double saldo, limiteCredito;

	// Se você só informou o nome,
	// cria Conta com dados padrão
	public Conta(Pessoa titular) {
		this.titular = titular;
		this.saldo = 0;
		this.limiteCredito = 600;
		Conta.qtd++;
	}

	// Se você informou todos os dados
	// define a Conta com estes
	public Conta(Pessoa titular, double saldo, double limiteCredito) {
		this.titular = titular;
		this.saldo = saldo;
		this.limiteCredito = limiteCredito;
		Conta.qtd++;
	}
	/*
	// Se você só informou o nome,
	// cria Conta com dados padrão
	public Conta(String titular) {
		this.titular = titular;
		this.saldo = 0;
		this.limiteCredito = 600;
		Conta.qtd++;
	}

	// Se você informou todos os dados
	// define a Conta com estes
	public Conta(String titular, double saldo, double limiteCredito) {
		this.titular = titular;
		this.saldo = saldo;
		this.limiteCredito = limiteCredito;
		Conta.qtd++;
	}
	
	public String getNomeCliente() {
		return titular;
	}

	public void setNomeCliente(String nomeCliente) {
		this.titular = nomeCliente;
	}
	 */
	public Pessoa getTitular() {
		return titular;
	}

	public void setTitular(Pessoa titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}

	

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public double getLimiteDisponivel() {
		return this.saldo + this.limiteCredito;
	}

	public boolean validaSaldo(double valor) {
		if (this.getLimiteDisponivel() >= valor) {
			return true;
		} else {
			return false;
		}
	}

	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso !");

	}

	public void sacar(double valor) {
		if (this.validaSaldo(valor)) {
			this.saldo -= valor;
			System.out.println(
					"Saque realizado com sucesso !");
		} else {
			System.out.println(
					"Erro: Saldo insuficiente na conta do " + this.titular);
		}
	}

	public void transferirPara(Conta contaDestino, double valor) {

		// Saca da conta que chamou o método
		this.sacar(valor);

		// Deposita na conta destino
		contaDestino.depositar(valor);

		System.out.println("Transferência realizada com sucesso !");
	}

	@Override
	public String toString() {
		String result = "Dados da conta: \n\n" + "Titular: ";
		String dadosTitular = this.titular.toString();
		result += dadosTitular;
		result += "\nSaldo atual: " + this.saldo 
				+ "\nLimite de Crédito: " + this.limiteCredito;
		return result;
	}

	public static int selecionaContaPorMenu(Scanner entrada) {
		System.out.println("Digite a opção desejada: \n\n" 
				+ "1 - Usar a Conta do Bruno\n"
				+ "2 - Usar a Conta do Pedro\n\n" 
				+ "0 - Sair");

		int op = Integer.valueOf(entrada.nextLine());

		return op;
	}

	public static Conta getContaPorNome(Conta[] vetor, String nome) {
		// Modo 1: "For" convencional
		/*
		 * for (int i = 0; i < contas.length; i++) { if (contas[i].getNomeCliente().
		 * equalsIgnoreCase(nome)) { return contas[i]; } }
		 */

		// Modo 2: For Each
		for (Conta c1 : vetor) {
			if (c1.getTitular().getNome().equalsIgnoreCase(nome)) {
				return c1;
			}
		}
		return null;
	}

	public static int getQtd() {
		return Conta.qtd;
	}

	public static int getProximaPos() {
		return Conta.qtd - 1;
	}
}
