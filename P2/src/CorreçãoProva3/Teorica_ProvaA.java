package CorreçãoProva3;

import Util.Util;

public class Teorica_ProvaA {
	public static void main(String[] args) {
		int[] vetorProvaA = { 1, 13, 17, 19, 22, 22, 26, 27, 30, 36, 44, 45, 89, 104, 112, 139, 141, 143, 150, 154 };
		
		System.out.println("ProvaA (iniciada em 1): ");
		Util.imprimeVetorInt(vetorProvaA);
		System.out.println("A. " + Util.buscaBinaria(vetorProvaA, 44));
		System.out.println("B. " + Util.buscaBinaria(vetorProvaA, 142));
		System.out.println("C. " + Util.buscaSequencial(vetorProvaA, 150));
		/*System.out.println("C. " + Util.buscaSequencial(vetorProvaA, termo));
		System.out.println("B. " + Util.buscaBinaria(vetorProvaA, termo));*/
	}
}
