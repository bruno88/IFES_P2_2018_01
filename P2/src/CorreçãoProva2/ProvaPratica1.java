package CorreçãoProva2;

public class ProvaPratica1 {
	public static void main(String[] args) {
		Voo v1 = new Voo (747, "12/06/18", "12/06/18");
		Voo v2 = new Voo (384, "12/06/18", "12/06/18");
		GerenciarVoo.addVoo(v1);
		GerenciarVoo.addVoo(v2);
		
		//GerenciarVoo.listaTodosVoos();
		v1.imprimirMapaDeAssentos();
		
		if (v1.validarAssentoLivre(0, 0)) {
			System.out.println("Livre");
		} else {
			System.out.println("Ocupado");
		}
		
		Pessoa p1 = new Pessoa ("Bruno", 29);
		p1.consultarVoos();
		Voo vooConsultado = GerenciarVoo.getVooPorNumero(747);
		p1.consultarAssentosEmVoo(vooConsultado);
		
		p1.escolherAssento(vooConsultado, 0, 0, p1);
		
		p1.consultarAssentosEmVoo(vooConsultado);
		
		Pessoa p2 = new Pessoa ("Pedro", 13);
		
		p2.escolherAssento(vooConsultado, 0, 0, p2);
		
		p2.consultarAssentosEmVoo(vooConsultado);
	}
}
