package CorreçãoProva2;

import POO.ControleUnidade;
import POO.Unidade;

public class GerenciarVoo {
	private final static int tam = 10;
	private static int qtdVoo = 0;
	private static Voo[] voos = new Voo[tam];

	public static Voo[] getVoos() {
		return GerenciarVoo.voos;
	}

	public static void setVoos(Voo[] coordenadas) {
		GerenciarVoo.voos = coordenadas;
	}

	public static void addVoo(Voo c1) {
		GerenciarVoo.voos[qtdVoo] = c1;
		qtdVoo++;
	}
	
	public static void removeVoo(Voo vooRemove) {
		Voo[] novoVoos = new Voo[tam];
		int novaQtd = 0;
		for (int i = 0; i < GerenciarVoo.qtdVoo; i++) {
			if (voos[i] != vooRemove) {
				novoVoos[novaQtd] = voos[i];
				novaQtd++;
				GerenciarVoo.qtdVoo--;
			}
		}
		
		GerenciarVoo.voos = novoVoos;
	}
	
	public static Voo getVooPorNumero(
			int numero) {
		for (int i = 0; i < 
				GerenciarVoo.qtdVoo; i++) {
			if (voos[i].getNumero() == numero) {
				return voos[i];
			}
		}
		return null;
	}
	
	public static void listaTodosVoos() {
		for (int i = 0; i < GerenciarVoo.qtdVoo; i++) {
			System.out.println(voos[i].toString());
		}
	}

}
