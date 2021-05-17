package casa;

public class Lavadora extends Electrodomestico {
	
	//Atributos
	private int carga;
	private final int CARGA_POR_DEFECTO = 5;
	
	//Constructores
	public Lavadora() {
		super();
		this.carga = CARGA_POR_DEFECTO;
	}
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga = CARGA_POR_DEFECTO;
	}
	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	//Getters
	public int getCarga() {
		return carga;
	}
	
	//Setters
	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	
	//Metodos
	@Override
	public void precioFinal() {
		super.precioFinal();
		if (this.carga > 30) {
			this.precioBase+= 50; 
		}
	}
	
	
	
}
