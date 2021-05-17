package matematicas;

public class EcuacionSegundoGrado {
	//Atributos
	private double coeficienteA, coeficienteB, coeficienteC;
	
	//Constructores
	public EcuacionSegundoGrado(double coeficienteA, double coeficienteB, double coeficienteC) {
		this.coeficienteA = coeficienteA;
		this.coeficienteB = coeficienteB;
		this.coeficienteC = coeficienteC;
	}

	//Metodos
	public double getDiscriminante() {
		return Math.pow(coeficienteB, 2)- (4*coeficienteA*coeficienteC);
	}
	
	public void calcular() {
		double[] posiblesSoluciones = new double[2];
		posiblesSoluciones[0] = (-coeficienteB + getDiscriminante()) / (2*coeficienteA);
		posiblesSoluciones[1] = (-coeficienteB - getDiscriminante()) / (2*coeficienteA);
		System.out.println("X1 = " + posiblesSoluciones[0] + "\nX2 = " + posiblesSoluciones[1]);
	}
}
