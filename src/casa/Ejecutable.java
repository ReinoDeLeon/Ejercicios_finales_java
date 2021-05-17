package casa;

public class Ejecutable {
	public static void main(String[] args) {
		Electrodomestico[] arrayElectrodomesticos = new Electrodomestico[10];
		double precioElectrodomesticos	= 0;
		double precioTelevisores		= 0;
		double precioLavadoras 			= 0;
		
		arrayElectrodomesticos[0] = new Televisor();
		arrayElectrodomesticos[1] = new Lavadora();
		arrayElectrodomesticos[2] = new Televisor(200, 10);
		arrayElectrodomesticos[3] = new Lavadora();
		arrayElectrodomesticos[4] = new Lavadora(200, "azul", 'B', 30, 45);
		arrayElectrodomesticos[5] = new Electrodomestico();
		arrayElectrodomesticos[6] = new Electrodomestico();
		arrayElectrodomesticos[7] = new Electrodomestico();
		arrayElectrodomesticos[8] = new Electrodomestico(300, "violeta", 'D', 70);
		arrayElectrodomesticos[9] = new Electrodomestico(257.78, "", 'R', 30);
		
		
		for (int i = 0; i < arrayElectrodomesticos.length; i++) {
			if (arrayElectrodomesticos[i] instanceof Lavadora) {
				arrayElectrodomesticos[i].precioFinal();
				precioLavadoras+= arrayElectrodomesticos[i].getPrecioBase();
				precioElectrodomesticos+= arrayElectrodomesticos[i].getPrecioBase();
			}
			else if (arrayElectrodomesticos[i] instanceof Televisor) {
				arrayElectrodomesticos[i].precioFinal();
				precioTelevisores+= arrayElectrodomesticos[i].getPrecioBase();
				precioElectrodomesticos+= arrayElectrodomesticos[i].getPrecioBase();
			}
			else {
				arrayElectrodomesticos[i].precioFinal();
				precioElectrodomesticos+= arrayElectrodomesticos[i].getPrecioBase();
			}
		}
		
		System.out.println("El precio total de los electrodomesticos es de: " + precioElectrodomesticos +"€\nEl precio total de las lavadoras es de: " + precioLavadoras +"€\nY el precio total de los televisores es de: " + precioTelevisores + "€");
	}
}
