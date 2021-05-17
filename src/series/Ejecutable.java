package series;

public class Ejecutable {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Serie[] arraySeries 				= new Serie[5];
		Videojuego[] arrayVideojuegos 		= new Videojuego[5];
		int numeroDeSeriesAlquiladas 		= 0;
		int numeroDeVideojuegosAlquilados 	= 0;
		int maximoTemporadas 				= 0;
		int maximoHoras 					= 0;
		int posicionMaximoTemporadas 		= 0;
		int posicionMaximoHoras 			= 0;
		
		for (int i = 0; i < arraySeries.length; i++) {
			arraySeries[i] 			= new Serie();
			if (i == 4) {
				arraySeries[i] 		= new Serie("The clone wars", 7, "Ciencia ficción", "George Lucas");
			}
		}
		for (int i = 0; i < arrayVideojuegos.length; i++) {
			arrayVideojuegos[i] 	= new Videojuego();
			if (i == 4) {
				arrayVideojuegos[i] = new Videojuego("Gears of war", 25);
			}
		}
		
		arraySeries[1].alquilar();
		arraySeries[4].alquilar();
		arrayVideojuegos[2].alquilar();
		
		for (Videojuego videojuego : arrayVideojuegos) {
			if (videojuego.isAlquilado()) {
				numeroDeVideojuegosAlquilados++;
				videojuego.devolver();
			}
		}
		
		for (Serie serie : arraySeries) {
			if (serie.isAlquilado()) {
				numeroDeSeriesAlquiladas++;
				serie.devolver();
			}
		}
		
		for (int i=0; i < arraySeries.length; i++) {
			if (arraySeries[i].getNumeroDeTemporadas() > maximoTemporadas) {
				maximoTemporadas = arraySeries[i].getNumeroDeTemporadas();
				posicionMaximoTemporadas = i;
			}
		}
		
		for (int i=0; i < arrayVideojuegos.length; i++) {
			if (arrayVideojuegos[i].getHorasEstimadas() > maximoHoras) {
				maximoTemporadas = arrayVideojuegos[i].getHorasEstimadas();
				posicionMaximoHoras = i;
			}
		}
		
		System.out.println(arraySeries[posicionMaximoTemporadas].toString());
		System.out.println(arrayVideojuegos[posicionMaximoHoras].toString());
	}
}
