package seguridad;

public class Password {
	//Atributos
	int longitud;
	String contenido = "";
	//Constructores
	public Password() {
		this.longitud = 8;
		generarPassword();
	}
	public Password(int longitud) {
		
		this.longitud = longitud;
		generarPassword();
	}
	
	
	//Getters
	public int getLongitud() {
		return longitud;
	}
	public String getContenido() {
		return contenido;
	}

	
	//Setters
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	
	//Metodos
	public void generarPassword() {
		/*
		* No incluimos la ñ por que podría ser que la contrasena no se aceptase
		* Ponemos 4 veces los numeros para establecer una probabilidad similar de letra o numero
		* El generador comenzará a dar contraseñas seguras a partir de la longitud 11 incluida
		*/
		String caracteresContrasena = "QqWwEeRrTtYyUuIiOoPpAaSsDdFfGgHhJjKkLlZzXxCcVvBbNnMm0123456789012345678901234567890123456789";
		for (int i = 0; i< longitud;i++) {
			int numeroAleatorioCaracterContrasena = (int) Math.round(Math.random()*91);
			contenido += caracteresContrasena.charAt(numeroAleatorioCaracterContrasena);
		}
	}
	
	public boolean esFuerte() {
		int contadorMayusculasContrasenaFuerte = 0;
		int contadorMinusculasContrasenaFuerte = 0;
		int contadorNumerosContrasenaFuerte = 0;
		
		for (int i=0; i< longitud; i++) {
			if (Character.isLowerCase(contenido.charAt(i))) {
				contadorMinusculasContrasenaFuerte++;
			}
			else if (Character.isUpperCase(contenido.charAt(i))) {
				contadorMayusculasContrasenaFuerte++;
			}
			else {
				contadorNumerosContrasenaFuerte++;
			}
		}
		
		return ((contadorMayusculasContrasenaFuerte > 2) && (contadorMinusculasContrasenaFuerte > 1) && (contadorNumerosContrasenaFuerte > 5));
		
	}
}
