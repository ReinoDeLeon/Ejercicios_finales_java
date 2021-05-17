package personas;

public class Ejecutable {

	public static void main(String[] args) {
		Persona[] arrayPersonas = new Persona[1000];
		
		for (int i = 0; i < arrayPersonas.length; i++) {
			arrayPersonas[i] = new Persona("Pepe");
		}
		
		for (int i = 0; i < arrayPersonas.length - 1; i++) {
            for (int j = 0; j < arrayPersonas.length - i - 1; j++) {
                if (arrayPersonas[j + 1].getEdad() < arrayPersonas[j].getEdad()) {
                    Persona aux = arrayPersonas[j + 1];
                    arrayPersonas[j + 1] = arrayPersonas[j];
                    arrayPersonas[j] = aux;
                }
            }
        }
		
		for (int i = 0; i < arrayPersonas.length; i++) {
			System.out.println("Ordenacion por edad: " + arrayPersonas[i].getEdad());
		}
		
	}
	
}
