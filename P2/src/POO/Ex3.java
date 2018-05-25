package POO;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		final int tam = 10;
		
		String nome, CPF;
		int op_menu, op_submenu, idade;
		double valorDigitado, saldo, limite;
		boolean continua_menu = true, 
				continua_submenu = true;
		
		Scanner entrada = new Scanner(System.in);
		
		Conta[] contas = new Conta[tam];
		Pessoa[] pessoas = new Pessoa[tam];
		do {
			try {

				continua_submenu = true;
				
				System.out.println("Digite a opção desejada: \n\n" 
						+ "1 - Gerenciar Contas\n"
						+ "2 - Gerenciar Pessoas\n"
						+ "3 - Realizar Operações\n\n"
						+ "0 - Sair");

				op_menu = Integer.valueOf(entrada.nextLine());
				switch (op_menu) {
				
				// 1 - Gerenciar Contas
				case 1:
					do {
						System.out.println("Digite a opção desejada: \n\n" 
								+ "1 - Cadastrar conta\n"
								+ "2 - Editar Conta\n\n" 
								
								+ "0 - Retornar ao menu anterior");

						op_submenu = Integer.valueOf(entrada.nextLine());
						switch (op_submenu) {
						case 1:
							// busca pessoa titular
							System.out.println("Digite o nome do titular da conta:");
							nome = entrada.nextLine();
							Pessoa pessoaEscolhida = Pessoa.getPessoaPorNome(pessoas, nome);

							if (pessoaEscolhida != null) {
								// lê os dados para Conta
								System.out.println("Digite o saldo inicial:");
								saldo = Double.valueOf(entrada.nextLine());
								System.out.println("Digite o limite de crédito:");
								limite = Double.valueOf(entrada.nextLine());

								// Cria a conta
								Conta novaConta = new Conta(pessoaEscolhida, saldo, limite);

								// adiciona a conta na lista de contas
								contas[Conta.getProximaPos()] = novaConta;

								System.out.println("Conta criada com sucesso !");
							} else {
								System.out.println("Pessoa titular não encontrada");
							}
							break;
						case 2:
							// pesquisa conta
							System.out.println("Digite o nome do titular da conta:");
							nome = entrada.nextLine();
							
							Conta contaEscolhida =
									Conta.getContaPorNome(
											contas, nome);

							if (contaEscolhida != null) {
								// lê novo limite
								System.out.println("Digite o limite de crédito:");
								limite = Double.valueOf(entrada.nextLine());

								contaEscolhida.setLimiteCredito(limite);

								System.out.println("Conta editada com sucesso !");
							} else {
								System.out.println("Conta não encontrada !");
							}

							break;
							
						case 0:
							continua_submenu = false;
							break;

						default:
							System.out.println("Entrada inválida !");
							break;
						}
					} while (continua_submenu);
					break;
					
				// 2 - Gerenciar Pessoas
				case 2:
					do {
						System.out.println("Digite a opção desejada: \n\n" 
								+ "1 - Adicionar Pessoa\n"
								+ "2 - Editar Pessoa\n\n" 
								+ "0 - Retornar ao menu anterior");

						op_submenu = Integer.valueOf(entrada.nextLine());
						switch (op_submenu) {
						case 1:
							// lê os dados
							System.out.println("Digite o nome da pessoa:");
							nome = entrada.nextLine();
							System.out.println("Digite a idade:");
							idade = Integer.valueOf(entrada.nextLine());
							System.out.println("Digite o CPF:");
							CPF = entrada.nextLine();
							
							// Cria a Pessoa
							Pessoa novaPessoa = new Pessoa(nome, idade, CPF);

							// adiciona a Pessoa na lista de Pessoas
							pessoas[Pessoa.getProximaPos()] = novaPessoa;

							System.out.println("Pessoa criada com sucesso !");
							break;
						case 2:
							// pesquisa Pessoa
							System.out.println("Digite o nome da Pessoa: ");
							nome = entrada.nextLine();
							Pessoa pessoaEscolhida = Pessoa.
									getPessoaPorNome(pessoas, nome);

							if (pessoaEscolhida != null) {
								System.out.println("Digite a nova Idade da pessoa: ");
								idade = Integer.valueOf(entrada.nextLine());
								
								pessoaEscolhida.setIdade(idade);
								System.out.println("Idade da Pessoa editada com sucesso !");
								
							} else {
								System.out.println("Pessoa não encontrada !");
							}
							break;
						case 0:
							continua_submenu = false;
							break;

						default:
							System.out.println("Entrada inválida !");
							break;
						}
					} while (continua_submenu);
					break;
					
				// 3 - Realizar Operações
				case 3:
					do {
						System.out.println("Digite a opção desejada: \n\n" 
								+ "1 - Realizar Saque\n"
								+ "2 - Realizar Depósito\n" 
								+ "3 - Realizar Transferência\n"
								+ "4 - Adicionar dependente à Pessoa\n"
								+ "5 - Imprimir dados da conta\n\n" 
								+ "0 - Retornar ao menu anterior");

						op_submenu = Integer.valueOf(entrada.nextLine());
						switch (op_submenu) {
						case 1:
							// pesquisa conta
							System.out.println("Digite o nome do titular da conta:");
							nome = entrada.nextLine();
							Conta contaEscolhida = Conta.getContaPorNome(contas, nome);

							if (contaEscolhida != null) {
								// lê valor a ser sacado
								System.out.println("Digite o valor a ser sacado");
								valorDigitado = Double.valueOf(entrada.nextLine());

								// realiza saque
								contaEscolhida.sacar(valorDigitado);

							} else {
								System.out.println("Conta não encontrada !");
							}
							break;
						case 2:
							// pesquisa conta
							System.out.println("Digite o nome do titular da conta:");
							nome = entrada.nextLine();
							contaEscolhida = Conta.getContaPorNome(contas, nome);

							if (contaEscolhida != null) {
								// lê valor a ser depositado
								System.out.println("Digite o valor a ser depositado");
								valorDigitado = Double.valueOf(entrada.nextLine());

								// realiza deposito
								contaEscolhida.depositar(valorDigitado);
								
							} else {
								System.out.println("Conta não encontrada !");
							}
							break;
						case 3:
							// pesquisa conta origem
							System.out.println("Digite o nome do titular da conta:");
							nome = entrada.nextLine();
							contaEscolhida = Conta.getContaPorNome(contas, nome);

							if (contaEscolhida != null) {
								// pesquisa conta destino
								System.out.println("Digite o nome do titular da conta destino:");
								nome = entrada.nextLine();
								Conta contaDestino = Conta.getContaPorNome(contas, nome);
								
								if (contaDestino != null) {

									// lê valor a ser depositado
									System.out.println("Digite o valor a ser transferido");
									valorDigitado = Double.valueOf(entrada.nextLine());

									// realiza depósito
									contaEscolhida.transferirPara(contaDestino, valorDigitado);

								} else {
									System.out.println("Conta de destino não encontrada !");
								}

							} else {
								System.out.println("Conta de origem não encontrada !");
							}

							break;
						case 4:
							// pesquisa pessoa
							System.out.println("Digite o nome da Pessoa:");
							nome = entrada.nextLine();
							Pessoa pessoaEscolhida = 
									Pessoa.getPessoaPorNome(pessoas, nome); 

							if (pessoaEscolhida != null) {
								// pesquisa dependente
								System.out.println("Digite o nome "
										+ "do Dependente:");
								String nomeDependente = entrada.nextLine();
								Pessoa dependenteEscolhido = 
										Pessoa.getPessoaPorNome(pessoas, 
												nomeDependente); 
								if (dependenteEscolhido != null) {
									// adiciona dependente à pessoa
									pessoaEscolhida.addDependente(
											dependenteEscolhido);
									System.out.println("Dependente " 
											+ dependenteEscolhido.getNome()
									+ " adicionado com sucesso à Pessoa "
											+ pessoaEscolhida.getNome() 
											+ "!");
								} else {
									System.out.println("Dependente não "
											+ "encontrado !");
								}
							} else {
								System.out.println("Pessoa não encontrada !");
							}
							
							
							break;
						case 5:
							// pesquisa conta
							System.out.println("Digite o nome do titular da conta:");
							nome = entrada.nextLine();
							contaEscolhida = Conta.getContaPorNome(contas, nome);

							if (contaEscolhida != null) {
								System.out.println(contaEscolhida.toString() + "\n");

							} else {
								System.out.println("Conta não encontrada !");
							}
							break;
						case 0:
							continua_submenu = false;
							break;

						default:
							System.out.println("Entrada inválida !");
							break;
						}
					} while (continua_submenu);
					break;
				case 0:
					continua_menu = false;
					System.out.println("Programa encerrado por comando do usuário");
					break;

				default:
					System.out.println("Entrada inválida !");
					break;
				}

			} catch (Exception e) {
				System.out.println("Erro: " + e);
			}
		} while (continua_menu);
		entrada.close();
	}
}
