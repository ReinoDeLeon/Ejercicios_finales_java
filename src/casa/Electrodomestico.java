package casa;


public class Electrodomestico {
	
	//Atributos
	
	protected double precioBase = 100;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	private final String COLOR_POR_DEFECTO 	= "Blanco";
	private final char CONSUMO_POR_DEFECTO	= 'F';
	private final double PESO_POR_DEFECTO 	= 5.0;
	private final double PRECIO_POR_DEFECTO = 100;
	//Constructores
	
	public Electrodomestico() {
		this.precioBase 		= PRECIO_POR_DEFECTO;
		this.color 				= COLOR_POR_DEFECTO;
		this.consumoEnergetico 	= CONSUMO_POR_DEFECTO;
		this.peso 				= PESO_POR_DEFECTO;
	}
	
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase			 = precioBase;
		this.peso				 = peso;
		this.color 				= COLOR_POR_DEFECTO;
		this.consumoEnergetico 	= CONSUMO_POR_DEFECTO;
	}

	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso){
		this.precioBase = precioBase;
		if (color == null) {
			this.color 	= COLOR_POR_DEFECTO;
		}
		else {
			this.color  = comprobarColor(color);
		}
		
		this.consumoEnergetico  = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso 				= peso;
	}
	
	//Getters
	
	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}
	
	//Setters

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public void setColor(String color) {
		this.color = comprobarColor(color);
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	//Metodos
	
	private char comprobarConsumoEnergetico(char letra) {
		char[] letrasConsumo = {'A', 'B', 'C', 'D', 'E', 'F'};
		for (int i = 0; i < letrasConsumo.length; i++) {
			if (Character.toUpperCase(letra) == letrasConsumo[i]) {
				return letra;
			}
		}
		
		return CONSUMO_POR_DEFECTO;
	}
	
	private String comprobarColor(String color){
		String[] colores = {"Azul", "Verde", "Rojo", "Naranja", "Violeta", "Índigo", "Amarillo", "Blanco", "Negro"};
		for (String stringColor : colores) {
			if (color.equalsIgnoreCase(stringColor)) {
				return stringColor;
			}
		}
		return COLOR_POR_DEFECTO;
	}
	
	public void precioFinal() {
		switch (consumoEnergetico) {
		case 'A':
			this.precioBase+= 100;
			break;
		case 'B':
			this.precioBase+= 80;
			break;
		case 'C':
			this.precioBase+= 60;
			break;
		case 'D':
			this.precioBase+= 50;
			break;
		case 'E':
			this.precioBase+= 30;
			break;
		default:
			this.precioBase+= 10;
			break;
		}
		if (((int) peso) <= 19) {
			this.precioBase+= 10;
		}
		else if (((int) peso) <= 49 && ((int) peso) >= 20) {
			this.precioBase+= 50;
		}
		else if (((int) peso) <= 79 && ((int) peso) >= 50) {
			this.precioBase+= 80;
		}
		else {
			this.precioBase+= 100;
		}
	}
}
