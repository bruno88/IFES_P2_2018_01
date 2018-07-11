package CorreçãoProva3;

import Util.Util;

public class Teorica_ProvaB {
	public static void main(String[] args) {
		int[] vetorProvaB = { 15,19,21,21,22,34,36,55,56,59,61,68,68,69,74,84,91,94,95,100 };
		int termo = 21;
		System.out.println("ProvaB (iniciada em 15): ");
		
		System.out.println("A. " + Util.buscaBinaria(vetorProvaB, 19));
		System.out.println("B. " + Util.buscaBinaria(vetorProvaB, 99));
		System.out.println("C. " + Util.buscaSequencial(vetorProvaB, 68));
		System.out.println("D. " + Util.buscaBinaria(vetorProvaB, termo));
		System.out.println("D. " + Util.buscaSequencial(vetorProvaB, termo));
		 
	}

	
}
