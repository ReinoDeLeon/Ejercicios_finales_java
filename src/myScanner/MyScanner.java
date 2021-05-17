package myScanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyScanner {
	Scanner scan = new Scanner(System.in);
	
	//Metodos
	public int pedirInt(String mensajePedirPorPantalla) {
		boolean obtenidoResultado = false;
		int numeroPedido = 0;
		while (!obtenidoResultado) {
			try {
				System.out.println(mensajePedirPorPantalla);
				numeroPedido = scan.nextInt();
				scan.nextLine();
				obtenidoResultado = true;
			}
			catch (InputMismatchException e) {
				System.out.println("El valor introducido no es válido o no es un entero\n");
				scan.nextLine();
			}
		}
		return Math.abs(numeroPedido);
	}
	public double pedirDouble(String mensajePedirPorPantalla) {
		boolean obtenidoResultado = false;
		double numeroPedido = 0;
		while (!obtenidoResultado) {
			try {
				System.out.println(mensajePedirPorPantalla);
				numeroPedido = scan.nextDouble();
				scan.nextLine();
				obtenidoResultado = true;
			}
			catch (InputMismatchException e) {
				System.out.println("El valor introducido no es válido o no es un entero con decimales\nEl formato es: ##,##\n");
				scan.nextLine();
			}
		}
		return Math.abs(numeroPedido);
	}
	public String pedirTexto(String mensajePedirPorPantalla) {
		System.out.println(mensajePedirPorPantalla);
		return scan.nextLine();
	}
	public char pedirCaracter(String mensajePedirPorPantalla) {
		System.out.println(mensajePedirPorPantalla);
		return scan.next().charAt(0);
	}
}