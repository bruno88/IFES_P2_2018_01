package Introducao;

public class MostrarEmSala {
	public static void main(String[] args) {
//https://stackoverflow.com/questions/12072727/duplicating-objects-in-java
		int a, b;
		a = 10;
		b = a;
		imprimeAB(a,b);
		b++;
		imprimeAB(a,b);
		a++;
		imprimeAB(a,b);
		
	}
	public static void imprimeAB(int a, int b) {
		System.out.println("==== Imprimindo ===");
		System.out.println("A = " + a );
		System.out.println("B = " + b );
		System.out.println("==== Fim da Impressão ===");
	}
}
