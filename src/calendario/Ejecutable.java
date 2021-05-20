package calendario;

import java.util.Calendar;

import myScanner.MyScanner;

public class Ejecutable {
	public static void main(String[] args) {
		MyScanner scan 			= new MyScanner();
		int mes					= Calendar.getInstance().get(Calendar.MONTH)+1;
		int anno					= Calendar.getInstance().get(Calendar.YEAR);
		Calendario calendario 	= new Calendario(mes, anno);
		String opcionUsuario  	= "";
		
		//Para el mes actual
		System.out.println("---------------------------");
		Calendario.imprimirCalendario(calendario);
		while (!opcionUsuario.equalsIgnoreCase("Salir")) {
			System.out.println("---------------------------");
			opcionUsuario = scan.pedirTexto("A/D (\"salir\" para cerrar el programa)--> ");
			if (opcionUsuario.equalsIgnoreCase("Salir")) {
				System.out.println("Cerrando programa.");
			}
			else if (opcionUsuario.equalsIgnoreCase("a")){
				mes--;
				if (mes <= 0) {
					mes = 12;
					anno--;
				}
				System.out.println("---------------------------");
				Calendario.imprimirCalendario(new Calendario(mes, anno));
			}
			else if (opcionUsuario.equalsIgnoreCase("d")) {
				mes++;
				if (mes == 13) {
					mes = 1;
					anno++;
				}
				System.out.println("---------------------------");
				Calendario.imprimirCalendario(new Calendario(mes, anno));
			}
			else {
				System.out.println("Opción no reconocida, escriba Salir para cerrar el programa o A para retroceder en el calendario o D para avanzar");
			}
		}
		

	}
}
