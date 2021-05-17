package geometria;

public class Recta {
	
	//Atributos
	private Punto punto;
	private double pendiente;
	
	//Constructores
	public Recta(Punto punto, double pendiente) {
		this.punto = punto;
		this.pendiente = pendiente;
	}
	
	public Recta(Punto puntoInicial, Punto puntoFinal) {
		this.punto = puntoInicial;
		this.pendiente = (puntoFinal.getCoordenadaY() - puntoInicial.getCoordenadaY()) / (puntoFinal.getCoordenadaX() - puntoInicial.getCoordenadaX());
	}
	
	public Recta() {
		this.punto = new Punto();
		Punto puntoSecundario = new Punto();
		this.pendiente = (punto.getCoordenadaY() - puntoSecundario.getCoordenadaY()) / (punto.getCoordenadaX() - puntoSecundario.getCoordenadaX());
	}

	//Getters

	//Setters

	//Metodos
}
