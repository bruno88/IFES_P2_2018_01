package RecuperacaoParalelaFinal;

public class Ex6 {
	public static void main(String[] args) {
		Empresa empr1 = new Empresa("Lojinha ABC", "1234", "conveni�ncia", 6, 20000.00, 5000.0);
		Empresa empr2 = new Empresa("PCPe�as", "4321", "inform�tica", 3, 100000.00, 10000.0);

		Controle.addEmpresa(empr1);
		Controle.addEmpresa(empr2);

		Empresa empresaConsult = Controle.getEmpresaPorNome("PCPe�as");
		System.out.println(empresaConsult.toString());
	}
}
