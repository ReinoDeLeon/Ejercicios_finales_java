package geometria;

public class Segmento {
	//Atributos
	Punto puntoInicial;
	Punto puntoFinal;
	Recta rectaFormada;
	//Constructores
	public Segmento(Punto puntoInicial, Punto puntoFinal) {
		if (puntoInicial != puntoFinal) {
			this.puntoInicial = puntoInicial;
			this.puntoFinal = puntoFinal;
			this.rectaFormada = new Recta(puntoInicial, puntoFinal);
		}
		
	}
	
	//Getters

	//Setters

	//Metodos
}
