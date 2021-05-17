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
	public String ecuacionGeneral() {
		// y = Ax + By + C
		double constanteIndependiente = this.punto.getCoordenadaY() - (this.pendiente * this.punto.getCoordenadaX());
		double valorB = -(constanteIndependiente/this.punto.getCoordenadaY());
		double valorA = -(this.pendiente*valorB);
		return "y = " + valorA + "x + " + valorB + "y + " +constanteIndependiente; 
	}
	public String ecuacionPuntoPendiente() {
		// y = mx + b
		 return "y = pendiente*(X - " + punto.getCoordenadaX() + ") + " + punto.getCoordenadaY();
	}
	public String ecuacionSimetrica() {
		// 1 = x/a + y/b
		double constanteIndependiente = this.punto.getCoordenadaY() - (this.pendiente * this.punto.getCoordenadaX());
		double valorB = -(constanteIndependiente/this.punto.getCoordenadaY());
		double valorA = -(this.pendiente*valorB);
		return "X/" + valorA + " + y/" + valorB + " = 1";
	}
	public boolean perteneceALaRecta(Punto punto) {
		double y = pendiente*punto.getCoordenadaX() + this.punto.getCoordenadaY();
		return y == punto.getCoordenadaY();
	}
	
	public int posicionRelativa(Recta recta) {
		if (this.pendiente == recta.pendiente) {
			return -1;
		}
		else if (this.pendiente != recta.pendiente ) {
			return 0;
		}
		else {
			return 1;
		}
	}
	
	public Punto puntoDeCorte(Recta recta) {
		if (this.pendiente != recta.pendiente ) {
			/*
			 * y = this.pendiente*x + this.punto.getCoordenadaY()
			 * y = recta.pendiente*x + recta.punto.getCoordenadaY()
			 * 
			 */
			double x = (this.punto.getCoordenadaY() - recta.punto.getCoordenadaY()) / (recta.pendiente-this.pendiente);
			double y = this.pendiente*x + this.punto.getCoordenadaY();
			return new Punto (x,y);
		}
		return null;
	}
	
	public double calcularDistancia(Punto punto) {
		double constanteIndependiente = this.punto.getCoordenadaY() - (this.pendiente * this.punto.getCoordenadaX());
		double valorB = -(constanteIndependiente/this.punto.getCoordenadaY());
		double valorA = -(this.pendiente*valorB);
		return (Math.abs((valorA * punto.getCoordenadaX() + valorB * punto.getCoordenadaY() + constanteIndependiente)/ Math.sqrt(Math.pow(valorA, 2)+ Math.pow(valorB, 2))));
	}
	
	public double calcularDistancia(Recta recta) {
		return this.punto.calcularDistancia(recta.punto);
	}
	
	
}
