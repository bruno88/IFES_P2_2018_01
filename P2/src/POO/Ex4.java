package POO;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		final int tam = 10;
		int op_menu, op_submenu;
		boolean continua_menu = true, continua_submenu = true;
		Scanner entrada = new Scanner(System.in);
		Pessoa[] pessoas = new Pessoa[tam];
		Pessoa novaPessoa;
		Unidade novaUnidade;
		Produto novoProduto;
		int qtdPessoas = 0;
		String nome;
		Estoque estoque = new Estoque();
		
		do {
			try {				
				System.out.println("Digite a opção desejada: \n\n" 
						+ "1 - Gerenciar Pessoas\n"
						+ "2 - Gerenciar Unidades\n"
						+ "3 - Gerenciar Produtos\n"
						+ "4 - Converter unidades\n\n"
						+ "0 - Sair");

				op_menu = Integer.valueOf(entrada.nextLine());
				switch (op_menu) {
				case 1:
					do {
						System.out.println("Digite a opção desejada: \n\n" 
								+ "1 - Cadastrar Pessoa\n"
								+ "2 - Consultar Pessoa\n\n" 
								+ "0 - Retornar ao menu anterior");

						op_submenu = Integer.valueOf(entrada.nextLine());
						
						switch (op_submenu) {
						case 1:
							System.out.println("Digite o nome da Pessoa");
							nome = entrada.nextLine(); 
							Pessoa p1 = new Pessoa(nome);
							pessoas[qtdPessoas] = p1;
							qtdPessoas++;
							System.out.println("Pessoa " + nome + " criada com sucesso!");
							break;
						case 2:
							System.out.println("Digite o nome da Pessoa");
							nome = entrada.nextLine();
							novaPessoa = consultarPessoa(nome, qtdPessoas, pessoas);
							if (novaPessoa != null) {
								System.out.println(novaPessoa.toString());
							} else {
								System.out.println("Pessoa não encontrada!");
							}
							break;
						case 0:
							continua_submenu = false;
							break;
						default:
							System.out.println("Entrada invalida");
						}
					}

					while (continua_submenu);
					break;
				
				case 2:
					do {
						System.out.println("Digite a opção desejada: \n\n" 
								+ "1 - Cadastrar Unidade\n"
								+ "2 - Excluir Unidade\n"
								+ "3 - Consultar Unidade\n\n"
								+ "0 - Retornar ao menu anterior");

						op_submenu = Integer.valueOf(entrada.nextLine());
					
						switch (op_submenu) {
						case 1:
							System.out.println("Digite o nome da Unidade");
							nome = entrada.nextLine();
							System.out.println("Digite o valor da Unidade");
							double valor = Double.valueOf(entrada.nextLine());
							novaUnidade = new Unidade(nome, valor);
							ControleUnidade.addUnidade(novaUnidade);
							System.out.println("Unidade " + novaUnidade.getNome() + " criada com sucesso!");
							break;
						case 2:
							System.out.println("Digite o nome da Unidade");
							nome = entrada.nextLine();
							novaUnidade = ControleUnidade.getUnidadePorNome(nome);
							if (novaUnidade != null) {
								ControleUnidade.removeUnidade(novaUnidade);
								System.out.println("Unidade removida com sucesso !");
							} else {
								System.out.println("Unidade não encontrada !");
							}
							
							break;
						case 3:
							System.out.println("Digite o nome da Unidade");
							nome = entrada.nextLine();
							novaUnidade = ControleUnidade.getUnidadePorNome(nome);
							if (novaUnidade != null) {
								System.out.println(novaUnidade.toString());
							} else {
								System.out.println("Unidade não encontrada !");
							}

							break;
						case 0:
							continua_submenu = false;
							break;
						default:
							System.out.println("Entrada invalida");
						}
					}

					while (continua_submenu);
					break;
				case 3:
					do {
						System.out.println("Digite a opção desejada: \n\n" 
								+ "1 - Cadastrar Produto\n"
								+ "2 - Excluir Produto\n"
								+ "3 - Consultar Produto\n\n"
								+ "0 - Retornar ao menu anterior");

						op_submenu = Integer.valueOf(entrada.nextLine());
					
						switch (op_submenu) {
						case 1:
							System.out.println("Digite o nome do Produto");
							nome = entrada.nextLine();
							System.out.println("Digite o nome do Fabricante");
							String nomeFabr = entrada.nextLine();
							novaPessoa = consultarPessoa(nomeFabr, qtdPessoas, pessoas);
							System.out.println("Digite o peso do Produto");
							double peso = Double.valueOf(entrada.nextLine());
							System.out.println("Digite a altura do Produto");
							double altura = Double.valueOf(entrada.nextLine());
							System.out.println("Digite o nome da Unidade a ser usada");
							String nomeUnidade = entrada.nextLine();
							novaUnidade = ControleUnidade.getUnidadePorNome(nomeUnidade);
							
							novoProduto = new Produto(nome, novaPessoa, peso, altura, novaUnidade);
							estoque.addProduto(novoProduto);
							
							System.out.println("Produto " + novoProduto.getNome() + " criado com sucesso!");
							break;
						case 2:
							System.out.println("Digite o nome do Produto");
							nome = entrada.nextLine();
							novoProduto = estoque.getProdutoPorNome(nome);
							if (novoProduto != null) {
								estoque.removerProduto(novoProduto);
								System.out.println("Produto removido com sucesso !");
							} else {
								System.out.println("Produto não encontrado !");
							}
							
							break;
						case 3:
							System.out.println("Digite o nome do Produto");
							nome = entrada.nextLine();
							novoProduto = estoque.getProdutoPorNome(nome);
							if (novoProduto != null) {
								System.out.println(novoProduto.toString());
							} else {
								System.out.println("Produto não encontrado !");
							}
							
							break;
						case 0:
							continua_submenu = false;
							break;
						default:
							System.out.println("Entrada invalida");
						}
					} while (continua_submenu);
					break;
				case 4:
					System.out.println("Digite o nome do Produto");
					nome = entrada.nextLine();
					novoProduto = estoque.getProdutoPorNome(nome);
					if (novoProduto != null) {
						System.out.println("Digite o nome da unidade de destino");
						nome = entrada.nextLine();
						novaUnidade = ControleUnidade.getUnidadePorNome(nome);
						if (novaUnidade != null) {
							System.out.println(novoProduto.toString());
							System.out.println("Valor na nova Unidade ("+
									novaUnidade.getNome() + ") = " +
									novoProduto.getUnidade().getValorConvetido(novaUnidade));
						} else {
							System.out.println("Unidade não encontrada !");
						}
						
					} else {
						System.out.println("Produto não encontrado !");
					}
					break;
				case 0:
					System.out.println("Sistema encerrado por comando do usuário!");
					continua_menu = false;
					break;
				default:
					System.out.println("Entrada invalida");
				}
			} catch (Exception e) {
				System.out.println("Erro: " + e);
			}
			continua_submenu = true;
		} while (continua_menu);
		entrada.close();
	}

	public static Pessoa consultarPessoa(String nome, int qtdPessoas, Pessoa[] pessoas) {
		// Consulta no main, porque não temos um ControlePessoa
		for (int i = 0; i < qtdPessoas; i++) {
			if (pessoas[i].getNome().equalsIgnoreCase(nome)) {
				return pessoas[i];
			}
		}
		return null;
	}
}
