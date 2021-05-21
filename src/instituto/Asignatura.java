package instituto;

public class Asignatura {

	
	//Atributos
	private static String[] asignaturasDisponibles = {"Matematicas", "Fisica", "Fisica y quimica", "Filosofia", "Lengua castellana", "Ingles", "Historia", "Tecnologias de la informacion y la comunicacion"};
	//Constructores
	
	//Getters
	
	//Setters

	//Metodos
	public static boolean asignaturaDisponible(String s) {
		for (String asignatura : asignaturasDisponibles) {
			if (s.equalsIgnoreCase(asignatura)) {
				return true;
			}
		}
		return false;
	}
	public static boolean asignaturaDisponible(String[] s) {
		for (String asignatura : asignaturasDisponibles) {
			for (String string : s) {
				if (string.equalsIgnoreCase(asignatura)) {
					return true;
				}
			}
		}
		return false;
	}
}
