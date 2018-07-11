package RecuperacaoParalelaFinal;

import java.io.IOException;

import Util.GerenciadorDeArquivos;

public class Ex7 {
	public static void main(String[] args) {
		final String path = "src/ArquivosSaida/RecFinalEx7.txt";

		Empresa empr1 = new Empresa("PCPe�as", "4321", "inform�tica", 3, 100000.00, 10000.0);

		Controle.addEmpresa(empr1);

		Empresa empresaConsult = Controle.getEmpresaPorNome("PCPe�as");

		int anos = 6;
		double patrimonio = getPatrimonioXAnos(empresaConsult, anos);
		System.out.println(patrimonio);

		try {
			String result = "O patrim�nio atual da empresa " + empresaConsult.getNome() 
					+ " � de "
					+ empresaConsult.getPatrimonioAtual() 
					+ " e espera-se que ele ser� de " 
					+ patrimonio + " em " + anos
					+ " anos.";
			GerenciadorDeArquivos.salvarComAppend(path, result);
			System.out.println("Arquivo atualizado");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static double getPatrimonioXAnos(Empresa empresaConsult, int anos) {
		if (anos == 0) {
			return empresaConsult.getPatrimonioAtual();
		} else {
			return empresaConsult.getReceitaAnual() + getPatrimonioXAnos(empresaConsult, (anos - 1));
		}

	}
}
