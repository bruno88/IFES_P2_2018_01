package RecuperacaoParalelaFinal;

public class Controle {
	private static int tam = 10;
	private static int qtdProfissoes = 0;
	private static int qtdEmpresas = 0;
	private static Profissao[] profissoes = new Profissao[tam];
	private static Empresa[] empresas = new Empresa[tam];

	public static int getQtdProfissoes() {
		return qtdProfissoes;
	}

	public static void setQtdProfissoes(int qtdProfissoes) {
		Controle.qtdProfissoes = qtdProfissoes;
	}

	public static Profissao[] getProfissoes() {
		return profissoes;
	}

	public static void setProfissoes(Profissao[] profissoes) {
		Controle.profissoes = profissoes;
	}

	public static void addProfissao(Profissao prof1) {
		Controle.profissoes[qtdProfissoes] = prof1;
		qtdProfissoes++;
	}

	public static void removeProfissao(Profissao prof1) {
		Profissao[] novoProfissoes = new Profissao[tam];
		int novaQtd = 0;
		for (int i = 0; i < Controle.qtdProfissoes; i++) {
			if (Controle.profissoes[i] != prof1) {
				novoProfissoes[novaQtd] = Controle.profissoes[i];
				novaQtd++;
			}
		}
		Controle.qtdProfissoes--;
		Controle.profissoes = novoProfissoes;
	}

	public static Profissao getProfissaoPorNome(String nome) {
		for (int i = 0; i < Controle.qtdProfissoes; i++) {
			if (Controle.profissoes[i].getNome().equalsIgnoreCase(nome)) {
				return Controle.profissoes[i];
			}
		}
		return null;
	}

	public static int getQtdEmpresas() {
		return qtdEmpresas;
	}

	public static void setQtdEmpresas(int qtdEmpresas) {
		Controle.qtdEmpresas = qtdEmpresas;
	}

	public static Empresa[] getEmpresas() {
		return empresas;
	}

	public static void setEmpresas(Empresa[] empresas) {
		Controle.empresas = empresas;
	}
	
	public static void addEmpresa(Empresa empresa) {
		Controle.empresas[qtdEmpresas] = empresa;
		qtdEmpresas++;
	}

	public static void removeEmpresa(Empresa empresa) {
		Empresa[] novoEmpresas = new Empresa[tam];
		int novaQtd = 0;
		for (int i = 0; i < Controle.qtdEmpresas; i++) {
			if (Controle.empresas[i] != empresa) {
				novoEmpresas[novaQtd] = Controle.empresas[i];
				novaQtd++;
			}
		}
		Controle.qtdEmpresas--;
		Controle.empresas = novoEmpresas;
	}

	public static Empresa getEmpresaPorNome(String nome) {
		for (int i = 0; i < Controle.qtdEmpresas; i++) {
			if (Controle.empresas[i].getNome().equalsIgnoreCase(nome)) {
				return Controle.empresas[i];
			}
		}
		return null;
	}
}
