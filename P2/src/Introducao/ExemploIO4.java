package Introducao;

public class ExemploIO4 {

	public static void main(String[] args) {

		//
		String nome = "bruno";

		System.out.println(nome.toUpperCase());

		if (nome.toLowerCase().equalsIgnoreCase("bruno")) {
			System.out.println("nomes iguais");
		} else {
			System.out.println("nomes diferentes");
		}

	}

}
