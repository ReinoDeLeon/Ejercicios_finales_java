package geometria;

public class Punto {
	
	//Atributos
	private double coordenadaX;
	private double coordenadaY;
	
	//Constructores
	public Punto(double x, double y) {
		this.coordenadaX = x;
		this.coordenadaY = y;
	}
	
	public Punto() {
		this.coordenadaX = (int) (Math.random()*10);
		this.coordenadaY = (int) (Math.random()*10);
	}

	//Getters
		public double getCoordenadaX() {
		return coordenadaX;
	}

	public double getCoordenadaY() {
		return coordenadaY;
	}
	
	//Setters
	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

	
	//Metodos
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Punto) {
			Punto p = (Punto) obj;
			return (this.coordenadaX == p.coordenadaX) && (this.coordenadaY == p.coordenadaY);
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public String toString() {
		return "Punto [coordenadaX=" + coordenadaX + ", coordenadaY=" + coordenadaY + "]";
	}
	
	public double calcularDistancia(Punto puntoObjetivo) {
		return Math.sqrt((Math.pow(this.coordenadaX - puntoObjetivo.getCoordenadaX(), 2) + Math.pow(this.coordenadaY - puntoObjetivo.getCoordenadaY(), 2)));
	}
	
	public Punto puntoMedioEntreDosPuntos(Punto segundoPunto) {
		Punto p = new Punto((this.getCoordenadaX() + segundoPunto.getCoordenadaX())/2, (this.getCoordenadaY() + segundoPunto.getCoordenadaY())/2);
		return p;
	}
}
