package POO;

import java.util.Scanner;

public class Conta {
	private String nomeCliente;
	private double saldo, limiteCredito;

	// Se voc� s� informou o nome,
	// cria Conta com dados padr�o
	public Conta(String nomeCliente) {
		this.nomeCliente
		= nomeCliente;
		this.saldo = 0;
		this.limiteCredito = 600;
	}

	// Se voc� informou todos os dados
	// define a Conta com estes
	public Conta(String nomeCliente, 
			double saldo, 
			double limiteCredito) {
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
		this.limiteCredito = limiteCredito;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
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
		System.out.println("Dep�sito realizado com sucesso !");

	}

	public void sacar(double valor) {
		if (this.validaSaldo(valor)) {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso !");
		} else {
			System.out.println("Erro: Saldo insuficiente na conta do " + this.nomeCliente);
		}
	}

	public void transferirPara(Conta contaDestino, double valor) {
		
			// Saca da conta que chamou o m�todo
			this.sacar(valor);
			
			// Deposita na conta destino
			contaDestino.depositar(valor);
			
			System.out.println("Transfer�ncia realizada com sucesso !");
		
	}
	
	@Override
	public String toString() {
		return "Dados da conta: \n\nNome do Cliente: " + this.nomeCliente
				+ "\nSaldo atual: " + this.saldo 
				+ "\nLimite de Cr�dito: " + this.limiteCredito;
	}

	public static int selecionaContaPorMenu(Scanner entrada) {
		System.out.println("Digite a op��o desejada: \n\n" 
				+ "1 - Usar a Conta do Bruno\n"
				+ "2 - Usar a Conta do Pedro\n\n"
				+ "0 - Sair");
		
		int op = Integer.valueOf(entrada.nextLine());

		return op;
	}

	public static Conta getContaPorNome(Conta[] contas, String nome) {
		// Modo 1: "For" convencional
		for (int i = 0; i < contas.length; i++) {
			if (
				contas[i].getNomeCliente().
							equalsIgnoreCase(nome)) {
				return contas[i];
			}
		}
		
		// Modo 2: For Each
		/*for (Conta conta : contas) {
			if (conta.getNomeCliente().equalsIgnoreCase(nome)) {
				return conta;
			}
		}*/
		return null;
	}

}
