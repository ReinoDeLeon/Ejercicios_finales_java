package casa;

public class Televisor extends Electrodomestico {
	//Atributos
	private int resolucionEnPulgadas = 20;
	private boolean sintonizadorTDT	 = false;
	//Constructores
	public Televisor() {
		super();
	}
	public Televisor(double precioBase, double peso) {
		super(precioBase, peso);
	}
	public Televisor(double precioBase, String color, char consumoEnergetico, double peso, int resolucionEnPulgadas, boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucionEnPulgadas 	= resolucionEnPulgadas;
		this.sintonizadorTDT 		= sintonizadorTDT;
	}
	
	
	
	//Getters
	public int getResolucionEnPulgadas() {
		return resolucionEnPulgadas;
	}
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	//Setters
	public void setResolucionEnPulgadas(int resolucionEnPulgadas) {
		this.resolucionEnPulgadas = resolucionEnPulgadas;
	}
	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}
	//Metodos
	@Override
	public void precioFinal() {
		super.precioFinal();
		if (resolucionEnPulgadas > 40) {
			this.precioBase+= precioBase*0.3;
		}
		if (sintonizadorTDT) {
			this.precioBase+= 50;
		}
	}
	
	
}
