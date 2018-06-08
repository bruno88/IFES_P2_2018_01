package POO;

public class GerenciarCoordenada {
	private final static int tam = 10;
	private static int qtdCoord = 0;
	private static Coordenada[] coordenadas = new Coordenada[tam];

	public static Coordenada[] getCoordenadas() {
		return GerenciarCoordenada.coordenadas;
	}

	public static void setCoordenadas(Coordenada[] coordenadas) {
		GerenciarCoordenada.coordenadas = coordenadas;
	}

	public static void addCoordenada(Coordenada c1) {
		GerenciarCoordenada.coordenadas[qtdCoord] = c1;
		qtdCoord++;
	}
	
	public static double achaDistancia(Coordenada c1,
									Coordenada c2) {
		double distancia = 
				Math.sqrt(
						Math.pow(
								(c1.getEixoX() - 
								c2.getEixoX()),2 ) +
						Math.pow(
								(c1.getEixoY() - 
								c2.getEixoY()),2 ));
		
		return distancia;
	}
	

}
