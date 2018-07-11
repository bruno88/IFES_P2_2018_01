package RecuperacaoParalelaFinal;

public class Ex3 {
	public static void main(String[] args) {
		Profissao prof1 = new Profissao("Programador", "computação", 2000.0, 20);
		Profissao prof2 = new Profissao("Analista de Sistemas", "computação", 2000.0, 15);
		Profissao prof3 = new Profissao("Engenheiro de Software", "computação", 2500.0, 10);

		Controle.addProfissao(prof1);
		Controle.addProfissao(prof2);
		Controle.addProfissao(prof3);
		
		double mediaArit = calcularMediaArit(Controle.getProfissoes());
		System.out.println("Media Aritmética = " + mediaArit);
		
	}

	private static double calcularMediaArit(Profissao[] profissoes) {
		return getNumeradorMedia(profissoes, 0) / Controle.getQtdProfissoes();
	}

	private static double getNumeradorMedia(Profissao[] profissoes, int i) {
		if (i == Controle.getQtdProfissoes()) {
			return 0;
		} else {
			return profissoes[i].getSalarioMedio() 
					+ getNumeradorMedia(
							profissoes, (i + 1));
		}
	}
}
