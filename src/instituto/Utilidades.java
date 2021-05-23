package instituto;

public class Utilidades {
	//Atributos



	//Metodos
	public static Estudiante generarEstudiante() {
		String[] nombres = {"Mario", "Yerai", "Evek", "Carmen", "Jhon", "Manolo"};
		char[] sexo = {'F', 'M'};
		int numeroDeNombre = (int)(Math.random()*5);
		if (numeroDeNombre == 2 || numeroDeNombre == 3) {
			return new Estudiante(nombres[numeroDeNombre], (int)(Math.random()*(10-18+1)+18), sexo[0], generarAsignaturas());
		}
		else {
			return new Estudiante(nombres[numeroDeNombre], (int)(Math.random()*(10-18+1)+18), sexo[1], generarAsignaturas());
		}
	}
	public static String[] generarAsignaturas() {
		String[] asignaturas= {"Matematicas", "Fisica", "Fisica y quimica", "Filosofia", "Lengua castellana", "Ingles", "Historia", "Tecnologias de la informacion y la comunicacion"};
		String[] asignaturasGeneradas = new String[5];
		for (int i = 0; i<5; i++) {
			int numeroAsignaturaAleatorio = (int) (Math.random()+asignaturas.length-1);
			asignaturasGeneradas[i] = asignaturas[numeroAsignaturaAleatorio];
			asignaturas = eliminarAsignatura(asignaturas, asignaturasGeneradas[i]);
		}
		return asignaturasGeneradas;

	}
	public static String[] eliminarAsignatura(String[] array, String s) 	{
		String[] arrayAuxiliar = new String[array.length-1];
		for (int i = 0; i < array.length; i++) {
			if (!array[i].equalsIgnoreCase(s)) {
				arrayAuxiliar[i] = array[i];
			}
		}
		return arrayAuxiliar;
	}
	public static Estudiante[] generarAlumnosParaClase(int numeroTotal, Estudiante[] alumnado) {
		int numeroGenerados = 0;
		Estudiante[] alumnosGenerados = new Estudiante[numeroTotal];
		for (int i = ((int)(Math.random()+alumnado.length-numeroTotal)); i < alumnado.length; i++) {
			alumnosGenerados[numeroGenerados] = alumnado[i];
			numeroGenerados++;
			if (numeroGenerados == numeroTotal) {
				break;				
			}
		}
		return alumnosGenerados;
	}

}
