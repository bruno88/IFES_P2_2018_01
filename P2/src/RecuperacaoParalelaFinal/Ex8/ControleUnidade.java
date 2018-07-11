package RecuperacaoParalelaFinal.Ex8;

public class ControleUnidade {
	private static final int tam = 10;
	private static 
	Unidade[] unidades = new Unidade[tam];
	private static int qtd = 0;

	public static Unidade[] getUnidades() {
		return unidades;
	}

	public static void setUnidades(Unidade[] unidades) {
		ControleUnidade.unidades = unidades;
	}

	public static void addUnidade(Unidade unidade) {
		ControleUnidade.unidades
			[ControleUnidade.qtd] = unidade;
		ControleUnidade.qtd++;

	}

	public static void removeUnidade(Unidade unidadeRemov) {
		Unidade[] novoUnidades = new Unidade[tam];
		int novaQtd = 0;
		for (int i = 0; i < ControleUnidade.qtd; i++) {
			if (unidades[i] != unidadeRemov) {
				novoUnidades[novaQtd] = unidades[i];
				novaQtd++;
				
			}
		}
		ControleUnidade.qtd--;
		ControleUnidade.unidades = novoUnidades;
	}

	public static Unidade getUnidadePorNome(String nome) {
		for (int i = 0; i < ControleUnidade.qtd; i++) {
			if (unidades[i].getNome().equalsIgnoreCase(nome)) {
				return unidades[i];
			}
		}
		return null;
	}
	
	

}