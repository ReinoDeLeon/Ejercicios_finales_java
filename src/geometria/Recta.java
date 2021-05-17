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
	public Punto getPunto() {
		return new Punto(this.punto.getCoordenadaX(), this.punto.getCoordenadaY());
	}

	public double getPendiente() {
		return pendiente;
	}

	//Setters
	public void setPunto(Punto punto) {
		this.punto = punto;
	}

	public void setPendiente(double pendiente) {
		this.pendiente = pendiente;
	}
	
	//Metodos
	public void ecuacionGeneral() {
		
	}
	public String ecuacionPuntoPendiente() {
		 return "y = pendiente*(X - " + punto.getCoordenadaX() + ") + " + punto.getCoordenadaY();
	}
	public void ecuacionSimetrica() {
		
	}
}
