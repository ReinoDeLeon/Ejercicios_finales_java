package persona;

import myScanner.MyScanner;

public class Ejecutable {

	public static void main(String[] args) {
		MyScanner scan = new MyScanner();
		String nombre = scan.pedirTexto("Introduzca el nombre de la persona: ");
		int edad = scan.pedirInt("Introduzca la edad de la persona: ");
		char sexo = scan.pedirCaracter("Introduzca el sexo de la persona: ");
		double peso = scan.pedirDouble("Introduzca el peso de la persona: ");
		double altura = scan.pedirDouble("Introduzca la altura de la persona: ");
		
		Persona primeraPersona = new Persona(nombre, edad, sexo, peso, altura);
		Persona segundaPersona = new Persona(nombre, edad, sexo);
		Persona terceraPersona = new Persona();
		
		primeraPersona.pesoIdeal();
		segundaPersona.pesoIdeal();
		terceraPersona.pesoIdeal();
		
		System.out.println("La persona con DNI: " + primeraPersona.getDNI() + " es mayor de edad: " + primeraPersona.esMayorDeEdad());
		System.out.println("La persona con DNI: " + segundaPersona.getDNI() + " es mayor de edad: " + segundaPersona.esMayorDeEdad());
		System.out.println("La persona con DNI: " + terceraPersona.getDNI() + " es mayor de edad: " + terceraPersona.esMayorDeEdad());
		
		System.out.println(primeraPersona.toString());
		System.out.println(segundaPersona.toString());
		System.out.println(terceraPersona.toString());
		
		
	}
	
}
