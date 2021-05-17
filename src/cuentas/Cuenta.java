/**
 * 
 */
package cuentas;

/**
 * @author Alumno
 *
 */
public class Cuenta {
	//Atributos
	private String titularCuenta;
	private double saldoCuenta;
	//Constructores
	public Cuenta(String titularCuenta, double saldoCuenta) {
		this.titularCuenta = titularCuenta;
		this.saldoCuenta = saldoCuenta;
	}
	public Cuenta(String titularCuenta) {
		this.titularCuenta = titularCuenta;
	}
	
	//Getters
	/**
	 * @return the titularCuenta
	 */
	public String getTitularCuenta() {
		return titularCuenta;
	}
	/**
	 * @return the saldoCuenta
	 */
	public double getSaldoCuenta() {
		return saldoCuenta;
	}
	
	//Setters
	/**
	 * @param titularCuenta the titularCuenta to set
	 */
	public void setTitularCuenta(String titularCuenta) {
		this.titularCuenta = titularCuenta;
	}
	/**
	 * @param saldoCuenta the saldoCuenta to set
	 */
	public void setSaldoCuenta(double saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}
	
	@Override
	public String toString() {
		return "Cuenta [titularCuenta=" + titularCuenta + ", saldoCuenta=" + saldoCuenta + "]";
	}
	
	//Metodos
	public void ingresar(double cantidadAIngresar) {
		if (cantidadAIngresar > 0) {
			setSaldoCuenta(this.saldoCuenta + cantidadAIngresar);
		}		
	}
	
	public void retirar(double cantidadARetirar) {
		if (this.saldoCuenta - cantidadARetirar < 0) {
			setSaldoCuenta(0.0);
		}
		else {
			setSaldoCuenta(this.saldoCuenta - cantidadARetirar);
		}
	}
}