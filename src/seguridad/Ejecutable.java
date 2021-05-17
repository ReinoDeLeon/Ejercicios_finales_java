package seguridad;
import myScanner.MyScanner;

public class Ejecutable {
	public static void main(String[] args) {
		
		MyScanner scan 				= new MyScanner();
		int numeroAGenerar 			= scan.pedirInt("Introduzca un numero de contrase�as a generar");
		int longitudContrasenas 	= scan.pedirInt("Introduzca la longitud de las contrase�as");
		Password[] contrasenas 		= new Password[numeroAGenerar];
		boolean[] contrasenasSeguras 	= new boolean[numeroAGenerar];
		
		for (int i=0; i< numeroAGenerar; i++) {
			contrasenas[i] = new Password(longitudContrasenas);
			contrasenasSeguras[i] = contrasenas[i].esFuerte();
		}
		for (int i=0; i< numeroAGenerar; i++) {
			System.out.println("La contrase�a: " + contrasenas[i].getContenido() + " es segura: " + contrasenasSeguras[i]);
		}
		
	}
}
